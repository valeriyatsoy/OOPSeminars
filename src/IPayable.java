public interface IPayable {
    void pay(double amount) throws PaymentException;
}