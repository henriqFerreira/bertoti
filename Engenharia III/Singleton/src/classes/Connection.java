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
