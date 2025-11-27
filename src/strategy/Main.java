package strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.executePayment(50);

        context.setStrategy(new PayPalPayment());
        context.executePayment(75);

        context.setStrategy(new CryptoPayment());
        context.executePayment(120);
    }
}
