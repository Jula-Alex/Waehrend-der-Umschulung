package javaSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		JLabel label = new JLabel();
		
		ImageIcon icon = new ImageIcon("1.jpg");
		ImageIcon image = new ImageIcon("4.png");
		
		Border borderLabel = BorderFactory.createLineBorder(Color.red, 10);
		
		// Label
		label.setText("First label");
		label.setForeground(Color.green);
		label.setFont(new Font("MV Boli", Font.BOLD, 30));
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setBorder(borderLabel);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setIconTextGap(25);
		label.setBackground(Color.blue);
		label.setOpaque(true);
//		label.setBounds(100, 0, 300, 300);
		label.setLayout(null);
		
		// Frame
		frame.setSize(1200, 800);
		frame.setTitle("Java Swing");
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(123, 50, 210));
		frame.setIconImage(icon.getImage());
		frame.add(label);
		frame.setVisible(true);
//		frame.pack();
	}

}
