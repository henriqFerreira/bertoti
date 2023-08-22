package classes;

import interfaces.IProduto;

public class Technology implements IProduto {
    @Override
    public void update() {
        System.out.println("Technology notification received!");
    }
}
