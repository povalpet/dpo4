package model;

import visitor.Visitor;

public class Rectangle extends IGeometry {

	@Override
	public void accept(Visitor visitor) {
		visitor.draw(this);
	}

}
