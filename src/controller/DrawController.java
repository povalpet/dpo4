package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.GeometryModel;

import view.DrawView;

public class DrawController extends AbstractController implements MouseListener {

	public static final int DEFAULT_RADIUS = 30;

	public DrawController(DrawView view, GeometryModel model) {
		super(view, model);
		view.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (e.getButton() == MouseEvent.BUTTON1) {
			// left mouse button
			model.addNewCircle(x, y, DEFAULT_RADIUS);
		} else {
			// other buttons
			model.addNewRectangle(x, y, DEFAULT_RADIUS);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void updateObserver() {
		// TODO Auto-generated method stub
		
	}

}
