package classes;

import interfaces.IObserver;

public class Food implements IObserver {
    @Override
    public void update() {
        System.out.println("Food notification received!");
    }
}
