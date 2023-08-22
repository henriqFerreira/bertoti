package classes;

import interfaces.IProduto;

public class Technology implements IProduto {
    @Override
    public void _notify() {
        System.out.println("Technology notification received!");
    }
}
