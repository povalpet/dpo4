package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import observer.Observable;
import observer.Observer;

public class GeometryModel implements IModel, Observable {
	private Map<Integer,IGeometry> objectList;
	private List<Observer> observerList;
	
	public GeometryModel() {
		this.objectList = new HashMap<Integer, IGeometry>();
		this.observerList = new ArrayList<Observer>();
	}
	
	public void addNewGeometry(IGeometry geometry) {
		this.objectList.put(new Integer(geometry.getId()), geometry);
		this.notifyObservers();
	}

	@Override
	public void attach(Observer observer) {
		this.observerList.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void notifyObservers() {
		for(Observer ob : observerList) {
			ob.update();
		}
	}
}
