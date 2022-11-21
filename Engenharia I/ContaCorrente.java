import java.util.List;

class ContaCorrente implements IConta {
    private double taxa;
    private double saldo;
    private String numConta;
    private Agencia agencia;
    private List<ITransacao> extrato;

    public ContaCorrente(String numConta, double saldo, Agencia agencia, double taxa) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.agencia = agencia;
        this.taxa = taxa;
    }

    @Override
    public List<ITransacao> getExtrato() {
        return this.extrato;
    }

    @Override
    public void addToExtrato(ITransacao transacao) {
        extrato.add(transacao);
    }

    @Override
    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    @Override
    public String getNumConta() {
        return this.numConta;
    }

    @Override
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    @Override
    public Agencia getAgencia() {
        return this.agencia;
    }

    public double getTaxa() {
        return taxa;
    }
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    public void aplicarTaxa(double taxa) {}
}