package observer;

public class PriceLogger implements IStockObserver {
    @Override
    public void update(double price) {
        System.out.println("Logged price: " + price);
    }
}
