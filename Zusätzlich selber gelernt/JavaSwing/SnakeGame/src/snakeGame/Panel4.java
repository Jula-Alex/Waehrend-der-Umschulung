package snakeGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Panel4 extends JPanel{

	JLabel panel4Label = new JLabel("SWING", SwingConstants.CENTER);
	
	Panel4() {
		this.setPreferredSize(new Dimension((int) getWidth(), (int) (getHeight())));
		this.setBackground(Color.black);
		panel4Label.setForeground(Color.white);
		panel4Label.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
		this.setLayout(new GridBagLayout());
		this.add(panel4Label);
	}
}
