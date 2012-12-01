package view;

import model.IGeometry;
import model.Model;

public abstract class View {
	
	public View(Model model) {
		this.listen(model);
	}
	
	protected abstract void listen(Model model);

	public abstract void display(IGeometry geometry);

}
