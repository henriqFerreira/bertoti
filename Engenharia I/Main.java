import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Agencia agenciaLegal = new Agencia("12345", "Agência Legal");
        ContaCorrente contaBonita = new ContaCorrente("11223-3", 100.0, agenciaLegal, 0.2);

        Agencia agenciaCarambolas = new Agencia("98765", "Agencia Carambolas");
        ContaPoupanca contaInteligente = new ContaPoupanca("99887-7", 200.0, agenciaCarambolas, "25/03/2001", 0.5);

        HashMap<String, String> enderecoExotico = new HashMap<String, String>() {{
            put("Rua", "Rua exótica");
            put("Número", "Número exótico");
            put("Bairro", "Bairro dos exóticos");
            put("Cidade", "Cidade exótica");
        }};

        PessoaFisica clienteExotico = new PessoaFisica(
                "123.456.789-10",
                "Exótico de Almeida Soarez",
                enderecoExotico,
                contaBonita
        );

        HashMap<String, String> enderecoMaravilhoso = new HashMap<String, String>() {{
            put("Rua", "Rua maravilhosa");
            put("Número", "Número maravilhoso");
            put("Bairro", "Bairro das maravilhas");
            put("Cidade", "Cidade maravilhosa");
        }};

        PessoaJuridica clienteMaravilhoso = new PessoaJuridica(
                "79.442.144/0001-58",
                "Maravilhoso da Silva Ltda.",
                enderecoMaravilhoso,
                contaInteligente
        );

        ITransacao deposito = new Deposito(clienteExotico);
    }
}
