package controller;

import model.GeometryModel;
import view.TableView;

public class TableController extends AbstractController {

	public TableController(TableView view, GeometryModel model) {
		super(view, model);
		
		model.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
