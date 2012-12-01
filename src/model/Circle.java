package model;

import visitor.Visitor;

public class Circle extends IGeometry {
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	protected int radius;

	@Override
	public void accept(Visitor visitor) {
		visitor.draw(this);		
	}

}
