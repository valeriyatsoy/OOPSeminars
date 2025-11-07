public class Customer implements Payable {
    private String name;
    private String contactNumber;
    private boolean hasActiveOrder = false;

    public Customer(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) return;
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        if (contactNumber.isEmpty()) return;
        this.contactNumber = contactNumber;
    }

    public void startOrder() {
        hasActiveOrder = true;
    }

    public void completeOrder() {
        hasActiveOrder = false;
    }

    public void printCustomerDetails() {
        System.out.println("Name: " + name + ", Contact: " + contactNumber +
                ", Active Order: " + hasActiveOrder);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Customer " + name + " paid: $" + amount);
    }
}
