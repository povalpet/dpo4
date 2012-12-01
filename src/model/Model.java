package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Model {
	
	private List<Listener> listeners;
	
	public Model() {
		this.listeners = new ArrayList<Listener>();
	}
	
	public void addListener(Listener listener) {
		this.listeners.add(listener);
	}
	
	protected void notifyListeners() {
		for (Listener listener : this.listeners) {
			listener.onChange();
		}
	}

}
