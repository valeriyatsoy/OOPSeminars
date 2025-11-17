package singletonAndFactoryMethod;


public class Main {
    public static void main(String[] args) {
        //direct instantiation is not allowed because constructor is private
        //NotificationManager manager = new NotificationManager();

        NotificationFactory emailFactory = new EmailFactory();
        NotificationFactory smsFactory = new SMSFactory();
        NotificationFactory pushFactory = new PushFactory();

        INotification email = emailFactory.createNotification();
        INotification sms = smsFactory.createNotification();
        INotification push = pushFactory.createNotification();

        NotificationManager manager = NotificationManager.getInstance();

        manager.addNotification(email); //same method
        manager.addNotification(sms);//same method
        manager.addNotification(push);//same method

        System.out.println("Total notifications: " + manager.count());

        manager.sendAll("Hello! This is a test notification.");

        /*The benefit of Factories is not immediately obvious in the main method
        because all the business logic is located inside the Main class.
        But it appears when you start to pass the factory around or when you use a more advanced system
        like Dependency Injection (DI).*/

        //Subscription service

        // For US users, pass the email factory
        SubscriptionService usService = new SubscriptionService(new EmailFactory());
        usService.signUp(); // Creates an EmailNotification

        // For Japan users, pass the SMS factory
        SubscriptionService jpService = new SubscriptionService(new SMSFactory());
        jpService.signUp(); // Creates an SMSNotification

        //Advanced Exercise 4, notification with Builder:
        PushNotificationWithBuilder complexNotification = new PushNotificationWithBuilder.Builder(
                "admin@system.com",
                "Server 1 is reaching 90% CPU usage."
        )
                .withTitle("System Alert!")
                .withPriority(PushNotificationWithBuilder.Priority.HIGH)
                .withIconUrl("/icons/alert.png")
                .build();

    }
}