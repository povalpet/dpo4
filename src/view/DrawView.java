package view;

import java.awt.Graphics;

import model.Circle;
import model.GeometryModel;
import model.Square;

public class DrawView extends View {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1955847228637320176L;

	public DrawView(GeometryModel model) {
		super(model);
		
		this.setVisible(true);
	}

	@Override
	public void draw(Circle circle) {
		Graphics g = getGraphics();
		g.drawOval(circle.getX(), circle.getY(), circle.getRadius(), circle.getRadius());
	}

	@Override
	public void draw(Square square) {
		Graphics g = getGraphics();
		g.drawRect(square.getX(), square.getY(), square.getSize(), square.getSize());
	}

	@Override
	public void reset() {
		this.updateUI();
	}
	
}
