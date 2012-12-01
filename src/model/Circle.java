package model;

import visitor.Visitor;

public class Circle extends IGeometry {

	@Override
	public void accept(Visitor visitor) {
		visitor.draw(this);		
	}

}
