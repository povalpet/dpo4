package dpo;

import controller.DrawController;
import model.GeometryModel;
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

		new DrawController(drawView, model);
		
		Frame frame = new Frame(drawView, tableView);
	}

}
