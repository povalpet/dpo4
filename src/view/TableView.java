package view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;

import view.table.Table;
import model.Circle;
import model.GeometryModel;
import model.Square;

public class TableView extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1216369742317050061L;
	
	
	private Table<Circle> circleTableValues;
	private Table<Square> rectangleTableValues;
	private JTable circleTable;
	private JTable squareTable;

	public TableView(GeometryModel model) {
		super(model);
		circleTable = new JTable();
		squareTable = new JTable();
		this.init();
	}
	
	private void init() {
		JPanel panel = new JPanel();
		panel.setSize(360,410);
		FlowLayout layout = new FlowLayout();
		layout.setAlignment(FlowLayout.LEFT);
		panel.setLayout(layout);
		
		JScrollPane circleScrollPane = new JScrollPane();
		this.circleTableValues = new Table<Circle>();
		
		circleTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		circleTable.setModel(this.circleTableValues);
		circleTable.setFillsViewportHeight(true);
		
		JScrollPane squareScrollPane = new JScrollPane();
        
        squareTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		this.rectangleTableValues = new Table<Square>();
		squareTable.setModel(this.rectangleTableValues);
		squareTable.setFillsViewportHeight(true);
		
		Dimension d = new Dimension(303, 200);
		
		circleScrollPane.setViewportView(circleTable);
		circleScrollPane.setPreferredSize(d);
		squareScrollPane.setViewportView(squareTable);
		squareScrollPane.setPreferredSize(d);
		
		panel.add(circleScrollPane);
		panel.add(squareScrollPane);
		this.add(panel);
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
	
	public void addCellChangeListener(TableModelListener l) {
		circleTableValues.addTableModelListener(l);
		rectangleTableValues.addTableModelListener(l);
	}
	
	@Override
	public void updateObserver() {
		this.reset();
		this.display(this.model.getAll());
	}

}
