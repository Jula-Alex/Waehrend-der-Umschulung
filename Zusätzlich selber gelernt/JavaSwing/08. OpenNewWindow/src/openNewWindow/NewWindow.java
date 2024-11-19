package openNewWindow;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
	JFrame frame = new JFrame(); 
	JLabel label = new JLabel("Hello There, this is a new Window");
	
	NewWindow() {
		
		label.setBounds(0, 0, 600, 30);
		label.setFont(new Font(null, Font.PLAIN, 30));
		
		frame.setSize(600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.add(label);
		frame.setVisible(true);
	}
}
