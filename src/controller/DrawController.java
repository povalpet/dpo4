package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.GeometryModel;
import view.DrawView;

public class DrawController extends AbstractController implements MouseListener {

	public static final int DEFAULT_RADIUS = 30;
	public static final int MAXIMUM_COUNT = 5;

	protected State state;

	public DrawController(DrawView view, GeometryModel model) {
		super(view, model);
		view.addMouseListener(this);
		this.state = new AddState();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (e.getButton() == MouseEvent.BUTTON1) {
			// left mouse button
			state.handleCircle(x, y, DEFAULT_RADIUS);

		} else {
			// other buttons
			state.handleSquare(x, y, DEFAULT_RADIUS);
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
		int count = model.getAll().size();
		if (count >= MAXIMUM_COUNT) {
			this.state = new ReplaceState();
		} else {
			this.state = new AddState();
		}
	}

	abstract class State {
		abstract void handleCircle(int x, int y, int radius);

		abstract void handleSquare(int x, int y, int radius);
	}

	private class AddState extends State {

		@Override
		void handleCircle(int x, int y, int radius) {
			model.addNewCircle(x, y, radius);
		}

		@Override
		void handleSquare(int x, int y, int radius) {
			model.addNewRectangle(x, y, radius);
		}

	}

	private class ReplaceState extends State {

		@Override
		void handleCircle(int x, int y, int radius) {
			model.removeOldest();
			model.addNewCircle(x, y, radius);
		}

		@Override
		void handleSquare(int x, int y, int radius) {
			model.removeOldest();
			model.addNewRectangle(x, y, radius);
		}

	}

}
