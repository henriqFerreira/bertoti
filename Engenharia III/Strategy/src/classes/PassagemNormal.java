package classes;

import interfaces.IPassagem;

public class PassagemNormal implements IPassagem {
    public void gerarDesconto() {
        System.out.println("Desconto aplicado para passagem normal!");
    }
}
