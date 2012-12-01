package controller;

import model.GeometryModel;
import observer.Observer;
import view.View;

public abstract class AbstractController implements Observer {
	protected View view;
	protected GeometryModel model;
	
	public AbstractController(View view, GeometryModel model) {
		this.view = view;
		this.model = model;
	}
}
