package model;

import java.util.HashMap;
import java.util.Map;

public class GeometryModel implements IModel {
	private int id;
	private Map<Integer,IGeometry> objectList;
	
	public GeometryModel() {
		this.objectList = new HashMap<>();
		this.id = 0;
	}
	
	public void addNewGeometry(IGeometry geometry) {
		this.objectList.put(new Integer(this.id++), geometry);
	}
}
