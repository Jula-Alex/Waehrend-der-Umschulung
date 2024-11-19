package borderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

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
//		------------------------- Frame setup --------------------------------------
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout(10, 10)); // first for the Horizontal and second for Vertical MARGIN

//		------------------------- Panel creation --------------------------------------
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

//		------------------------- Panel coloration --------------------------------------
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);

//		------------------------- Panel setup Dimensions --------------------------------------
		// The first it's Horizontal and the second it's Vertical
		panel1.setPreferredSize(new Dimension(1000, 50)); // North, just the second(Vertical) is relevant
		panel2.setPreferredSize(new Dimension(5000, 50)); // South, just the second(Vertical) is relevant
		panel3.setPreferredSize(new Dimension(50, 4000)); // East, just the first(Horizontal) is relevant
		panel4.setPreferredSize(new Dimension(50, 6000)); // West, just the first(Horizontal) is relevant
		panel5.setPreferredSize(new Dimension(10000, 5000)); // Center, neither of the two are relevant

//		------------------------- Add All The Panels To The Frame ---------------------------------------
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.SOUTH);
		frame.add(panel3, BorderLayout.EAST);
		frame.add(panel4, BorderLayout.WEST);
		frame.add(panel5, BorderLayout.CENTER);

//		------------------------- Panel5 sub panels --------------------------------------
		panel5.setLayout(new BorderLayout());
//		------------------------- SubPanel creation ---------------------------------------
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();

//		------------------------- SubPanel coloration ---------------------------------------
		panel6.setBackground(Color.black);
		panel7.setBackground(Color.darkGray);
		panel8.setBackground(Color.gray);
		panel9.setBackground(Color.lightGray);
		panel10.setBackground(Color.white);

//		------------------------- SubPanel Setup Dimensions ---------------------------------------
		// The first it's Horizontal and the second it's Vertical
		panel6.setPreferredSize(new Dimension(50, 50)); // North, just the second(Vertical) is relevant
		panel7.setPreferredSize(new Dimension(50, 50)); // South, just the second(Vertical) is relevant
		panel8.setPreferredSize(new Dimension(50, 50)); // East, just the first(Horizontal) is relevant
		panel9.setPreferredSize(new Dimension(50, 50)); // West, just the first(Horizontal) is relevant
		panel10.setPreferredSize(new Dimension(50, 50)); // Center, neither of the two are relevant

//		------------------------- Add All The SubPanel to Panel5 ---------------------------------------
		panel5.add(panel6, BorderLayout.NORTH);
		panel5.add(panel7, BorderLayout.SOUTH);
		panel5.add(panel8, BorderLayout.EAST);
		panel5.add(panel9, BorderLayout.WEST);
		panel5.add(panel10, BorderLayout.CENTER);

		// ------------------------------ Panel10 subPanels -------------------------------------------------
//		------------------------- Panel10 sub panels --------------------------------------
		panel10.setLayout(new BorderLayout());
//		------------------------- SubPanel creation ---------------------------------------
		JPanel panel11 = new JPanel();
		JPanel panel12 = new JPanel();
		JPanel panel13 = new JPanel();
		JPanel panel14 = new JPanel();
		JPanel panel15 = new JPanel();

//		------------------------- SubPanel coloration ---------------------------------------
		panel11.setBackground(new Color(123, 240, 75));
		panel12.setBackground(new Color(12, 110, 193));
		panel13.setBackground(new Color(255, 2, 55));
		panel14.setBackground(new Color(76, 23, 210));
		panel15.setBackground(new Color(123,50,210));

//		------------------------- SubPanel Setup Dimensions ---------------------------------------
		// The first it's Horizontal and the second it's Vertical
		panel11.setPreferredSize(new Dimension(50, 50)); // North, just the second(Vertical) is relevant
		panel12.setPreferredSize(new Dimension(50, 50)); // South, just the second(Vertical) is relevant
		panel13.setPreferredSize(new Dimension(50, 50)); // East, just the first(Horizontal) is relevant
		panel14.setPreferredSize(new Dimension(50, 50)); // West, just the first(Horizontal) is relevant
		panel15.setPreferredSize(new Dimension(50, 50)); // Center, neither of the two are relevant

//		------------------------- Add All The SubPanel to Panel5 ---------------------------------------
		panel10.add(panel11, BorderLayout.NORTH);
		panel10.add(panel12, BorderLayout.SOUTH);
		panel10.add(panel13, BorderLayout.EAST);
		panel10.add(panel14, BorderLayout.WEST);
		panel10.add(panel15, BorderLayout.CENTER);

		// ------------------------------ Panel15 subPanels ---------------------------------------------------
	}

}
