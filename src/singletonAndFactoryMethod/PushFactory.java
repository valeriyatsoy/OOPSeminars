package singletonAndFactoryMethod;

public class PushFactory extends NotificationFactory{
    @Override
    public INotification createNotification() {
        return new PushNotification();
    }
}
