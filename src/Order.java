import java.util.ArrayList;
import java.util.List;

// Order class
class Order {
    private String orderId;
    private List<MenuItem> items; //null by default, might cause a NullPointerException

    public String getOrderId() {
        return orderId;
    }

    public Order(String orderId) {
        this.orderId = orderId;
        items = new ArrayList<>(); //need to initialize to an empty list
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    public void displayOrderSummary() {
        System.out.println("Order Details:");
        int index = 1;
        for (MenuItem item : items) {
            System.out.print(index++ + ". ");
            item.displayDetails(); // Polymorphism in action
        }
        System.out.println("---------------------------------");
        System.out.println("Total: $" + String.format("%.2f",
                calculateTotal()));
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.calculatePrice(); // Polymorphism in action
        }
        return total;
    }
}