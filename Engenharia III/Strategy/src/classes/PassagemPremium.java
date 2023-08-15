package classes;

import interfaces.IPassagem;

public class PassagemPremium implements IPassagem {
    public void gerarDesconto() {
        System.out.println("Desconto aplicado para passagem premium!");
    }
}
