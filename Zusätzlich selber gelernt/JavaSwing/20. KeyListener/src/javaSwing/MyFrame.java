package javaSwing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.FileChooserUI;

public class MyFrame extends JFrame implements KeyListener {

	JLabel label = new JLabel();

	ImageIcon rocket = new ImageIcon("rocket.png");

	MyFrame() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.black);
//		this.setResizable(false);

		label.setBounds(0, 0, 100, 100);
		label.setIcon(rocket);

//		int frameWidth = this.getWidth();
//		System.out.println(frameWidth);

		this.add(label);
		this.addKeyListener(this);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// keyTyped = Invoked when a key is typed. Uses KeyChar, char output

//		System.out.println(e.getKeyCode()); // tutto zero 
//		System.out.println(e.getKeyChar()); // fa vedere il carattere
//		System.out.println(e.getKeyLocation()); // tutto zero 

		// Get the dimensions of the window and the label
		int frameWidth = this.getWidth();
		int frameHeight = this.getHeight();
		int labelWidth = label.getWidth();
		int labelHeight = label.getHeight();

		// Get the actual position of the JLabel
		int x = label.getX();
		int y = label.getY();

		// Switch with KeyChar()
//		switch (e.getKeyChar()) {
//		case 'a':
//			label.setLocation(label.getX() - 5, label.getY());
//			break;
//		case 'd':
//			label.setLocation(label.getX() + 5, label.getY());
//			break;
//		case 'w':
//			label.setLocation(label.getX(), label.getY() - 5);
//			break;
//		case 's':
//			label.setLocation(label.getX(), label.getY() + 5);
//			break;
//		}
		
		// A better Switch 
		switch(e.getKeyChar()) {
		case 'a':
			x -= 5;
			break;
		case 'd':
			x += 5;
			break;
		case 'w':
			y -= 5;
			break;
		case 's':
			y += 5;
			break;
		}
		
		if(x < -30) x = -30;
		if(x > frameWidth - labelWidth) x = frameWidth - labelWidth;
		if(y < 0) y = 0;
		if(y > frameHeight - labelHeight) y = frameHeight - labelHeight;
		
		label.setLocation(x, y);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int
		// output

		System.out.println(e.getKeyCode()); // shows every single Key number on the keyboard
//		System.out.println(e.getKeyChar()); // shows all the characters, for all the "special keys(alt, f1, shift)" just an empty
//		System.out.println(e.getKeyLocation()); // all the keys on the keyboard are situated on 4 Location

		// Switch with KeyCode()
//		switch(e.getKeyCode()) {
//		case 65: label.setLocation(label.getX() -5, label.getY());
//		break;
//		case 68: label.setLocation(label.getX() +5, label.getY());
//		break;
//		case 87: label.setLocation(label.getX(), label.getY() -5);
//		break;
//		case 83: label.setLocation(label.getX(), label.getY() +5);
//		break;
//		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// keyReleased = called whenever a button is released

//		System.out.println(e.getKeyCode()); // shows every single Key number on the keyboard
//		System.out.println(e.getKeyChar()); // shows all the characters, for all the "special keys(alt, f1, shift)" just an empty
//		System.out.println(e.getKeyLocation()); // all the keys on the keyboard are situated on 4 Location

		// Switch with KeyLocation()
//		switch(e.getKeyLocation()) {
//		case 1: label.setLocation(label.getX() -5, label.getY());
//		break;
//		case 2: label.setLocation(label.getX() +5, label.getY());
//		break;
//		case 3: label.setLocation(label.getX(), label.getY() -5);
//		break;
//		case 4: label.setLocation(label.getX(), label.getY() +5);
//		break;
//		}
	}
}
