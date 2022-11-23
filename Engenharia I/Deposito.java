public class Deposito implements ITransacao {
    String dataAtual;
    double valor;
    IConta destinatario;

    public Deposito(IConta destinatario, double valor, String dataAtual) {
        this.destinatario = destinatario;
        this.valor = valor;
        this.dataAtual = dataAtual;
    }

    @Override
    public void realizarTransacao() {
        destinatario.setSaldo(destinatario.getSaldo() + valor);
        destinatario.addToExtrato(new Deposito(this.destinatario, this.valor, this.dataAtual));
    }

    @Override
    public String toString() {
        String texto = """
                Destinatário: %s
                Valor da transação: %s
                Data da transação: %s
                """;
        return String.format(texto, this.destinatario.getNumConta(), this.valor, this.dataAtual);
    }
}
