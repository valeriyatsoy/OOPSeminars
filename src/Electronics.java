public class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(String name, double price, int warrantyMonths) {
        super(name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() { return warrantyMonths; }

    @Override
    public String getDetails() {
        return getName() + " with " + warrantyMonths + " months warranty.";
    }
}