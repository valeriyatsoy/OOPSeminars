package observer;

public interface IStockSubject {
    void addObserver(IStockObserver o);
    void removeObserver(IStockObserver o);
    void notifyObservers();
}
