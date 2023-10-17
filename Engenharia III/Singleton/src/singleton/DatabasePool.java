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
