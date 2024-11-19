package progressBar;

import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo extends JFrame {
	
	JProgressBar bar = new JProgressBar();
	
	ProgressBarDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(420, 420);
		setLayout(null);
		setLocationRelativeTo(null);

		bar.setValue(50);
		bar.setBounds(0, 0, 420, 50);
		bar.setStringPainted(true);
		bar.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		bar.setForeground(Color.red);
//		bar.setBackground(Color.green);
		
		add(bar);
		setVisible(true);
		
//		fill();
	}
	
	public void fill() {
		int counter = 0;
		
		while(counter <= 100) {
			bar.setValue(counter);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter++;
		}
		bar.setString("Done Junge ! :)");
	}
	
}







