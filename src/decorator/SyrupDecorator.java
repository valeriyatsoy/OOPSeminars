package decorator;

public class SyrupDecorator extends CoffeeDecorator {

    private final String flavor;
    private final double syrupCost;

    public SyrupDecorator(ICoffee decoratedCoffee, String flavor) {
        super(decoratedCoffee);
        this.flavor = flavor;
        // different syrups could cost differently — keep simple
        this.syrupCost = 0.50;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", " + flavor + " syrup";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + syrupCost;
    }
}

