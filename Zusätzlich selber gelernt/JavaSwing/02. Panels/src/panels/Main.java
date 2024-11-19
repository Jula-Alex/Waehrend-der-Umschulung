package panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		ImageIcon icon = new ImageIcon("1.jpg");
		ImageIcon icon2 = new ImageIcon("2.jpg");
		ImageIcon icon3 = new ImageIcon("4.png");

		Border borderYellow = BorderFactory.createLineBorder(Color.yellow, 5);
		Border borderWhite = BorderFactory.createLineBorder(Color.white, 5);
		Border borderBlack = BorderFactory.createLineBorder(Color.black, 5);

		JLabel label = new JLabel();
		label.setText("O Mamma Mia... ");
		label.setIcon(icon);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.white);
		label.setFont(new Font("MV Boli", Font.BOLD, 25));
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 30));
		label.setBounds(0, 0, 400, 400);

		JLabel label2 = new JLabel();
		label2.setText("Ragazzi !!!");
		label2.setIcon(icon2);
		label2.setVerticalTextPosition(JLabel.TOP);
		label2.setHorizontalTextPosition(JLabel.CENTER);
		label2.setForeground(Color.white);
		label2.setFont(new Font("MV Boli", Font.BOLD, 25));
		label2.setVerticalAlignment(JLabel.BOTTOM);
		label2.setHorizontalAlignment(JLabel.RIGHT);
		label2.setBorder(borderWhite);
		label2.setBounds(0, 0, 400, 400);

		JLabel label3 = new JLabel();
		label3.setText("Ma cosa state combinando !!!");
		label3.setIcon(icon3);
		label3.setHorizontalTextPosition(JLabel.CENTER);
		label3.setVerticalTextPosition(JLabel.TOP);
		label3.setForeground(Color.white);
		label3.setFont(new Font("MV Boli", Font.BOLD, 25));
		label3.setVerticalAlignment(JLabel.BOTTOM);
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setBorder(borderBlack);
		label3.setBounds(0, 0, 800, 400);

		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 400, 400);
//		redPanel.setLayout(new BorderLayout());
		redPanel.setLayout(null);

		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(400, 0, 400, 400);
//		bluePanel.setLayout(new BorderLayout());
		bluePanel.setLayout(null);

		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 350, 800, 400);
//		greenPanel.setLayout(new BorderLayout());
		greenPanel.setLayout(null);

		JFrame frame = new JFrame();
		frame.setSize(1300, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		redPanel.add(label);
		bluePanel.add(label2);
		greenPanel.add(label3);
	}

}
