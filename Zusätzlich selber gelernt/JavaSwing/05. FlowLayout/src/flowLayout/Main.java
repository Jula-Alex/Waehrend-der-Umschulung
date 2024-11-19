package flowLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		/*
		 * LayoutManager defines the natural layout for compnents within a container,
		 * there are 3 common managers: 
		 * 1. BorderLayout: places components in five areas: top, bottom, left, right and center 
		 * All extra space is placed in the center area. 
		 * 2. FlowLayout: places components one after another in a row, sized at their preferred size and when the horizontal 
		 * space runs out, it starts a new row. It is the default layout manager for JPanel. 
		 * 3. GridLayout: arranges components in a rectangular grid with a specified number 
		 * of rows and columns All components within the grid have the same size.
		 */
		
		JFrame frame = new JFrame(); 
		frame.setSize(1400, 820);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 100)); // The first (Horizontal) is irrelevant
//		frame.setLayout(new BorderLayout());
//		frame.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(250, 250));
		panel.setBackground(Color.lightGray);
//		panel.setLayout(new FlowLayout());
//		panel.setBounds(100, 100, 300, 300);
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		panel.add(new JButton("10"));
		panel.add(new JButton("11"));
		
		frame.add(panel);
		
		frame.setVisible(true);
	}

}
