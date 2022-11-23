> "We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency,both for the software we produce as well as for the organization that is producing it. Finally as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. Within Google, we sometimes say, "Software engineering is programming integrated over time." Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also become clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren't squares, distance isn't velocity. Software engineering isn't programming."
>
> *Titus Winters, Software Engineering at Google*

São diferenças cruciais que diferenciam o papel essencial de cada papel. Embora o desenvolvedor seja focado mais na parte do desenvolvimento e toda a criação do projeto em si, o engenheiro de ‘software’, além de fazer o mesmo que o desenvolvedor, acaba tendo mais tarefas além do próprio processo de criação, tais como manutenção, melhorias, e qualquer outra decisão que esteja além do código e projeto. Ou seja, a principal diferença entre o desenvolvedor e o engenheiro de ‘software’, é que o desenvolvedor pensa no tempo atual do projeto, e o engenheiro de ‘software’ pensa, além disso, no tempo, na escala e nos trade-offs.

> O que é um trade-off no projeto da API do segundo semestre?

Pelo fato do projeto ser um ‘desktop’, acaba perdendo a vantagem de ser multiplataforma, ou seja, além de ‘desktop’, também ser ‘web’ e mobile. Mas em troca disso, a aplicação ‘desktop’ permite maior flexibilidade de uso e gerenciamento do que uma ‘web’/mobile forneceria por suas limitações, fazendo com que o usuário tenha mais opções e flexibilidade de uso em troca de portabilidade.

<br>

<h1 align="center">Projeto em atividade</h1>
<p align="justify">
    Desenvolvimento de um estudo baseado na criação de um projeto. O desenvolvimento trabalha no aspecto geral de tudo necessário para a boa qualidade de um projeto. Requisitos funcionais e não funcionais, caso de uso, diagrama de classes, etc.; são alguns dos conceitos utilizados.
</p>

> O tema escolhido foi: **sistema bancário**.

<br>

## Atividade de Requisitos

### :sparkles: Requisitos Funcionais
Os requisitos funcionais representam tudo aquilo que o sistema faz, em tarefas e ações. 
<p align="center">

![Caso de uso [Sistema Bancário]](/readme/Caso%20de%20uso%20%5BSistema%20Banc%C3%A1rio%5D%20-%20P%C3%A1gina%201.jpeg)
</p>

### :dart: Requisitos não funcionais
Os requisitos não funcionais representam como as funcionalidades serão entregues ao usuário. Tratam de questões como desempenho, usabilidade, portabilidade, etc.

| Requisito não-funcional             |
|:------------------------------------|
| Usabilidade                         |
| Portabilidade                       |
| Escalabilidade                      |
| Separação de Interesses: modelo MVC |
| Desempenho                          |

## Arquitetura do Sistema

### Diagrama de classes UML
<p align="center">

![Diagrama de classes [Sistema Bancário]](/readme/Diagrama%20de%20classes%20UML%20%5BSistema%20Banc%C3%A1rio%5D.png)
</p>

## Desenvolvimento do código

`Interface IConta`
```java
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
```

`Classe ContaPoupanca`
```java
import java.util.ArrayList;
import java.util.List;

class ContaPoupanca implements IConta {
    private double saldo;
    private double rendimento;
    private String dataAniv;
    private String numConta;
    private Agencia agencia;
    private final List<ITransacao> extrato = new ArrayList<>();
    
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
```

`classe ContaCorrente`
```java
import java.util.ArrayList;
import java.util.List;

class ContaCorrente implements IConta {
    private double taxa;
    private double saldo;
    private String numConta;
    private Agencia agencia;
    private final List<ITransacao> extrato = new ArrayList<>();

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
```

`classe Agencia`
```java
class Agencia {
    protected String numAgencia;
    protected String nomeAgencia;

    public Agencia (String numAgencia, String nomeAgencia) {
        this.numAgencia = numAgencia;
        this.nomeAgencia = nomeAgencia;
    }

    public String getNumAgencia() {
        return numAgencia;
    }
    public String getNomeAgencia() {
        return nomeAgencia;
    }
    public void setNumAgencia(String numAgencia) {
        this.numAgencia = numAgencia;
    }
    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }
}
```

