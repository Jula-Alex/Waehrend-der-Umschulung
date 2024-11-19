package wiSo;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Frame2 extends JFrame {
	
	SecondPanel secondPanel = new SecondPanel();
	
	Frame2() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("QWiso - Winter 2021/22");
		setLocationRelativeTo(null);

		setLayout(new BorderLayout());
		

		add(secondPanel, BorderLayout.CENTER);
		setVisible(true);
	}
}
