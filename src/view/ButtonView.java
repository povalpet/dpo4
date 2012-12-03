package view;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import model.Circle;
import model.GeometryModel;
import model.Square;

public class ButtonView extends View{
	
	Button clearButton;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ButtonView(GeometryModel model) {
		super(model);
		
		init();
	}
	
	private void init()
	{
		JPanel panel = new JPanel();
		panel.setSize(100,40);
		clearButton = new Button("Clear all");
		clearButton.setPreferredSize(new Dimension(300,20));		
		panel.add(clearButton);
		this.add(panel);
		
		this.setVisible(true);
	}

	@Override
	public void updateObserver() {
	}

	@Override
	public void draw(Circle circle) {
	}

	@Override
	public void draw(Square rectangle) {
	}
	
	public void addOnClickListener(ActionListener l) {
		clearButton.addActionListener(l);
	}

}
