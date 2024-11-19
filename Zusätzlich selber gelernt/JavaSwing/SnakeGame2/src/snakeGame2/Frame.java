package snakeGame2;

import javax.swing.*;

public class Frame extends JFrame {
	GamePanel panel = new GamePanel();
	Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panel);
		setResizable(false);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
