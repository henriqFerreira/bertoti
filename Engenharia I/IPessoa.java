import java.util.HashMap;

public interface IPessoa {
    HashMap<String, String> getEndereco();
    void setEndereco(HashMap<String, String> endereco);
    void exibirEndereco();
    IConta getConta();
    void exibirConta();
}
