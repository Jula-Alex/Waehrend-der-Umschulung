package javaSwing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.FileChooserUI;

public class MyFrame extends JFrame implements ActionListener {
	
	JColorChooser colorChooser = new JColorChooser();
	
	JButton buttonText = new JButton("Pick a Color for the text");
	JButton buttonBackground = new JButton("Pick a Color for the background");
	
	JLabel label = new JLabel();
	MyFrame() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);

		label.setBackground(Color.white);
		label.setOpaque(true);
		label.setText("This is some text");
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
//		label.setBorder(BorderFactory.createLineBorder(Color.red, 5));
//		button.setBorder(BorderFactory.createLineBorder(Color.red, 5));
		
		buttonText.addActionListener(this); 
		buttonBackground.addActionListener(this);
		
		this.add(label);
		this.add(buttonText);
		this.add(buttonBackground);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonText) {
			Color color = JColorChooser.showDialog(null, "Pick a Color", Color.blue);
			label.setForeground(color);
		}
		if(e.getSource() == buttonBackground) {
			Color color = JColorChooser.showDialog(null, "Pick a Color for the Background", Color.white);
			label.setBackground(color);
		}
	}
}
