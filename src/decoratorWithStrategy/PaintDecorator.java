package decoratorWithStrategy;

public class PaintDecorator extends FurnitureDecorator {

    private boolean painted;
    private String color;

    public PaintDecorator(IFurniture furniture, String color) {
        super(furniture);
        this.painted = true;
        this.color = color;
    }

    public boolean isPainted() {
        return painted;
    }

    @Override
    public String getDescription() {
        return furniture.getDescription() + ", Painted";
    }

    @Override
    public double getCost() {
        return furniture.getCost() + 15.0;
    }
}
