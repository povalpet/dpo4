package view;

import java.util.Collection;
import java.util.Map;

import javax.swing.JComponent;

import model.GeometryModel;
import model.IGeometry;
import observer.Observer;
import visitor.Visitor;

@SuppressWarnings("serial")
public abstract class View extends JComponent implements Observer, Visitor {
	
	protected GeometryModel model;
	
	public View(GeometryModel model) {
		this.model = model;
		this.model.attach(this);
	}
	
	@Override
	public void update() {
		this.display(this.model.getAll());
	}
	
	public void display(Collection<IGeometry> collection) {
		for (IGeometry geometry : collection) {
			geometry.accept(this);
		}
	}

}
