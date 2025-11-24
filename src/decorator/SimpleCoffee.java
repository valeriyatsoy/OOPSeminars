package decorator;

public class SimpleCoffee implements ICoffee{
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 2.00; // base price in dollars
    }
}
