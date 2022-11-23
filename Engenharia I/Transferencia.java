import java.util.List;

public class Transferencia implements ITransacao {
    String dataAtual;
    double valor;
    IConta remetente;
    IConta destinatario;

    public Transferencia(IConta remetente, IConta destinatario, double valor, String dataAtual) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.valor = valor;
        this.dataAtual = dataAtual;
    }

    @Override
    public void realizarTransacao() {
        remetente.setSaldo(remetente.getSaldo() - valor);
        destinatario.setSaldo(destinatario.getSaldo() + valor);

        List<ITransacao> extratoRem = this.remetente.getExtrato();
        extratoRem.add(new Transferencia(this.remetente, this.destinatario, this.valor, this.dataAtual));

        List<ITransacao> extratoDes = this.destinatario.getExtrato();
        extratoDes.add(new Transferencia(this.remetente, this.destinatario, this.valor, this.dataAtual));
    }

    @Override
    public String toString() {
        String texto = """
                Remetente: %s
                Destinatário: %s
                Valor da transferência: %s
                Data da transferência: %s
                """;
        return String.format(texto, this.remetente.getNumConta(), this.destinatario.getNumConta(), this.valor, this.dataAtual);
    }
}
