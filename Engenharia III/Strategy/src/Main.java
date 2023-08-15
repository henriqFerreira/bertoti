import classes.Passageiro;
import classes.PassagemNormal;
import classes.PassagemPremium;

public class Main {
    public static void main(String[] args) {
        Passageiro passageiro_1 = new Passageiro("João");
        passageiro_1.setPassagem(new PassagemNormal());
        passageiro_1.fazerDesconto();

        passageiro_1.setPassagem(new PassagemPremium());
        passageiro_1.fazerDesconto();
    }
}