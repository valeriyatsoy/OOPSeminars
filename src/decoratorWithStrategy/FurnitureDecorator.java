package decoratorWithStrategy;

public abstract class FurnitureDecorator implements IFurniture {

    protected IFurniture furniture;

    public FurnitureDecorator(IFurniture furniture) {
        this.furniture = furniture;
    }

    @Override
    public String getDescription() {
        return furniture.getDescription();
    }

    @Override
    public double getCost() {
        return furniture.getCost();
    }
}
