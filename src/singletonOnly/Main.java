package singletonOnly;

public class Main {
    public static void main(String[] args) {
        NotificationManager manager = NotificationManager.getInstance();
        manager.addNotification(new Notification()); //same method
        System.out.println("Total notifications: " + manager.count());
        manager.sendAll("Hello! This is a test notification.");
    }
}