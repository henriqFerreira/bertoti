package classes;

import interfaces.IProduto;

public class Food implements IProduto {
    @Override
    public void _notify() {
        System.out.println("Food notification received!");
    }
}
