import java.util.HashMap;

class PessoaFisica implements IPessoa {
    private String cpf;
    private String nomePessoa;
    private HashMap<String, String> endereco;
    private IConta conta;

    public PessoaFisica(String cpf, String nomePessoa, HashMap<String, String> endereco, IConta conta) {
        this.cpf = cpf;
        this.nomePessoa = nomePessoa;
        this.conta = conta;
        this.endereco = endereco;
    }

    @Override
    public HashMap<String, String> getEndereco() {
        return this.endereco;
    }

    @Override
    public void setEndereco(HashMap<String, String> endereco) {
        this.endereco = endereco;
    }

    @Override
    public void exibirEndereco() {
        for (String nome : endereco.keySet()) {
            String key = nome.toString();
            String value = endereco.get(nome).toString();
            System.out.println(key + ": " + value);
        }
    }

    @Override
    public IConta getConta() {
        return this.conta;
    }

    @Override
    public void exibirConta() {
        String conta = """
                #========== Dados da conta ==========#
                Proprietário da conta: %s
                Agência: %s | %s
                Conta: %s
                Saldo: %s
                #====================================#
                """;
        System.out.printf(
                conta,
                this.getNomePessoa(),
                this.conta.getAgencia().getNomeAgencia(),
                this.conta.getAgencia().getNumAgencia(),
                this.conta.getNumConta(),
                this.conta.getSaldo()
        );
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