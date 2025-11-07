import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Step one:");
        Customer c1 = new Customer("Alice", "123456789");
        Customer c2 = new Customer("Bob", "987654321");
        c1.printCustomerDetails();
        c2.printCustomerDetails();

        System.out.println("Step two:");
        Customer c3 = new Customer("Clara", "555444333");
        c3.printCustomerDetails();
        c3.startOrder();
        c3.printCustomerDetails();

        System.out.println("\nStep three:");
        FoodItem pasta = new FoodItem("Pasta", 9.99, true);
        DrinkItem cola = new DrinkItem("Cola", 2.49, true);
        pasta.printItemDetails();
        cola.printItemDetails();

        System.out.println("\nStep four:");
        Customer c4 = new Customer("David", "777666555");
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        FoodItem pizza = new FoodItem("Pizza", 12.99, false);
        menuItems.add(pizza);
        Order order1 = new Order(c4, menuItems);
        order1.printOrderDetails();

        System.out.println("\nStep five:");
        Waiter waiter = new Waiter("James");
        waiter.serveOrder(order1);
        c4.processPayment(order1.calculateTotalPrice());

        System.out.println("\n" + "Step six:");
        MenuItem[] items = {
                new FoodItem("Salad", 5.99, true),
                new DrinkItem("Coffee", 3.49, false),
                new FoodItem("Steak", 14.99, false),
                new DrinkItem("Juice", 4.25, true)
        };

        for (MenuItem item : items) {
            item.printItemDetails();
        }
    }
}