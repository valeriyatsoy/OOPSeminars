package observer;

public class PriceAlert implements IStockObserver {
    private double threshold;

    public PriceAlert(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public void update(double price) {
        if (price > threshold) {
            System.out.println("ALERT: price above threshold! (" + price + ")");
        }
    }
}
