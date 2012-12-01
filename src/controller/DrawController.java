package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.GeometryModel;

import view.DrawView;

public class DrawController extends AbstractController implements MouseListener {

	private GeometryModel model;
	
	public static final int DEFAULT_RADIUS = 30;

	public DrawController(DrawView view, GeometryModel model) {
		super(view, model);
		view.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("click!");
		int x = e.getX();
		int y = e.getY();
		if (e.getButton() == MouseEvent.BUTTON1) {
			model.addNewCircle(x, y, DEFAULT_RADIUS);
		} else if (e.getButton() == MouseEvent.BUTTON2) {
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
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
