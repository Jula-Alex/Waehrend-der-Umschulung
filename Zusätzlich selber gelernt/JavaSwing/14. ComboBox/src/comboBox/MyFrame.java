package comboBox;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener {

	// Images
	ImageIcon cat = new ImageIcon("cat.jpg");
	ImageIcon dog = new ImageIcon("dog.jpg");
	ImageIcon horse = new ImageIcon("horse.jpg");
	ImageIcon bird = new ImageIcon("bird.jpg");

	// Labels
	JLabel imageLabel = new JLabel();

	// Panels
	JPanel comboPanel = new JPanel();
	JPanel imagePanel = new JPanel();

	// ComboBox
	JComboBox comboBox;

	String[] animals = { "dog", "cat", "horse", "bird" };

	// Layouts
	GridBagLayout center = new GridBagLayout();

	MyFrame() {
		// Frame Setup
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLocationRelativeTo(null);
		setSize(1500, 800);
		setLayout(new BorderLayout());
		add(comboPanel, BorderLayout.NORTH);
		add(imagePanel, BorderLayout.CENTER);

		// ComboBox
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		comboBox.addItem("Elephant");

		// Panels
		comboPanel.add(comboBox);
		comboPanel.setPreferredSize(new Dimension(0, 50));
		comboPanel.setLayout(center);
		imagePanel.add(imageLabel);
		imagePanel.setLayout(new GridBagLayout());

		// Labels

		setVisible(true);
//		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
//			System.out.println(comboBox.getSelectedIndex());
		}
		if (comboBox.getSelectedItem() == "dog") {
			imageLabel.setIcon(dog);
			imageLabel.setText(null);
		}
		if (comboBox.getSelectedItem() == "cat") {
			imageLabel.setIcon(cat);
			imageLabel.setText(null);
		}
		if (comboBox.getSelectedItem() == "horse") {
			imageLabel.setIcon(horse);
			imageLabel.setText(null);
		}
		if (comboBox.getSelectedItem() == "bird") {
			imageLabel.setIcon(bird);
			imageLabel.setText(null);
		}
		if (comboBox.getSelectedItem() == "Elephant") {
			imageLabel.setText("No Image For That Animal");
			imageLabel.setIcon(null);
		}
	}
}
