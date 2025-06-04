@file:Suppress("UnstableApiUsage")

package com.robovmx.idea

import com.intellij.openapi.application.invokeAndWaitIfNeeded
import com.intellij.openapi.application.invokeLater
import com.intellij.openapi.application.runReadAction
import com.intellij.openapi.compiler.CompilerManager
import com.intellij.openapi.progress.ProgressIndicator
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.progress.Task
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.OrderEnumerator
import org.jetbrains.kotlin.psi.KtNamedFunction
import java.awt.Component
import java.io.File
import java.net.URLClassLoader
import java.util.concurrent.CompletableFuture
import kotlin.concurrent.thread
import kotlin.time.measureTime

internal object UnsafeRunFunctionRunner {

    fun runFunction(function: KtNamedFunction) = runBackgroundTask(function.project) { progress ->
        val ctx = runReadAction { function.getRunContext() }

        // get tool window early to clean it up and focus while busy
        val (toolwindow, consoleView) = invokeAndWaitIfNeeded {
            val toolwindow = ctx.project.getUnsafeRunToolWindow()
            val consoleView = toolwindow.addConsoleView()
            toolwindow to consoleView
        }

        // start build while at EDT
        val future = CompletableFuture<Boolean>()
        invokeAndWaitIfNeeded {
            val compilerManager = CompilerManager.getInstance(ctx.project)
            compilerManager.make(ctx.module) { aborted, errors, _, _ ->
                future.complete(!aborted && errors == 0)
            }
        }

        progress.text = "Building module ${ctx.module.name}"

        // wait for compile result
        if (!future.get()) throw IllegalStateException("Build failed or canceled!")

        // prepare for reflection run (class path, method etc)
        val launchLambda = ctx.prepareReflectionRun()

        // Invoke the function dynamically
        consoleView.captureOutputOf {
            val invokeThread = thread {
                try {
                    progress.text = "Running function ${ctx.jvmMethodName}"
                    println("--- Launching function ${ctx.jvmMethodName}")
                    println("--- JVM class name: ${ctx.jvmClassName}")

                    val result: Any?
                    val executionTime = measureTime { result = launchLambda() }
                    println("--- finished running in $executionTime")
                    if (result is Component) {
                        println("--- result is a AWT UI component, displaying in panel...")
                        invokeLater {
                            toolwindow.attachUiPreview(result)
                        }
                    }
                } catch (e: Exception) {
                    // consider as execution of target function exception, print to output
                    e.printStackTrace()
                }
            }
            // support canceling
            while (invokeThread.isAlive) {
                if (progress.isCanceled) {
                    progress.text = "Canceling function ${ctx.jvmMethodName}"
                    invokeThread.interrupt()
                    break
                }
                Thread.sleep(50)
            }
            invokeThread.join()
        }
    }

    /**
     * prepares for run: fetches class path, loads class and picks module
     * @return lambda that is ready to be invoked to run prepared method
     */
    private fun UnsafeRunFunctionContext.prepareReflectionRun(): () -> Any? {
        // get the module's classpath using OrderEnumerator
        val classPath = OrderEnumerator.orderEntries(module)
            .recursively()
            .pathsList
            .pathsString // Returns all the classpath entries in one string (you can split by path separator)

        // Load and invoke the function
        val urls = classPath.split(File.pathSeparator).map { File(it).toURI().toURL() }.toTypedArray()
        val classLoader = URLClassLoader(urls, this.javaClass.classLoader)
        val clazz = classLoader.loadClass(jvmClassName)
        val instance = if (jvmIsInstanceMethod) {
            val constructor = clazz.getDeclaredConstructor()
            constructor.isAccessible = true
            constructor.newInstance()
        } else null

        val method = clazz.getDeclaredMethod(jvmMethodName)
        method.isAccessible = true

        return { method.invoke(instance) }
    }

    private inline fun runBackgroundTask(
        project: Project,
        crossinline action: (ProgressIndicator) -> Unit
    ) {
        ProgressManager.getInstance().run(object : Task.Backgroundable(project, "Unsafe runner") {
            override fun run(indicator: ProgressIndicator) {
                try {
                    action(indicator)
                } catch (t: Throwable) {
                    // single point of failure that to be reported as balloon
                    // this failure is related to plugin action itself, not to action handled in Function being run
                    // (that kind of error should go to ConsoleView)
                    project.showErrorBallon(t)
                    t.printStackTrace()
                }
            }
        })
    }
}