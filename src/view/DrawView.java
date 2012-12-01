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
		System.out.println("Circle!");
	}

	@Override
	public void draw(Square square) {
		System.out.println("Square!");
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawRect(10, 10, 10, 10);
	}
	
}
