package singletonAndFactoryMethod;

public class SubscriptionService {
    // The service doesn't know *how* the notification is created, only that it can
    // It depends on the ABSTRACT factory interface.
    private final NotificationFactory factory;

    public SubscriptionService(NotificationFactory factory) {
        this.factory = factory;
    }

    public void signUp() {
        // The service is decoupled—it just asks the factory to create the product
        INotification welcomeNotification = factory.createNotification();
        welcomeNotification.send("Welcome!");
    }
}