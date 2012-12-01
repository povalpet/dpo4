package view;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.Circle;
import model.GeometryModel;
import model.Rectangle;

public class DrawView extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1955847228637320176L;

	public DrawView(GeometryModel model) {
		super(model);
		this.setVisible(true);
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("click!");
				int x = e.getX();
				int y = e.getY();
				if (e.getButton() == e.BUTTON1) {
					// pridat kolecko
				} else if (e.getButton() == e.BUTTON2) {
					// pridat ctverecek
				}
			}
		});
	}

	@Override
	public void draw(Circle circle) {
		// TODO pridat kolecko do swingu
	}

	@Override
	public void draw(Rectangle rectangle) {
		// TODO pridat ctverecek
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawRect(10, 10, 10, 10);
	}
	
}
