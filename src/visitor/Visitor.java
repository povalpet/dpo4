package visitor;

import model.Circle;
import model.Rectangle;

public interface Visitor {
	void draw(Circle circle);
	void draw(Rectangle rectangle);
}
