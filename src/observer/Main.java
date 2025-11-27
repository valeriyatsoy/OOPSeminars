package observer;
import observer.Stock;

public class Main {
    public static void main(String[] args) {
        Stock apple = new Stock();

        apple.addObserver(new PriceDisplay());
        apple.addObserver(new PriceAlert(100));
        apple.addObserver(new PriceLogger());

        apple.setPrice(90.5);
        apple.setPrice(101.3);
        apple.setPrice(97.8);
    }
}
