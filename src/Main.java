public class Main {
    public static void main(String[] args) {
        Order order = new Order("1");
        Food spaghetti = new Food("1", "Spaghetti", 12.00, true, 0.50, 15);
        Beverage latte = new Beverage("1", "Latte", 4.50, false, 0.50, true);
        Food salad = new Food("1", "Salad", 7.50, false, 0.50, 10);
        order.addItem(spaghetti);
        order.addItem(latte);
        order.addItem(salad);
        order.displayOrderSummary();
    }
}