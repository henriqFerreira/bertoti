import java.util.List;

public interface IConta {
    List<ITransacao> getExtrato();
    void addToExtrato(ITransacao transacao);
    void setSaldo(double valor);
    double getSaldo();
    void setNumConta(String numConta);
    String getNumConta();
    void setAgencia(Agencia agencia);
    Agencia getAgencia();
}
