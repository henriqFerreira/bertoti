public class Saque implements ITransacao {
    String dataAtual;
    double valor;
    IConta destinatario;

    public Saque(IConta destinatario, double valor, String dataAtual) {
        this.destinatario = destinatario;
        this.valor = valor;
        this.dataAtual = dataAtual;
    }

    @Override
    public void realizarTransacao() {
        destinatario.setSaldo(destinatario.getSaldo() - valor);
        destinatario.addToExtrato(new Saque(this.destinatario, this.valor, this.dataAtual));
    }

    @Override
    public String toString() {
        String texto = """
                Destinatário: %s
                Valor do saque: %s
                Data da realização do saque: %s
                """;
        return String.format(texto, this.destinatario.getNumConta(), this.valor, this.dataAtual);
    }
}
