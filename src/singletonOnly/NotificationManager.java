package singletonOnly;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
    private static NotificationManager instance;
    private final List<Notification> notifications = new ArrayList<>();

    private NotificationManager() {}

    public static /*synchronized*/ NotificationManager getInstance() {
        if (instance == null) {
            instance = new NotificationManager();
        }
        return instance;
    }

    public void addNotification(Notification n) {
        notifications.add(n);
        System.out.println("Added notification: " + n.getClass().getSimpleName());
    }

    public void sendAll(String message) {
        for (Notification n : notifications) {
            n.send(message);
        }
    }

    public int count() {
        return notifications.size();
    }
}
