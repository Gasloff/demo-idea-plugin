package com.example.demo.startup;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.NotificationGroupManager;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import org.jetbrains.annotations.NotNull;

public class DemoStartupActivity implements StartupActivity {
    public static final NotificationGroup DEMO_GROUP
            = NotificationGroupManager.getInstance().getNotificationGroup("demoGroup");

    @Override
    public void runActivity(@NotNull Project project) {
        Notification myNotification = DEMO_GROUP
                .createNotification("Demo startup message", NotificationType.INFORMATION);
        myNotification.notify(project);
    }
}
