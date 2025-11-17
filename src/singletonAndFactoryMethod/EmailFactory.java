package singletonAndFactoryMethod;

public class EmailFactory extends NotificationFactory{
    @Override
    public INotification createNotification() {
        return new EmailNotification();
    }
}
