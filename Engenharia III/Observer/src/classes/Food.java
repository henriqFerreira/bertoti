package classes;

import interfaces.IProduto;

public class Food implements IProduto {
    @Override
    public void update() {
        System.out.println("Food notification received!");
    }
}
