package decoratorWithStrategy;

public class MaterialDecorator extends FurnitureDecorator {

    private Material material;

    public MaterialDecorator(IFurniture furniture, Material material) {
        super(furniture);
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public String getDescription() {
        return furniture.getDescription() + ", Material: " + material;
    }

    @Override
    public double getCost() {
        switch (material) {
            case WOOD: return furniture.getCost() + 40;
            case METAL: return furniture.getCost() + 60;
            default: return furniture.getCost() + 20;
        }
    }
}
