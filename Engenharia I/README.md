> "We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency,both for the software we produce as well as for the organization that is producing it. Finally as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. Within Google, we sometimes say, "Software engineering is programming integrated over time." Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also become clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren't squares, distance isn't velocity. Software engineering isn't programming."
>
> *Titus Winters, Software Engineering at Google*

São diferenças cruciais que diferenciam o papel essencial de cada papel. Embora o desenvolvedor seja focado mais na parte do desenvolvimento e toda a criação do projeto em si, o engenheiro de software, além de fazer o mesmo que o desenvolvedor, acaba tendo mais tarefas além do próprio processo de criação, tais como manutenção, melhorias, e qualquer outra decisão que esteja além do código ou que envolva o projeto. Ou seja, a principal diferença entre o desenvolvedor e o engenheiro de software, é que o desenvolvedor pensa no tempo atual do projeto, e o engenheiro de software pensa além disso tudo, no tempo, na escala e nos trade-offs.

> O que é um trade-off no projeto da API do segundo semestre?

Pelo fato do projeto ser um desktop, acaba perdendo a vantagem de ser multiplataforma, ou seja, além de desktop, também ser web e mobile. Mas em troca disso, a aplicação desktop permite maior flexibilidade de uso e gerenciamento do que um web/mobile forneceria por suas limitações, fazedo com que o usuário tenha mais opções e flexibilidade de uso em troca de portabilidade.

<br>

<h1 align="center">Projeto em atividade</h1>
<p align="justify">
    Desenvolvimento de um estudo baseado na criação de um projeto. O desenvolvimento trabalha no aspecto geral de tudo que é necessário para a boa qualidade de um projeto. Requisitos funcionais e não funcionais, caso de uso, diagrama de classes, etc; são alguns dos conceitos utilizados.
</p>

> O tema escolhido foi: **Sistema Bancário**.

<br>

## Atividade de Requisitos

### :sparkles: Requisitos Funcionais
Os requisitos funcionais representam tudo aquilo que o sistema faz, em termos de tarefas e ações. 
<p align="center">

![Caso de uso [Sistema Bancário]](/readme/Caso%20de%20uso%20%5BSistema%20Banc%C3%A1rio%5D%20-%20P%C3%A1gina%201.jpeg)
</p>

### :dart: Requisitos não funcionais
Os requisitos não funcionais representam a forma como as funcionalidades serão entregues ao usuário. Tratam de quesões como desempenho[^1], usabilidade[^2], portabilidade[^3], etc.

| Requisito não-funcional | Descrição |
|:-----------------------:|:---------:|
| Usabilidade | - |
| Portabilidade | - |
| Escalabilidade[^4] | - |
| Separação de Interesses: modelo MVC[^5] | - |
| Desempenho | - |

## Arquitetura do Sistema

### Diagrama de classes UML
<p align="center">

![Diagrama de classes [Sistema Bancário]](/readme/Diagrama%20de%20classes%20UML%20%5BSistema%20Banc%C3%A1rio%5D%20-%20P%C3%A1gina%201.png)
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

[^1]: Desempenho:: Lorem ipsum dolor sit amet, consectetur adipiscing elit.
[^2]: Usabilidade: Praesent viverra augue nec iaculis condimentum.
[^3]: Portabilidade: liquam erat volutpat. Etiam ac euismod enim.
[^4]: Escalabilidade: Proin mattis mi eu orci gravida, et ullamcorper nisi finibus. In semper lectus est, non sagittis eros aliquet vel.
[^5]: MVC: Integer purus libero, convallis id bibendum ac, venenatis id nibh.
