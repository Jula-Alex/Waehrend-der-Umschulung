package snakeGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Panel3 extends JPanel{

	JLabel panel3Label = new JLabel("VA", SwingConstants.CENTER);
	
	Panel3(){
		this.setPreferredSize(new Dimension((int) getWidth(), (int) (getHeight())));
		this.setBackground(Color.black);
		panel3Label.setForeground(Color.white);
		panel3Label.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
		this.setLayout(new GridBagLayout());
		this.add(panel3Label);
	}
	
}
