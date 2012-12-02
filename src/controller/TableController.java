package controller;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import model.GeometryModel;
import model.IGeometry;
import view.TableView;
import view.table.Table;

public class TableController extends AbstractController {

	public TableController(TableView view, GeometryModel model) {
		super(view, model);
		
		model.attach(this);
		view.addCellChangeListener(new EditTableListener());
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
	}
	
	public void updateModel(IGeometry geometry) {
		this.model.updateGeometry(geometry);
	}
	
	class EditTableListener implements TableModelListener {

        @Override
        public void tableChanged(TableModelEvent e) {
            if (e.getType() == TableModelEvent.UPDATE) {
            	int row = e.getFirstRow();
				Table table = (Table) e.getSource();
				IGeometry geometry = table.getRow(row);
				model.updateGeometry(geometry);
            }
        }
    }

}
