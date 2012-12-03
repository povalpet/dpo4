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

	
	public Frame(View left, View right, View button) {
		setSize(810, 470);
		setTitle("DPO 4: MVC");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addComponentsToPane(this.getContentPane(), left, right, button);
		setVisible(true);		
	}
	
	public void addComponentsToPane(Container pane, View left, View right, View button) {
		JPanel components = new JPanel();
		components.setPreferredSize(new Dimension(800, 420));
		FlowLayout layout = new FlowLayout();
		layout.setAlignment(FlowLayout.LEFT);
		components.setLayout(layout);
		
		left.setPreferredSize(new Dimension(485,410));
		right.setPreferredSize(new Dimension(310,410));
		button.setPreferredSize(new Dimension(400,23));
		components.add(left);
		components.add(right);
		//components.add(button);
		
		pane.add(components, BorderLayout.CENTER);
		pane.add(button, BorderLayout.SOUTH);
	}

}
