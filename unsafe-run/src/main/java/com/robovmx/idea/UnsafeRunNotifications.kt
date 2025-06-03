package com.robovmx.idea

import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.NotificationsManager
import com.intellij.openapi.application.invokeLater
import com.intellij.openapi.project.Project

///
/// Common code for notifications/balloons
///

private const val UnsageRunNotificationsId = "UnsafeRunNotificationsId"

internal fun Project.showErrorBallon(message: String) = invokeLater {
    NotificationsManager.getNotificationsManager().showNotification(
        Notification(UnsageRunNotificationsId, "UnsageRun failed!", message, NotificationType.ERROR),
        this
    )
}

internal fun Project.showErrorBallon(t: Throwable) = this.showErrorBallon(t.localizedMessage)
