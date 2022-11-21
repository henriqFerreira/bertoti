import java.util.HashMap;

class PessoaFisica extends Cliente {
    private String cpf;
    private String nomePessoa;

    public PessoaFisica(String cpf, String nomePessoa, HashMap<String, String> endereco, IConta conta) {
        super(endereco, conta);
        this.cpf = cpf;
        this.nomePessoa = nomePessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
}