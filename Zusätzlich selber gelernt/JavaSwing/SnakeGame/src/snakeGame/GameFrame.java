package snakeGame;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class GameFrame extends JFrame {
	
	Panel2 panel2 = new Panel2();
	Panel3 panel3 = new Panel3();
	
	GameFrame() {
		this.setTitle("SnakeGame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		
		
		
		this.add(panel2);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}

}
