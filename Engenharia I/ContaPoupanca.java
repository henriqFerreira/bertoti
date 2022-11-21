import java.util.List;

class ContaPoupanca implements IConta {
    private double saldo;
    private double rendimento;
    private String dataAniv;
    private String numConta;
    private Agencia agencia;
    private List<ITransacao> extrato;

    public ContaPoupanca(String numConta, double saldo, Agencia agencia, String dataAniv, double rendimento) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.agencia = agencia;
        this.dataAniv = dataAniv;
        this.rendimento = rendimento;
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

    public String getDataAniv() {
        return dataAniv;
    }
    public void setDataAniv(String dataAniv) {
        this.dataAniv = dataAniv;
    }
    public double getRendimento() {
        return rendimento;
    }
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
    public void aplicarRendimento() {
        setSaldo(getSaldo() + (getSaldo() * rendimento));
    }
}