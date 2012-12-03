package view;

import java.awt.Graphics;
import javax.swing.JLayeredPane;
import model.Circle;
import model.GeometryModel;
import model.Square;

public class DrawView extends View {
	
	private JLayeredPane drawPane;
	Graphics graph;
	
	private static final long serialVersionUID = 1955847228637320176L;

	public DrawView(GeometryModel model) {
		super(model);		
		init();	
		
	}
	
	private void init() {
		drawPane = new JLayeredPane();		
		this.add(drawPane);
		this.setVisible(true);
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
	public void reset() {
		repaint();
	}
	
	@Override
	public void updateObserver() {
		reset();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		graph = g;
		display(model.getAll());
	}
	
	
	
}
