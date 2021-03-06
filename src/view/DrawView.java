package view;

import java.awt.Graphics;
import model.Circle;
import model.GeometryModel;
import model.Square;

public class DrawView extends View {
	
	Graphics graph;
	
	private static final long serialVersionUID = 1955847228637320176L;

	public DrawView(GeometryModel model) {
		super(model);		
		
	}

	@Override
	public void draw(Circle circle) {
		graph.drawOval(circle.getX(), circle.getY(), circle.getRadius(), circle.getRadius());
	}

	@Override
	public void draw(Square square) {
		graph.drawRect(square.getX(), square.getY(), square.getSize(), square.getSize());
	}
	
	@Override
	public void updateObserver() {
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		graph = g;
		display(model.getAll());
	}
	
	
	
}
