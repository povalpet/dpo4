package model;

import visitor.Visitable;

public abstract class IGeometry  implements Visitable{
	
	protected int id;
	protected int x;
	protected int y;
	protected int size;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}	
	public int getSize()
	{
		return this.size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}
