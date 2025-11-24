package decorator;

public class CreamDecorator extends CoffeeDecorator {

    private final int pumps;      // amount of cream units
    private final double unitCost; // cost per pump

    public CreamDecorator(ICoffee decoratedCoffee, int pumps) {
        super(decoratedCoffee);
        this.pumps = pumps;
        this.unitCost = 0.30;
    }

    @Override
    public String getDescription() {
        String desc = decoratedCoffee.getDescription() + ", cream";
        if (pumps > 1) desc += " (" + pumps + " pumps)";
        return desc;
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + pumps * unitCost;
    }
}

