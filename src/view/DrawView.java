package view;

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
	}

	@Override
	public void draw(Circle circle) {
		// TODO pridat kolecko do swingu
	}

	@Override
	public void draw(Rectangle rectangle) {
		// TODO pridat ctverecek
	}

}
