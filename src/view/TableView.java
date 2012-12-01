package view;

import java.util.Map;

import javax.swing.JTable;

import model.Circle;
import model.GeometryModel;
import model.IGeometry;
import model.Rectangle;

public class TableView extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1216369742317050061L;
	
	protected final JTable circleTable;
	protected final JTable squareTable;
	protected static final String[] circleColumnNames = {
		"id",
		"x",
		"y",
		"r"
	};
	protected static final String[] squareColumnNames = {
		"id",
		"x",
		"y",
		"a"
	};

	public TableView(GeometryModel model) {
		super(model);
		circleTable = new JTable(null, circleColumnNames);
		squareTable = new JTable(null, squareColumnNames);
	}

	@Override
	public void draw(Circle circle) {
//		this.circleTable.addRow()
	}

	@Override
	public void draw(Rectangle rectangle) {
//		this.squareTable.addRow()
	}

}
