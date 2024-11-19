package jLayeredPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		/*
		 * JLayeredPane = Swing container that provides a third dimension for positioning components 
		 * ex. depth, Z-index
		 */
		JFrame frame = new JFrame();
		
		ImageIcon icon = new ImageIcon("C:\\Users\\IJula\\Desktop\\Java\\JavaSwing\\4.png");
		
		Border border = BorderFactory.createLineBorder(Color.white, 10);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(border);
		layeredPane.setPreferredSize(new Dimension(400, 400));
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label1.setBounds(50, 50, 200, 200);
		label1.setBorder(border);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		label2.setBounds(100, 100, 200, 200);
		label2.setBorder(border);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.BLUE);
		label3.setBounds(150, 150, 200, 200);
		label3.setBorder(border);
		
		layeredPane.add(label1, Integer.valueOf(0));
		layeredPane.add(label2, Integer.valueOf(2));
		layeredPane.add(label3, Integer.valueOf(1));
		
		frame.setSize(1400, 820);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(255, 93, 55));
		frame.setIconImage(icon.getImage());
		frame.setResizable(false);
		frame.setLayout(new BorderLayout());
		frame.add(layeredPane);
		
		frame.setVisible(true);
	}

}
