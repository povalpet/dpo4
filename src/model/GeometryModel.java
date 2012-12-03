package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import observer.Observable;
import observer.Observer;

public class GeometryModel implements Observable {
	private Map<Integer,IGeometry> objectList;
	private List<Observer> observerList;
	private static int id = 1;
	
	public GeometryModel() {
		this.objectList = new HashMap<Integer, IGeometry>();
		this.observerList = new ArrayList<Observer>();
	}
	
	public void addNewCircle(int xCoord, int yCoord, int radius) {
		if(radius > 0) {
			IGeometry circle = new Circle();
			circle.setX(xCoord);
			circle.setY(yCoord);
			circle.setSize(radius);
			circle.setId(id++);
			this.objectList.put(new Integer(circle.getId()), circle);
			
			this.notifyObservers();
		} else {
			throw new IllegalArgumentException("Radius must be > 0.");
		}
	}
	
	public void addNewRectangle(int xCoord, int yCoord, int size) {
		if(size > 0) {
			IGeometry rectangle = new Square();
			rectangle.setX(xCoord);
			rectangle.setY(yCoord);
			rectangle.setSize(size);
			rectangle.setId(id++);
			this.objectList.put(new Integer(rectangle.getId()), rectangle);
			
			this.notifyObservers();
		} else {
			throw new IllegalArgumentException("Size must be > 0.");
		}
	}
	
	public void clearAll() {
		this.objectList.clear();
		this.notifyObservers();
	}
	
	public void deleteGeometry(int id) {
		this.objectList.remove(new Integer(id));
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
			ob.updateObserver();
		}
	}

	public Collection<IGeometry> getAll() {
		return objectList.values();
	}
	
	public void updateGeometry(IGeometry geometry) {
		this.objectList.remove(new Integer(geometry.getId()));
		this.objectList.put(new Integer(geometry.getId()), geometry);
		
		this.notifyObservers();
	}
}
