package javaSwing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
public class MyFrame extends JFrame {
	
	DragPanel dragPanel = new DragPanel();

	MyFrame() {
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		
		
		this.add(dragPanel);
//		this.pack();
		this.setVisible(true);
	}
}
