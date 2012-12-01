package view.table;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.IGeometry;

public class Table<T extends IGeometry> extends AbstractTableModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<T> objectList = new ArrayList<T>();

	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public int getRowCount() {
		return this.objectList.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		T t = objectList.get(rowIndex);
		 switch (columnIndex) {
         case 0:
             return t.getId();
         case 1:
             return t.getX();
         case 2:
             return t.getY();
         case 3:
             return t.getSize();
         default:
             throw new IllegalArgumentException("Column index has to be between 1 - 3 inclusive.");
     }
	}
	
	@Override
	public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "id";
            case 1:
                return "x";
            case 2:
                return "y";
            case 3:
                return "size";
            default:
                throw new IllegalArgumentException("Column has to be between 0 - 3 inclusive.");
        }
    }
	
	public void addRow(T t) {
		if (!objectList.contains(t)) {
            objectList.add(t);
            fireTableRowsInserted(objectList.size() - 1, objectList.size() - 1);
        }
	}
	
	public void clear() {
        fireTableRowsDeleted(0, objectList.size() - 1);
        objectList.clear();
    }

}
