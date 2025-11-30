package decoratorWithStrategy;

import strategy.*;

public class Main {
    public static void main(String[] args) {

        IFurniture furniture = new BasicFurniture();
        furniture = new MaterialDecorator(furniture, Material.WOOD);
        furniture = new PaintDecorator(furniture, "white");  // painted

        System.out.println(furniture.getDescription());
        System.out.println("Cost: " + furniture.getCost());

        PaymentStrategy strategy = PaymentSelector.selectPayment(furniture);
        strategy.pay(furniture.getCost());
    }
}
