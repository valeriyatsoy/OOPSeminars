package decorator;

//client code
public class CoffeeShop {
    public void serve(ICoffee coffee) {
        System.out.println("Order: " + coffee.getDescription());
        System.out.printf("Total: $%.2f%n", coffee.getCost());
    }
}
