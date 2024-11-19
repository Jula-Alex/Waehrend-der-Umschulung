package buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

	JButton button;
	JButton button2;

	JLabel label;

	MyFrame() {

		/*
		 * Without "implements ActionListener" and without
		 * "public void actionPerformed": LAMBDA EXPRESSION button.addActionListener(e
		 * -> System.out.println("poo"));
		 */

		// Images
		ImageIcon icon = new ImageIcon("2.jpg");
		ImageIcon icon2 = new ImageIcon("4.png");
		ImageIcon frameIcon = new ImageIcon("1.jpg");

		// Labels
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(300, 400, 300, 300);
		label.setBorder(BorderFactory.createLineBorder(Color.white, 10));
		label.setVisible(false);

		// Buttons
		// Button
		button = new JButton();
		button.setBounds(50, 50, 350, 300);
		button.addActionListener(this);
		button.setText("Click for photo");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.TOP);
		button.setFont(new Font("Comic Sans", Font.ITALIC, 30));
		button.setForeground(Color.MAGENTA);
		button.setBackground(new Color(255, 62, 120));
		button.setIconTextGap(25);
		button.setBorder(BorderFactory.createEtchedBorder());
//		button.setEnabled(false); // it will disable the button 
		// Button2
		button2 = new JButton();
		button2.setBounds(500, 50, 350, 300);
		button2.addActionListener(this);
		button2.setText("Click for no photo");
		button2.setFocusable(false);
		button2.setIcon(icon);
		button2.setHorizontalTextPosition(JButton.CENTER);
		button2.setVerticalTextPosition(JButton.TOP);
		button2.setFont(new Font("Comic Sans", Font.ITALIC, 30));
		button2.setForeground(Color.GREEN);
		button2.setBackground(new Color(255, 62, 120));
		button2.setIconTextGap(25);
		button2.setBorder(BorderFactory.createEtchedBorder());

		// Frame setup
		this.setSize(900, 800);
		this.setVisible(true);
		this.setTitle("Buttons");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(frameIcon.getImage());
		this.getContentPane().setBackground(new Color(123, 32, 89));
		this.setResizable(false);
		this.setLayout(null);
		this.add(button);
		this.add(button2);
		this.add(label);
	}

	// Function for button
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			System.out.println("Here is the Photo !");
//			button.setEnabled(false); // it will work just one time then will be disabled
			label.setVisible(true);
		}

		if (e.getSource() == button2) {
			label.setVisible(false);
			System.out.println("Where is the Photo ?");
		}

	}
}
