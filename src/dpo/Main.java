package dpo;

import controller.ButtonController;
import controller.DrawController;
import controller.TableController;
import model.GeometryModel;
import view.ButtonView;
import view.DrawView;
import view.Frame;
import view.TableView;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GeometryModel model = new GeometryModel();
		
		DrawView drawView = new DrawView(model);
		TableView tableView = new TableView(model);
		ButtonView buttonView = new ButtonView(model);

		new DrawController(drawView, model);
		new TableController(tableView, model);
		new ButtonController(buttonView, model);
		
		new Frame(drawView, tableView, buttonView);
	}

}
