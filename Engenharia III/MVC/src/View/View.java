package View;

import java.util.List;

public class View implements Observer {
	private List sensorList;

	public void update(List l) {
		sensorList = l;
	}
}
