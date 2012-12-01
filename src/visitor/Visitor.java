package visitor;

import model.Circle;
import model.Square;

public interface Visitor {
	void draw(Circle circle);
	void draw(Square rectangle);
}
