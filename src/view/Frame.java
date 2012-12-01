package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2773168040909497332L;
	
	public Frame(View leftView, View rightView) {
		setLayout(new BorderLayout());
		setSize(800, 500);
		setTitle("DPO 4: MVC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Button clearButton = new Button("Clear all");
		
		Dimension halfSize = new Dimension(this.getWidth() / 2, this.getHeight() - clearButton.getHeight());
		
		leftView.setSize(halfSize);
		rightView.setSize(halfSize);
		
		Container contentPane = getContentPane();
		
		contentPane.add(rightView, BorderLayout.NORTH);
		contentPane.add(leftView, BorderLayout.CENTER);
		contentPane.add(clearButton, BorderLayout.SOUTH);
		
//		pack();
		
		this.setVisible(true);
		
	}

}
