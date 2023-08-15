package classes;

import interfaces.IPassagem;

public class Passageiro {
    public String name;
    public IPassagem passagem;

    public Passageiro(String name) {
        this.name = name;
    }

    public void setPassagem(IPassagem passagem) {
        this.passagem = passagem;
    }

    public void fazerDesconto() {
        passagem.gerarDesconto();
    }
}
