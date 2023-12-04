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

		pool2.getConnection();
	}
}
