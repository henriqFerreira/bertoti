# Facade pattern

> The Facade pattern provides a simplified interface to a complex subsystem. The Facade delegates the client requests to the appropriate objects within the subsystem. The Facade is also responsible for managing their lifecycle.

## Exemplo

![Facade Diagram](/Engenharia%20III/Facade/src/assets/diagrama_facade.png)

### Código

Main.java (src/Main.java)

```java
import classes.CinemaFacade;

public class Main {
 public static void main(String[] args) {
  CinemaFacade cinema = new CinemaFacade();

  System.out.println("Iniciando sessão do cinema...");
  cinema.watchMovie();

  System.out.println("Parando sessão do cinema...");
  cinema.stopMovie();
 }
}
```

CinemaFacade.java (src/classes/CinemaFacade.java)

```java
package classes;

public class CinemaFacade {
 private TicketSystem ticketSystem;
 private MovieSystem movieSystem;
 private SnackSystem snackSystem;

 public CinemaFacade() {
  this.ticketSystem = new TicketSystem();
  this.movieSystem = new MovieSystem();
  this.snackSystem = new SnackSystem();
 }

 public void watchMovie() {
  ticketSystem.bookTicket();
  movieSystem.playMovie();
  snackSystem.orderSnacks();
 }

 public void stopMovie() {
  movieSystem.stopMovie();
  ticketSystem.cancelTicker();
  snackSystem.cancelSnacks();
 }
}
```

TicketSystem.java (src/classes/TicketSystem.java)

```java
package classes;

public class TicketSystem {
 public void bookTicket() {
  System.out.println("Booked ticker");
 }

 public void cancelTicker() {
  System.out.println("Ticket cancelled");
 }
}
```

MovieSystem.java (src/classes/MovieSystem.java)

```java
package classes;

public class MovieSystem {
 public void playMovie() {
  System.out.println("Movie started");
 }

 public void stopMovie() {
  System.out.println("Movie stopped");
 }
}
```

SnackSystem.java (src/classes/SnackSystem.java)

```java
package classes;

public class SnackSystem {
 public void orderSnacks() {
  System.out.println("Snacks ordered");
 }

 public void cancelSnacks() {
  System.out.println("Snacks cancelled");
 }
}
```
