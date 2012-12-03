package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.GeometryModel;
import view.ButtonView;

public class ButtonController extends AbstractController{

	public ButtonController(ButtonView view, GeometryModel model) {
		super(view, model);
		view.addOnClickListener(new OnClickListener());
	}

	@Override
	public void updateObserver() {
	}
	
	class OnClickListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			model.clearAll();
		}
		
	}

}
