@file:Suppress("UnstableApiUsage")

package com.robovmx.idea

import com.intellij.execution.impl.ConsoleViewImpl
import com.intellij.execution.ui.ConsoleView
import com.intellij.openapi.application.invokeAndWaitIfNeeded
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowAnchor
import com.intellij.openapi.wm.ToolWindowManager
import com.intellij.ui.content.ContentFactory
import java.awt.Component
import javax.swing.JComponent
import javax.swing.JPanel


internal const val UnsafeRunToolWindowId = "Unsafe Run"

internal fun Project.getUnsafeRunToolWindow(): ToolWindow = invokeAndWaitIfNeeded {
    val toolWindowManager = ToolWindowManager.getInstance(this)
    val toolWindow = toolWindowManager.getToolWindow(UnsafeRunToolWindowId)
        ?: toolWindowManager.registerToolWindow(UnsafeRunToolWindowId, true, ToolWindowAnchor.BOTTOM)
    // remove all content
    toolWindow.contentManager.removeAllContents(true)

    toolWindow
}

internal fun ToolWindow.addConsoleView(): ConsoleView = invokeAndWaitIfNeeded {
    val contentFactory = ContentFactory.getInstance()
    val consoleView = ConsoleViewImpl(project, true)
    val content = contentFactory.createContent(consoleView.component, "Output", false)
    contentManager.addContent(content)
    contentManager.setSelectedContent(content)
    show()

    consoleView
}

internal fun ToolWindow.attachUiPreview(component: Component) = invokeAndWaitIfNeeded {
    val contentFactory = ContentFactory.getInstance()
    val jcomponent = if (component is JComponent) component else JPanel().apply { add(component) }
    val content = contentFactory.createContent(jcomponent, "UI Preview", false)

    contentManager.addContent(content)
    contentManager.setSelectedContent(content)
    show()
}
