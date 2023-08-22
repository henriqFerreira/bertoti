package classes;

import java.util.ArrayList;
import java.util.List;
import interfaces.IObserver;

public class Stock {
    private boolean inStock;
    private List<IObserver> observers;

    public Stock() {
        inStock = false;
        observers = new ArrayList<IObserver>();
    }

    public void addObserver(IObserver o) {
        observers.add(o);
    }

    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    public void setInStock(boolean b) {
        inStock = b;

        if (!inStock) return;

        for (IObserver o : observers) {
            o._notify();
        }
    }
}
