package Model;

public class Sensor {
	private String name;
	private String data;

	public Sensor(String name, String data) {
		this.name = name;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public String getData() {
		return data;
	}
}
