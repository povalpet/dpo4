package view;

import javax.swing.JTable;

import view.table.Table;
import model.Circle;
import model.GeometryModel;
import model.Rectangle;

public class TableView extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1216369742317050061L;
	
	protected final JTable circleTable;
	protected final JTable rectangleTable;
	
	private Table<Circle> circleTableValues;
	private Table<Rectangle> rectangleTableValues;

	public TableView(GeometryModel model) {
		super(model);
		
		this.circleTable = new JTable();
		this.rectangleTable = new JTable();
		
		this.init();
	}
	
	private void init() {
		this.circleTableValues = new Table<Circle>();
		this.circleTable.setModel(this.circleTableValues);
		
		this.rectangleTableValues = new Table<Rectangle>();
		this.rectangleTable.setModel(this.rectangleTableValues);		
	}

	@Override
	public void draw(Circle circle) {
		this.circleTableValues.addRow(circle);
	}

	@Override
	public void draw(Rectangle rectangle) {
		this.rectangleTableValues.addRow(rectangle);
	}

}
