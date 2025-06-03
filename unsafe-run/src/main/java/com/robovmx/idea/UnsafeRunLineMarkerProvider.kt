package com.robovmx.idea

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.LineMarkerProvider
import com.intellij.icons.AllIcons
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.psi.PsiElement
import com.intellij.util.Function
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.KtNamedFunction

class UnsafeRunLineMarkerProvider : LineMarkerProvider {
    override fun getLineMarkerInfo(element: PsiElement): LineMarkerInfo<*>? {
        // attach marker only to identity element if its parent is kotlin function
        val function = (element.parent as? KtNamedFunction)
            ?.takeIf { it.identifyingElement == element }
            ?: return null
        if (function.hasModifier(KtTokens.SUSPEND_KEYWORD)) return null
        if (function.valueParameters.isNotEmpty()) return null
        if (function.receiverTypeReference != null) return null

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

    private fun runMyFunction(element: PsiElement) {
        val function = (element.parent as? KtNamedFunction)
            ?.takeIf { it.identifyingElement == element }
            ?: return

        UnsafeRunFunctionRunner.runFunction(function)
    }
}

