package com.robovmx.idea

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.LineMarkerProvider
import com.intellij.icons.AllIcons
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.psi.PsiElement
import com.intellij.util.Function
import org.jetbrains.kotlin.analysis.api.analyze
import org.jetbrains.kotlin.analysis.api.symbols.KaNamedFunctionSymbol
import org.jetbrains.kotlin.idea.base.plugin.KotlinPluginMode
import org.jetbrains.kotlin.idea.base.plugin.KotlinPluginModeProvider
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.KtNamedFunction

class UnsafeRunLineMarkerProvider : LineMarkerProvider {
    override fun getLineMarkerInfo(element: PsiElement): LineMarkerInfo<*>? {
        // attach marker only to identity element if its parent is kotlin function
        val function = (element.parent as? KtNamedFunction)
            ?.takeIf { it.identifyingElement == element }
            ?: return null
        if (!function.isRunnable()) return null

        val icon = AllIcons.RunConfigurations.TestState.Run_run
        return LineMarkerInfo(
            element,
            element.textRange,
            icon,
            Function { "Unsafe! Run ${function.name}, draw UI, if returned" },
            { _, elt -> runMyFunction(elt) },
            GutterIconRenderer.Alignment.RIGHT,
            { "Run UI Function" }
        )
    }

    private fun KtNamedFunction.isRunnable(): Boolean {
        return if (KotlinPluginModeProvider.currentPluginMode == KotlinPluginMode.K2)
            analyze(this) {
                val symbol = this@isRunnable.symbol as? KaNamedFunctionSymbol ?: return@analyze false
                !symbol.isSuspend &&
                    symbol.receiverParameter == null &&
                    symbol.valueParameters.isEmpty()
            }
        else {
            !this.hasModifier(KtTokens.SUSPEND_KEYWORD) &&
                this.receiverTypeReference == null &&
                this.valueParameters.isEmpty()
        }
    }

    private fun runMyFunction(element: PsiElement) {
        val function = (element.parent as? KtNamedFunction)
            ?.takeIf { it.identifyingElement == element }
            ?: return

        UnsafeRunFunctionRunner.runFunction(function)
    }
}

