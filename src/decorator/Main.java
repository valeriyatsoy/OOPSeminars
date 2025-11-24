package decorator;


public class Main {
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();

        // 1) Simple coffee
        ICoffee simple = new SimpleCoffee();
        shop.serve(simple);
        System.out.println();

        // 2) Simple coffee with vanilla syrup
        ICoffee vanilla = new SyrupDecorator(new SimpleCoffee(), "vanilla");
        shop.serve(vanilla);
        System.out.println();

        // 3) Simple coffee with 2 pumps of cream
        ICoffee creamTwo = new CreamDecorator(new SimpleCoffee(), 2);
        shop.serve(creamTwo);
        System.out.println();

        // 4) Stacked: vanilla syrup + 1 pump cream
        ICoffee fancy = new CreamDecorator(new SyrupDecorator(new SimpleCoffee(), "vanilla"), 1);
        shop.serve(fancy);
        System.out.println();

        // 5) Different order: cream then syrup (should produce same combined effect but different construction)
        ICoffee fancy2 = new SyrupDecorator(new CreamDecorator(new SimpleCoffee(), 1), "hazelnut");
        shop.serve(fancy2);
    }

}