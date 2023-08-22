# Observer Pattern

> Observer Pattern is a behavioral design pattern that lets you define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Exemplo

![Observer Diagram](/Engenharia%20III/Observer/src/assets/diagrama_observer.png)

### Código

Main.java (src/Main.java)

```java
import classes.Food;
import classes.Stock;
import classes.Technology;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        stock.addObserver(new Technology());
        stock.addObserver(new Food());

        stock.setInStock(true);        

        stock.removeObserver(new Technology());
        stock.setInStock(false);
    }
}
```

Stock.java (src/classes/Stock.java)

```java
package classes;

import java.util.ArrayList;
import java.util.List;
import interfaces.IObserver;

public class Stock {
    private boolean inStock;
    private List<IObserver> observers;

    public Stock() {
        inStock = false;
        observers = new ArrayList<IObserver>();
    }

    public void addObserver(IObserver o) {
        observers.add(o);
    }

    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    public void _notify() {
        for (IObserver o : observers) {
            o.update();
        }
    }

    public void setInStock(boolean b) {
        inStock = b;

        if (!inStock) return;

        this._notify();
    }
}

```

IObserver.java (src/interfaces/IObserver.java)

```java
public interface IObserver {
    void update();
}
```

IProduto.java (src/interfaces/IProduto.java)

```java
package interfaces;

public interface IProduto extends IObserver {}
```

Food.java (src/classes/Food.java)

```java
package classes;

import interfaces.IProduto;

public class Food implements IProduto {
    @Override
    public void update() {
        System.out.println("Food notification received!");
    }
}
```

Technology.java (src/classes/Technology.java)

```java
package classes;

import interfaces.IProduto;

public class Technology implements IProduto {
    @Override
    public void update() {
        System.out.println("Technology notification received!");
    }
}
```
