package wiSo;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class Frame extends JFrame {

	StartPanel startPanel = new StartPanel();

	Frame() {
		setSize(1200, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("QWiso");
		setLocationRelativeTo(null);
		getContentPane().setBackground(new Color(179, 198, 255));
		

		add(startPanel);
		setVisible(true);
	}

}
