package Model;

import java.util.LinkedList;
import java.util.List;

import View.Observer;

public class Station {
	private List<Sensor> sensors;
	private List<Observer> observers;

	public Station() {
		sensors = new LinkedList<>();
		observers = new LinkedList<>();
	}

	public void addSensor(Sensor s) {
		sensors.add(s);
	}

	public void addObserver(Observer o) {
		observers.add(o);
	}

	public void notifyObservers() {
		for (Observer o: observers) {
			o.update(sensors);
		}
	}
}
