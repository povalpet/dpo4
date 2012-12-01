package controller;

import model.IModel;
import observer.Observer;
import view.View;

public abstract class AbstractController implements Observer{
	protected View view;
	protected IModel model;
	
	public AbstractController(View view, IModel model) {
		this.view = view;
		this.model = model;
	}
}
