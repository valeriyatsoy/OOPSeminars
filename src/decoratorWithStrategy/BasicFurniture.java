package decoratorWithStrategy;

public class BasicFurniture implements IFurniture {

    @Override
    public String getDescription() {
        return "Basic Furniture";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}
