public class Deposito implements ITransacao {
    double valor;
    IConta destinatario;

    public Deposito(IConta destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void realizarTransacao(double valor) {
        destinatario.setSaldo(destinatario.getSaldo() + valor);
        this.valor = valor;
    }
}
