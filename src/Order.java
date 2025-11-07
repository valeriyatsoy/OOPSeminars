import java.util.ArrayList;

class Order {
    private Customer customer;
    ArrayList<MenuItem> menuItems;
    private double totalPrice;

    public Order(Customer customer, ArrayList<MenuItem> menuItems) {
        this.customer = customer;
        this.menuItems = menuItems;
        this.totalPrice = calculateTotalPrice();
    }

    public double calculateTotalPrice (){
        double totalPrice = 0;
        for (MenuItem item: menuItems){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void printOrderDetails() {
        System.out.println("Customer: " + customer.getName());
        for (MenuItem item: menuItems){
            item.printItemDetails();
        }
        System.out.println("Total Cost: $" + totalPrice);
    }
}