import java.util.HashMap;

class PessoaJuridica implements IPessoa {
    private String cnpj;
    private String razaoSocial;
    private HashMap<String, String> endereco;
    private IConta conta;

    public PessoaJuridica(String cnpj, String razaoSocial, HashMap<String, String> endereco, IConta conta) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.conta = conta;
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
                this.getRazaoSocial(),
                this.conta.getAgencia().getNomeAgencia(),
                this.conta.getAgencia().getNumAgencia(),
                this.conta.getNumConta(),
                this.conta.getSaldo()
        );
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}