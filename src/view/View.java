package view;

import java.util.Map;

import model.GeometryModel;
import model.IGeometry;
import observer.Observer;

public abstract class View implements Observer {
	
	protected GeometryModel model;
	
	public View(GeometryModel model) {
		this.model = model;
		this.model.attach(this);
	}
	
	@Override
	public void update() {
		this.display(this.model.getAll());
	}
	
	public abstract void display(Map<Integer, IGeometry> map);

}
