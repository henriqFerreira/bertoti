import java.util.List;

abstract class Conta implements IConta {
    protected String numConta;
    protected double saldo;
    protected Agencia agencia;
    protected List<ITransacao> extrato;

    public Conta(String numConta, double saldo, Agencia agencia) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Agencia getAgencia() {
        return agencia;
    }
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
}