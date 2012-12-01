package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2773168040909497332L;
	
//	public Frame(View leftView, View rightView) {
//		setLayout(new BorderLayout());
//		setSize(800, 500);
//		setTitle("DPO 4: MVC");
//		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Button clearButton = new Button("Clear all");
//		
//		Dimension halfSize = new Dimension(this.getWidth() / 2, this.getHeight() - clearButton.getHeight());
//		
//		leftView.setSize(halfSize);
//		rightView.setSize(halfSize);
//		
//		Container contentPane = getContentPane();
//		
//		contentPane.add(rightView, BorderLayout.EAST);
//		contentPane.add(leftView, BorderLayout.CENTER);
//		contentPane.add(clearButton, BorderLayout.SOUTH);
//		
//		this.setVisible(true);
//		
//	}
	
	public Frame(View left, View right) {
		setSize(810, 470);
		setTitle("DPO 4: MVC");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addComponentsToPane(this.getContentPane(), left, right);
		setVisible(true);		
	}
	
	public void addComponentsToPane(final Container pane, View left, View right) {
		JPanel components = new JPanel();
		components.setPreferredSize(new Dimension(800, 420));
		FlowLayout layout = new FlowLayout();
		layout.setAlignment(FlowLayout.LEFT);
		components.setLayout(layout);
		
		left.setPreferredSize(new Dimension(485,410));
		right.setPreferredSize(new Dimension(310,410));
		components.add(left);
		components.add(right);
		Button clearButton = new Button("Clear all");
		
		pane.add(components, BorderLayout.CENTER);
		pane.add(clearButton, BorderLayout.SOUTH);
	}

}
