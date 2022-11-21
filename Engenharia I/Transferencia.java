public class Transferencia implements ITransacao {
    double valor;
    IConta remetente;
    IConta destinatario;

    public Transferencia(IConta remetente, IConta destinatario) {
        this.remetente = remetente;
        this.destinatario = destinatario;
    }

    @Override
    public void realizarTransacao(double valor) {
        remetente.setSaldo(remetente.getSaldo() - valor);
        destinatario.setSaldo(destinatario.getSaldo() + valor);
        this.valor = valor;
    }
}
