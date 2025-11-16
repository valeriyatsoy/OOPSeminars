public abstract class PaymentMethod implements IPayable {
    protected String accountId;

    public PaymentMethod(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }
}