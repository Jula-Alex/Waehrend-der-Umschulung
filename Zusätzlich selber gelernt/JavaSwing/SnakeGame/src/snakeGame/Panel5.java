package snakeGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Panel5 extends JPanel {

	JLabel panel5Label = new JLabel("TZENERGAME...", SwingConstants.CENTER);
	
	Panel5(){
		this.setPreferredSize(new Dimension((int) getWidth(), (int) (getHeight())));
		this.setBackground(Color.black);
		panel5Label.setForeground(Color.white);
		panel5Label.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
		this.setLayout(new GridBagLayout());
		this.add(panel5Label);
	}
}
