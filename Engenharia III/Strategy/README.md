# Estrategy Pattern

> Strategy is a design pattern that lets you define a family of algorithms,
> encapsulate each one, and make them interchangeable. Strategy lets the algorithm
> vary independently from clients that use it.

## Exemplo

![Strategy Diagram](/Engenharia%20III/Strategy/src/assets/diagrama_strategy.png)

### Código

Main.java (src/Main.java)

```java
import classes.Passageiro;
import classes.PassagemNormal;
import classes.PassagemPremium;

public class Main {
    public static void main(String[] args) {
        Passageiro passageiro_1 = new Passageiro("João");
        passageiro_1.setPassagem(new PassagemNormal());
        passageiro_1.fazerDesconto();

        passageiro_1.setPassagem(new PassagemPremium());
        passageiro_1.fazerDesconto();
    }
}
```

Passageiro.java (src/classes/Passageiro.java)

```java
package classes;

import interfaces.IPassagem;

public class Passageiro {
    public String name;
    public IPassagem passagem;

    public Passageiro(String name) {
        this.name = name;
    }

    public void setPassagem(IPassagem passagem) {
        this.passagem = passagem;
    }

    public void fazerDesconto() {
        passagem.gerarDesconto();
    }
}

```

IPassagem.java (src/interfaces/IPassagem.java)

```java
package interfaces;

public interface IPassagem {
    public void gerarDesconto();
}

```

PassagemNormal.java (src/classes/PassagemNormal.java)

```java
package classes;

import interfaces.IPassagem;

public class PassagemNormal implements IPassagem {
    public void gerarDesconto() {
        System.out.println("Desconto aplicado para passagem normal!");
    }
}

```

PassagemPremium.java (src/classes/PassagemPremium.java)

```java
package classes;

import interfaces.IPassagem;

public class PassagemPremium implements IPassagem {
    public void gerarDesconto() {
        System.out.println("Desconto aplicado para passagem premium!");
    }
}

```
