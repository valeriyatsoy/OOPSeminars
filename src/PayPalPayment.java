public class PayPalPayment extends PaymentMethod {

    public PayPalPayment(String accountId) {
        super(accountId);
    }

    @Override
    public void pay(double amount) throws PaymentException {
        if (amount <= 0) throw new PaymentException("Invalid payment amount.");
        System.out.println("Payment of $" + amount + " made via PayPal [" + accountId + "]");
    }
}