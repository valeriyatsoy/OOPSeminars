package singletonAndFactoryMethod;

public class SMSNotification implements INotification{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
