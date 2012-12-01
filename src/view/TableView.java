package view;

import javax.swing.JTable;

import view.table.Table;
import model.Circle;
import model.GeometryModel;
import model.Square;

public class TableView extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1216369742317050061L;
	
	protected final JTable circleTable;
	protected final JTable rectangleTable;
	
	private Table<Circle> circleTableValues;
	private Table<Square> rectangleTableValues;

	public TableView(GeometryModel model) {
		super(model);
		
		this.circleTable = new JTable();
		this.rectangleTable = new JTable();
		
		this.init();
	}
	
	private void init() {
		this.circleTableValues = new Table<Circle>();
		this.circleTable.setModel(this.circleTableValues);
		
		this.rectangleTableValues = new Table<Square>();
		this.rectangleTable.setModel(this.rectangleTableValues);
		
		this.add(circleTable);
		this.add(rectangleTable);
		this.setVisible(true);
	}

	@Override
	public void draw(Circle circle) {
		this.circleTableValues.addRow(circle);
	}

	@Override
	public void draw(Square rectangle) {
		this.rectangleTableValues.addRow(rectangle);
	}
	
	/**
	 * Vycisteni layoutu kdyz se zmackne reset button
	 */
	public void reset() {
		this.circleTableValues.clear();
		this.rectangleTableValues.clear();
	}

}
