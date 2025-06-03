package com.robovmx.idea

import ai.grazie.utils.capitalize
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import org.jetbrains.kotlin.idea.base.util.module
import org.jetbrains.kotlin.psi.KtClassOrObject
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtObjectDeclaration
import org.jetbrains.kotlin.psi.psiUtil.getStrictParentOfType

/**
 * Context of KT function. All data to be captured during Read action and
 * to be used later in background task
 */
internal data class UnsafeRunFunctionContext(
    val function: KtNamedFunction,
    val module: Module,
    val project: Project,
    val jvmMethodName: String,
    val jvmClassName: String,
    val jvmIsInstanceMethod: Boolean
)

internal fun KtNamedFunction.runWithContext(action: (UnsafeRunFunctionContext) -> Unit) {
    // gather all required data
    val module = this.module ?: throw IllegalStateException("Function is not attached to module")
    val project = this.project

    val jvmMethodName = this.name ?: throw IllegalStateException("Function name is missing")
    val ktFile = this.containingKtFile
    val packageFqName = ktFile.packageFqName.asString() // e.g., "com.example"
    val fileName = ktFile.name.substringBeforeLast(".").capitalize() // e.g., "Utils"

    // find out static or instance invocation expected, and fully qualified class name
    var jvmClassName: String
    val jvmIsInstanceMethod: Boolean
    this.getStrictParentOfType<KtClassOrObject>().let { classOrObject ->
        when {
            classOrObject is KtObjectDeclaration && classOrObject.isCompanion() && this.annotationEntries.any { it.shortName?.asString() == "JvmStatic" } -> {
                jvmIsInstanceMethod = false
                jvmClassName = classOrObject.fqName?.parent()?.asString()?.toJvmFqn(packageFqName)
                    ?: throw IllegalStateException()
            }

            classOrObject != null -> {
                // member of class, object or companion object that should be called on instance
                jvmIsInstanceMethod = true
                jvmClassName = classOrObject.fqName?.asString()?.toJvmFqn(packageFqName)
                    ?: throw IllegalStateException()
            }

            else -> {
                // function declared in kotlin file directly
                jvmIsInstanceMethod = false
                // file might be annotated with `@file:JvmName`, pick class name from there, else use "${FileName}.kt"
                jvmClassName = ktFile.annotationEntries.firstOrNull { it.shortName?.asString() == "JvmName" }
                    ?.valueArguments?.firstOrNull()?.getArgumentExpression()?.text?.removeSurrounding("\"")
                    ?: run { "${fileName}Kt" }
                jvmClassName = if (packageFqName.isNotEmpty()) "$packageFqName.${jvmClassName}" else jvmClassName
            }
        }
    }

    val ctx = UnsafeRunFunctionContext(
        function = this,
        module = module,
        project = project,
        jvmMethodName = jvmMethodName,
        jvmClassName = jvmClassName,
        jvmIsInstanceMethod = jvmIsInstanceMethod
    )
    action(ctx)
}

/**
 * converts kotlin path to JVM one, by replacing internal '.' separators with '$'
 * e.g.
 * com.sample.MyCls.Companion.OtherCls.Companion -> com.sample.MyCls$Companion$OtherCls$Companion
 */
private fun String.toJvmFqn(pkg: String): String {
    return if (startsWith("$pkg.")) return pkg + '.' + substring(pkg.length + 1).replace('.', '$')
    else this
}
