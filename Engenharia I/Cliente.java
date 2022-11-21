import java.util.HashMap;

class Cliente {
    protected HashMap<String, String> endereco;
    protected IConta conta;

    public Cliente(HashMap<String, String> endereco, IConta conta) {
        this.endereco = endereco;
        this.conta = conta;
    }

    public HashMap<String, String> getEndereco() {
        return endereco;
    }
    public void setEndereco(HashMap<String, String> endereco) {
        this.endereco = endereco;
    }
    public void exibirEndereco() {
        for (String nome : endereco.keySet()) {
            String key = nome.toString();
            String value = endereco.get(nome).toString();
            System.out.println(key + ": " + value);
        }
    }
}