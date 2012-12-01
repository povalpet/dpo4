package model;

import visitor.Visitor;

public class Rectangle extends IGeometry {
	
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.draw(this);
	}

}
