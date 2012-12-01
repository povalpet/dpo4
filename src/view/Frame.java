package view;

import javax.swing.JFrame;

public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2773168040909497332L;
	
	public Frame(View leftView, View rightView) {
		setSize(800, 500);
		setTitle("DPO 4: MVC");
		setVisible(true);
		this.add(leftView);
		this.add(rightView);
	}

}
