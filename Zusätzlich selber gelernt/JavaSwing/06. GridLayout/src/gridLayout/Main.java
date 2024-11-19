package gridLayout;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

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
		 * of rows and columns. Each component takes all the available space within its cell.
		*/
		JFrame frame = new JFrame();
		
		ImageIcon icon = new ImageIcon("C:\\Users\\IJula\\Desktop\\Java\\JavaSwing\\1.jpg");
		
		JButton button;
		
		frame.setSize(1400, 820);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GridLayout");
		frame.setIconImage(icon.getImage());
		frame.getContentPane().setBackground(new Color(82, 200, 190));
		// the first it's the number of columns(vertical) and the second it's the number of rows(horizontal)
		// the third it's the number of margin(vertical) and the fourth it's the number of margin(horizontal)
		frame.setLayout(new GridLayout(4, 3, 10, 10));
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		frame.add(new JButton("10"));
		
		
		
		
		frame.setVisible(true);
	}

}
