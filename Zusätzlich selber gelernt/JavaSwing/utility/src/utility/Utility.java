package utility;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class Utility extends JFrame {
	
	Utility() {
	
	// BORDER COLORS
	public static final Border BORDER_BLACK = BorderFactory.createLineBorder(Color.black, 5);
	public static final Border BORDER_RED = BorderFactory.createLineBorder(Color.red, 5);
	public static final Border BORDER_BLUE = BorderFactory.createLineBorder(Color.blue, 5);
	public static final Border BORDER_GREEN = BorderFactory.createLineBorder(Color.green, 5);
	public static final Border BORDER_YELLOW = BorderFactory.createLineBorder(Color.yellow, 5);
	public static final Border BORDER_MAGENTA = BorderFactory.createLineBorder(Color.magenta, 5);
	public static final Border BORDER_PINK = BorderFactory.createLineBorder(Color.pink, 5);
	public static final Border BORDER_GRAY = BorderFactory.createLineBorder(Color.gray, 5);
	public static final Border BORDER_CYAN = BorderFactory.createLineBorder(Color.cyan, 5);
	public static final Border BORDER_ORANGE = BorderFactory.createLineBorder(Color.orange, 5);
	public static final Border BORDER_WHITE = BorderFactory.createLineBorder(Color.white, 5);
	
	// Frame
	this.setSize(500, 500);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	this.setVisible(true);
	this.setLocationRelativeTo(null);
	}
}

