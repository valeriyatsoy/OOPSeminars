package observer;

public class PriceDisplay implements IStockObserver {
    @Override
    public void update(double price) {
        System.out.println("Display updated: price = " + price);
    }
}
