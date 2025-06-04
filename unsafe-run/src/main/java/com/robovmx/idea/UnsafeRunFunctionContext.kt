@file:Suppress("UnstableApiUsage")

package com.robovmx.idea

import ai.grazie.utils.capitalize
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import org.jetbrains.kotlin.analysis.api.KaSession
import org.jetbrains.kotlin.analysis.api.analyze
import org.jetbrains.kotlin.analysis.api.annotations.KaAnnotationValue
import org.jetbrains.kotlin.analysis.api.symbols.KaClassKind
import org.jetbrains.kotlin.analysis.api.symbols.KaClassSymbol
import org.jetbrains.kotlin.analysis.api.symbols.KaNamedFunctionSymbol
import org.jetbrains.kotlin.idea.base.plugin.KotlinPluginMode
import org.jetbrains.kotlin.idea.base.plugin.KotlinPluginModeProvider
import org.jetbrains.kotlin.idea.base.util.module
import org.jetbrains.kotlin.psi.KtClassOrObject
import org.jetbrains.kotlin.psi.KtFile
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

/**
 * WARNING: should be called in read action
 */
internal fun KtNamedFunction.getRunContext(): UnsafeRunFunctionContext {
    // gather all required data
    val module = this.module ?: throw IllegalStateException("Function is not attached to module")
    val project = this.project
    val jvmMethodName = this.name ?: throw IllegalStateException("Function name is missing")

    // find out static or instance invocation expected, and fully qualified class name
    val (jvmClassName, jvmIsInstanceMethod) = if (KotlinPluginModeProvider.currentPluginMode == KotlinPluginMode.K2)
        resolveClassK2Mode() else resolveClassK1Mode()
    return UnsafeRunFunctionContext(
        function = this,
        module = module,
        project = project,
        jvmMethodName = jvmMethodName,
        jvmClassName = jvmClassName,
        jvmIsInstanceMethod = jvmIsInstanceMethod
    )
}

/**
 * K1 version. Resolves jvm class name function is going to be compiled within.
 * @return class name to isInstance status
 */
private fun KtNamedFunction.resolveClassK1Mode(): Pair<String, Boolean> {
    // find out static or instance invocation expected, and fully qualified class name
    val ktFile = this.containingKtFile
    val packageFqName = ktFile.packageFqName.asString() // e.g., "com.example"
    var jvmClassName: String
    val jvmIsInstanceMethod: Boolean
    this.getStrictParentOfType<KtClassOrObject>().let { classOrObject ->
        when {
            // static method in companion object
            classOrObject is KtObjectDeclaration && classOrObject.isCompanion() && this.annotationEntries.any { it.shortName?.asString() == "JvmStatic" } -> {
                jvmIsInstanceMethod = false
                jvmClassName = classOrObject.fqName?.parent()?.asString()?.toJvmFqn(packageFqName)
                    ?: throw IllegalStateException("Unable resolve Companion owner")
            }

            classOrObject != null -> {
                // member of class, object or companion object that should be called on instance
                jvmIsInstanceMethod = true
                jvmClassName = classOrObject.fqName?.asString()?.toJvmFqn(packageFqName)
                    ?: throw IllegalStateException("Cannot resolve class")
            }

            else -> {
                // function declared in kotlin file directly
                jvmIsInstanceMethod = false
                jvmClassName = ktFile.toJvmClassName()
            }
        }
    }

    return jvmClassName to jvmIsInstanceMethod
}

/**
 * K2 version. Resolves jvm class name function is going to be compiled within.
 * @return class name to isInstance status
 */
private fun KtNamedFunction.resolveClassK2Mode(): Pair<String, Boolean> = analyze(this) {
    val ktFile = this@resolveClassK2Mode.containingKtFile
    val packageFqName = ktFile.packageFqName.asString() // e.g., "com.example"
    val functionSymbol = this@resolveClassK2Mode.symbol as? KaNamedFunctionSymbol
        ?: throw IllegalStateException("Not a function symbol")
    val classOrObject = functionSymbol.containingSymbol as? KaClassSymbol

    // find out static or instance invocation expected, and fully qualified class name
    var jvmClassName: String
    val jvmIsInstanceMethod: Boolean
    when {
        classOrObject?.classKind == KaClassKind.COMPANION_OBJECT && functionSymbol.hasAnnotation("kotlin.jvm.JvmStatic") -> {
            // static method in companion object
            jvmIsInstanceMethod = false
            jvmClassName = classOrObject.containingSymbol
                ?.let { it as? KaClassSymbol }
                ?.classId?.asFqNameString()?.toJvmFqn(packageFqName)
                ?: throw IllegalStateException("Unable resolve Companion owner")
        }

        classOrObject != null -> {
            // member of class, object or companion object that should be called on instance
            jvmIsInstanceMethod = true
            jvmClassName = classOrObject.classId?.asFqNameString()?.toJvmFqn(packageFqName)
                ?: throw IllegalStateException("Cannot resolve class")
        }

        else -> {
            // function declared in kotlin file directly
            jvmIsInstanceMethod = false
            jvmClassName = toJvmClassName(ktFile)
        }
    }

    return jvmClassName to jvmIsInstanceMethod
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

/**
 * K2 annotation check on function
 */
private fun KaNamedFunctionSymbol.hasAnnotation(fqName: String) =
    annotations.any { it.classId?.asFqNameString() == fqName }

/**
 * K1 version to evaluate class name functions of file will go to
 */
private fun KtFile.toJvmClassName(): String {
    // function declared in kotlin file directly

    val packageFqName = packageFqName.asString() // e.g., "com.example"
    val fileName = name.substringBeforeLast(".").capitalize() // e.g., "Utils"

    // file might be annotated with `@file:JvmName`, pick class name from there, else use "${FileName}.kt"
    val jvmClassName = annotationEntries.firstOrNull { it.shortName?.asString() == "JvmName" }
        ?.valueArguments?.firstOrNull()?.getArgumentExpression()?.text?.removeSurrounding("\"")
        ?: run { "${fileName}Kt" }
    return if (packageFqName.isNotEmpty()) "$packageFqName.${jvmClassName}" else jvmClassName
}


/**
 * K2 version to evaluate class name functions of file will go to
 */
private fun KaSession.toJvmClassName(ktFile: KtFile): String {
    val packageFqName = ktFile.packageFqName.asString() // e.g., "com.example"
    val jvmClassName = ktFile.symbol.annotations.firstOrNull { it.classId?.asFqNameString() == "kotlin.jvm.JvmName" }
        ?.arguments?.firstOrNull()?.expression?.let { it as? KaAnnotationValue.ConstantValue }
        ?.value?.toString()?.removeSurrounding("\"")
        ?: run { "${ktFile.name}Kt" }
    return if (packageFqName.isNotEmpty()) "$packageFqName.${jvmClassName}" else jvmClassName
}
