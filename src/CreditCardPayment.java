public class CreditCardPayment extends PaymentMethod {

    public CreditCardPayment(String accountId) {
        super(accountId);
    }

    @Override
    public void pay(double amount) throws PaymentException {
        if (amount <= 0) throw new PaymentException("Invalid amount: " + amount);
        if (amount > 5000) throw new PaymentException("Credit limit exceeded!");
        System.out.println("Payment of $" + amount + " made using Credit Card [" + accountId + "]");
    }
}