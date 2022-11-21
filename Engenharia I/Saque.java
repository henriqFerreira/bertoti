public class Saque implements ITransacao {
    double valor;
    IConta destinatario;

    public Saque(IConta destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void realizarTransacao(double valor) {
        destinatario.setSaldo(destinatario.getSaldo() - valor);
        this.valor = valor;
    }
}
