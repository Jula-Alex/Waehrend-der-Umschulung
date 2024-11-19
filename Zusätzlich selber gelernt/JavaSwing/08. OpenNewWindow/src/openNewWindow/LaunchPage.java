package openNewWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton button = new JButton("Press for new Window");
	
	LaunchPage() {
		button.setBounds(10, 100, 300, 30);
		button.addActionListener(this);
		button.setFocusable(false);

		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.add(button);
		frame.setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			NewWindow window = new NewWindow();
			frame.dispose();
		}
		
	}
}
