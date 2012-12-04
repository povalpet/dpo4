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
		
		// tablecontroller je na modelu nezavisly
		model.detach(this);
		view.addCellChangeListener(new EditTableListener());
	}

	@Override
	public void updateObserver() {
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
				@SuppressWarnings("rawtypes")
				Table table = (Table) e.getSource();
				IGeometry geometry = table.getRow(row);
				model.updateGeometry(geometry);
            }
        }
    }

}