`interface ITransacao`
```java
interface ITransacao {
    void realizarTransacao();
}
```

`classe Deposito`
```java
public class Deposito implements ITransacao {
    String dataAtual;
    double valor;
    IConta destinatario;

    public Deposito(IConta destinatario, double valor, String dataAtual) {
        this.destinatario = destinatario;
        this.valor = valor;
        this.dataAtual = dataAtual;
    }

    @Override
    public void realizarTransacao() {
        destinatario.setSaldo(destinatario.getSaldo() + valor);
        destinatario.addToExtrato(new Deposito(this.destinatario, this.valor, this.dataAtual));
    }

    @Override
    public String toString() {
        String texto = """
                Destinatário: %s
                Valor da transação: %s
                Data da transação: %s
                """;
        return String.format(texto, this.destinatario.getNumConta(), this.valor, this.dataAtual);
    }
}
```

`classe Transferencia`
```java
import java.util.List;

public class Transferencia implements ITransacao {
    String dataAtual;
    double valor;
    IConta remetente;
    IConta destinatario;

    public Transferencia(IConta remetente, IConta destinatario, double valor, String dataAtual) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.valor = valor;
        this.dataAtual = dataAtual;
    }

    @Override
    public void realizarTransacao() {
        remetente.setSaldo(remetente.getSaldo() - valor);
        destinatario.setSaldo(destinatario.getSaldo() + valor);

        List<ITransacao> extratoRem = this.remetente.getExtrato();
        extratoRem.add(new Transferencia(this.remetente, this.destinatario, this.valor, this.dataAtual));

        List<ITransacao> extratoDes = this.destinatario.getExtrato();
        extratoDes.add(new Transferencia(this.remetente, this.destinatario, this.valor, this.dataAtual));
    }

    @Override
    public String toString() {
        String texto = """
                Remetente: %s
                Destinatário: %s
                Valor da transferência: %s
                Data da transferência: %s
                """;
        return String.format(texto, this.remetente.getNumConta(), this.destinatario.getNumConta(), this.valor, this.dataAtual);
    }
}
```

`classe Saque`
```java
public class Saque implements ITransacao {
    String dataAtual;
    double valor;
    IConta destinatario;

    public Saque(IConta destinatario, double valor, String dataAtual) {
        this.destinatario = destinatario;
        this.valor = valor;
        this.dataAtual = dataAtual;
    }

    @Override
    public void realizarTransacao() {
        destinatario.setSaldo(destinatario.getSaldo() - valor);
        destinatario.addToExtrato(new Saque(this.destinatario, this.valor, this.dataAtual));
    }

    @Override
    public String toString() {
        String texto = """
                Destinatário: %s
                Valor do saque: %s
                Data da realização do saque: %s
                """;
        return String.format(texto, this.destinatario.getNumConta(), this.valor, this.dataAtual);
    }
}
```

`interface IPessoa`
```java
import java.util.HashMap;

public interface IPessoa {
    HashMap<String, String> getEndereco();
    void setEndereco(HashMap<String, String> endereco);
    void exibirEndereco();
    IConta getConta();
    void exibirConta();
}
```

`classe PessoaFisica`
```java
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
```

`classe PessoaJuridica`
```java
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
```

## Executando o sistema

