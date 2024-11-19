package javaSwing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.FileChooserUI;

public class MyFrame extends JFrame implements MouseListener {

	JLabel squareLabel = new JLabel();
	JLabel textLabel = new JLabel();

	MyFrame() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);

		squareLabel.setBounds(0, 0, 100, 100);
		squareLabel.setBackground(Color.red);
		squareLabel.setOpaque(true);
		squareLabel.addMouseListener(this);
		
		textLabel.setBounds(0, 150, 500, 100);
		
		this.add(textLabel);
		this.add(squareLabel);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on a component
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoke when a mouse button has been pressed (only pressed) on a component
		squareLabel.setBackground(Color.red);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released (only released) on a component
		squareLabel.setBackground(Color.blue);

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters an area of a component (like a hover)
		textLabel.setText("You entered the area of the square label.");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits an area of a component (like a hover)
		textLabel.setText("You exit the area of the square label.");
	}

}
