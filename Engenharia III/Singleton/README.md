# Singleton pattern

> Singleton Pattern is a creational design pattern that lets you ensure that a class has only one instance, and provide a global point of access to it.

## Exemplo

![Strategy Diagram](/Engenharia%20III/Singleton/src/assets/diagrama_singleton.png)

### Código

Main.java (src/Main.java)

```java
import classes.Connection;
import singleton.DatabasePool;

public class Main {
    public static void main(String[] args) {
        DatabasePool pool = DatabasePool.getInstance();

        Connection connection_1 = pool.getConnection();

        connection_1.connect();
        connection_1.executeQuery("SELECT * FROM users");
        connection_1.disconnect();
        connection_1.executeQuery("SELECT * FROM users");
        
        Connection connection_2 = pool.getConnection();

        connection_2.connect();
        connection_2.executeQuery("SELECT * FROM users");
        connection_2.disconnect();
        connection_2.executeQuery("SELECT * FROM users");
        
        Connection connection_3 = pool.getConnection();
    
        connection_3.connect();
        connection_3.executeQuery("SELECT * FROM users");
        connection_3.disconnect();
        connection_3.executeQuery("SELECT * FROM users");
        
        DatabasePool pool2 = DatabasePool.getInstance();
    
        Connection connection_4 = pool2.getConnection();
    }
}
```

DatabasePool.java (src/singleton/DatabasePool.java)

```java
package singleton;

import java.util.ArrayList;
import java.util.List;

import classes.Connection;

public class DatabasePool {
 private static DatabasePool instance;
 private List<Connection> connectionPool;
 private int maxConnections = 3;

 private DatabasePool() {
  connectionPool = new ArrayList<Connection>();
  initizalizePool();
 }

 /**
  * Retrieves the singleton instance of the DatabasePool class.
  *
  * @return the singleton instance of the DatabasePool class
  */
 public static synchronized DatabasePool getInstance() {
  if (instance == null) {
   instance = new DatabasePool();
  }
  return instance;
 }

 /**
  * Retrieves a connection from the connection pool.
  *
  * @return the retrieved connection, or null if no connections are available
  */
 public Connection getConnection() {
  if (!connectionPool.isEmpty()) {
   Connection connection = connectionPool.remove(0);
   return connection;
  } else {
   System.out.println("No connections available.");
   return null;
  }
 }

 /**
  * Releases a connection to the connection pool.
  *
  * @param connection the connection to be released
  */
 public void releaseConnection(Connection connection) {
  if (connection != null) {
   if (connectionPool.size() < maxConnections) {
    connectionPool.add(connection);
   }
  }
 }

 /**
  * Initializes the connection pool.
  */
 private void initizalizePool() {
  for (int i = 0; i < maxConnections; i++) {
   Connection connection = new Connection();
   connectionPool.add(connection);
  }
 }
}

```

Connection.java (src/classes/Connection.java)

```java
package classes;

public class Connection {
 private boolean isConnected = false;

 public void connect() {
  isConnected = true;
 }

 public void executeQuery(String q) {
  if (isConnected) {
   System.out.println("Executing query: " + q);
  } else {
   System.out.println("Cannot execute query: " + q);
  }
 }

 public void disconnect() {
  isConnected = false;
 }

 public boolean isConnected() {
  return isConnected;
 }
}
```
