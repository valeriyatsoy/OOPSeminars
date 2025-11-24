package decorator;

public abstract class CoffeeDecorator
        implements ICoffee {
    protected ICoffee decoratedCoffee;

    public CoffeeDecorator(ICoffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }
}