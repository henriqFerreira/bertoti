package Model;

import java.util.List;

import View.Observer;

public interface Subject {
	void addObserver(Observer o);

	void notifyObserver(List observers);
}
