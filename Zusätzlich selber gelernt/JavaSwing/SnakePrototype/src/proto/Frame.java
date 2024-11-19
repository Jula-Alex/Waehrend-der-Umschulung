package proto;

import javax.swing.*;

public class Frame extends JFrame {
	Panel panel = new Panel();
	Frame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panel);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