`Main.java`
Declarando instâncias para agências, pessoas e contas.
```java
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Agencia agenciaLegal = new Agencia("12345", "Agência Legal");
        IConta contaBonita = new ContaCorrente("11223-3", 100.0, agenciaLegal, 0.2);

        Agencia agenciaCarambolas = new Agencia("98765", "Agencia Carambolas");
        IConta contaInteligente = new ContaPoupanca("99887-7", 200.0, agenciaCarambolas, "25/03/2001", 0.5);

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
    }
}
```
---
Testando o **depósito**:
```
clienteExotico.exibirConta();

ITransacao deposito = new Deposito(clienteExotico.getConta(), 200, new Date().toString());
deposito.realizarTransacao();

clienteExotico.exibirConta();
```
**Saída:**
```
#========== Dados da conta ==========#
Proprietário da conta: Exótico de Almeida Soarez
Agência: Agência Legal | 12345
Conta: 11223-3
Saldo: 100.0
#====================================#

#========== Dados da conta ==========#
Proprietário da conta: Exótico de Almeida Soarez
Agência: Agência Legal | 12345
Conta: 11223-3
Saldo: 300.0
#====================================#
```
---
Testando o **saque**:
```
clienteExotico.exibirConta();

ITransacao saque = new Saque(clienteExotico.getConta(), 50, new Date().toString());
saque.realizarTransacao();

clienteExotico.exibirConta();
```
**Saída:**
```
#========== Dados da conta ==========#
Proprietário da conta: Exótico de Almeida Soarez
Agência: Agência Legal | 12345
Conta: 11223-3
Saldo: 100.0
#====================================#

#========== Dados da conta ==========#
Proprietário da conta: Exótico de Almeida Soarez
Agência: Agência Legal | 12345
Conta: 11223-3
Saldo: 50.0
#====================================#
```
---
Testando a **transferência**:
```
clienteExotico.exibirConta();
clienteMaravilhoso.exibirConta();

ITransacao transferencia = new Transferencia(clienteMaravilhoso.getConta(), clienteExotico.getConta(), 150, new Date().toString());
transferencia.realizarTransacao();

clienteExotico.exibirConta();
clienteMaravilhoso.exibirConta();
```
**Saída**
```
#========== Dados da conta ==========#
Proprietário da conta: Exótico de Almeida Soarez
Agência: Agência Legal | 12345
Conta: 11223-3
Saldo: 100.0
#====================================#
#========== Dados da conta ==========#
Proprietário da conta: Maravilhoso da Silva Ltda.
Agência: Agencia Carambolas | 98765
Conta: 99887-7
Saldo: 200.0
#====================================#

#========== Dados da conta ==========#
Proprietário da conta: Exótico de Almeida Soarez
Agência: Agência Legal | 12345
Conta: 11223-3
Saldo: 250.0
#====================================#
#========== Dados da conta ==========#
Proprietário da conta: Maravilhoso da Silva Ltda.
Agência: Agencia Carambolas | 98765
Conta: 99887-7
Saldo: 50.0
#====================================#
```

### Outras funcionalidades:
Exibir endereço da pessoa.
```
clienteExotico.exibirEndereco();
```
**Saída:**
```
Número: Número exótico
Bairro: Bairro dos exóticos
Rua: Rua exótica
Cidade: Cidade exótica
```
---
Exibir conta da pessoa.
```
clienteExotico.exibirConta();
```
**Saída:**
```
#========== Dados da conta ==========#
Proprietário da conta: Exótico de Almeida Soarez
Agência: Agência Legal | 12345
Conta: 11223-3
Saldo: 100.0
#====================================#
```
---
Gerar extrato de transações da conta.
```
ITransacao deposito = new Deposito(clienteExotico.getConta(), 200, new Date().toString());
deposito.realizarTransacao();

ITransacao saque = new Saque(clienteExotico.getConta(), 50, new Date().toString());
saque.realizarTransacao();

ITransacao transferencia = new Transferencia(clienteMaravilhoso.getConta(), clienteExotico.getConta(), 150, new Date().toString());
transferencia.realizarTransacao();

List<ITransacao> extrato = clienteExotico.getConta().getExtrato();
for (ITransacao iTransacao: extrato) {
    System.out.println(iTransacao);
}
```
**Saída:**
```
Destinatário: 11223-3
Valor da transação: 200.0
Data da transação: Wed Nov 23 16:49:30 BRT 2022

Destinatário: 11223-3
Valor do saque: 50.0
Data da realização do saque: Wed Nov 23 16:49:30 BRT 2022

Remetente: 99887-7
Destinatário: 11223-3
Valor da transferência: 150.0
Data da transferência: Wed Nov 23 16:49:30 BRT 2022
```