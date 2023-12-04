package classes;

import interfaces.IObserver;

public class Technology implements IObserver {
    @Override
    public void update() {
        System.out.println("Technology notification received!");
    }
}
