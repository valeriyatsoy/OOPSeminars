package observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements IStockSubject {
    private double price;
    private List<IStockObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(IStockObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IStockObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IStockObserver o : observers) {
            o.update(price);
        }
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        notifyObservers();
    }
}
