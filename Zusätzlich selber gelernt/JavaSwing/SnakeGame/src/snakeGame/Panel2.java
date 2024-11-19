package snakeGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Panel2 extends JPanel {
	
	JLabel panel2Label = new JLabel("JA");
	
	Panel2() {
		this.setPreferredSize(new Dimension((int) getWidth(), (int) (getHeight())));
		this.setBackground(Color.black);
		panel2Label.setForeground(Color.white);
		panel2Label.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
		this.setLayout(new GridBagLayout());
		this.add(panel2Label);
	}
	
}
