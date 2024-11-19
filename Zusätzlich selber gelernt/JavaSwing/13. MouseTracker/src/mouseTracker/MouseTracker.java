package mouseTracker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MouseTracker extends JFrame implements MouseMotionListener {

	// Images
	ImageIcon frameIcon = new ImageIcon("mouseIcon.jpg");
	ImageIcon lofiGirlImage = new ImageIcon("lofiGirl.gif");

	// Panels
	JPanel bigPanel = new JPanel();
	JPanel centerPanel = new JPanel();
	JPanel bottomPanel = new JPanel();
	JPanel buttonPanel = new JPanel();

	// Labels
	JLabel label = new JLabel("Move the mouse to see coordinates");
	JLabel label2 = new JLabel("Move the mouse to see coordinates");
	JLabel lofiGirlLabel = new JLabel(); // The image goes here 

	// Borders
	Border black = BorderFactory.createLineBorder(Color.black, 5);
	Border red = BorderFactory.createLineBorder(Color.red, 5);
	Border blue = BorderFactory.createLineBorder(Color.blue, 5);

	// Buttons
	JButton lofiButton = new JButton("Click here for LofiGirl");

	MouseTracker() {
		// Frame Setup
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(frameIcon.getImage());
		setTitle("Mouse Tracker");
		setResizable(true);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);

		// PANELS
		// Big Panel Setup
		add(bigPanel, BorderLayout.CENTER);
		bigPanel.setBorder(black);
		bigPanel.setLayout(new BorderLayout());

		// Center Panel Setup
		bigPanel.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setBorder(red);
		centerPanel.setLayout(new GridBagLayout());
		centerPanel.add(lofiGirlLabel);

		// Bottom Panel Setup
		bigPanel.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setPreferredSize(new Dimension(1000, 100));
		bottomPanel.setBorder(blue);
		bottomPanel.add(label);
		bottomPanel.setLayout(new GridBagLayout());

		// PANELS
		// Button Panel
		buttonPanel.add(lofiButton);
		buttonPanel.setBorder(black);

		// LABELS
		// Label Setup
		label.setBorder(black);
		label.setFont(new Font("Comis Sans MS", Font.BOLD, 20));
		this.addMouseMotionListener(this);

		// LofiGirlLabel
		lofiGirlLabel.setIcon(lofiGirlImage);
		lofiGirlLabel.setBorder(blue);

		// BUTTONS
		// Buttons
		lofiButton.setFocusable(false);
		lofiButton.setBorder(blue);

		setVisible(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		label.setText("Mouse draged on X: " + x + ", Y: " + y);

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		label.setText("Mouse moved on X: " + x + ", Y: " + y);
	}

}
