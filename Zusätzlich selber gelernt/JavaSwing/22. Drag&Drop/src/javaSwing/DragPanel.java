package javaSwing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DragPanel extends JPanel {

	ImageIcon rocket = new ImageIcon("rocket.png");
	
	JLabel label = new JLabel();

	final int WIDTH = rocket.getIconWidth(); // 94
	final int HEIGHT = rocket.getIconHeight(); // 94

	Point rocketCorner;
	Point prevPt;
	Point currentPt;
	
	int x,y;

	DragPanel() {
		System.out.println("width " + WIDTH + " height " + HEIGHT);

		rocketCorner = new Point(100, 100);

		System.out.println(rocketCorner);
		
		this.add(label);

		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				prevPt = e.getPoint();
				System.out.println(prevPt);
			}
		});

		addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				currentPt = e.getPoint();
				System.out.println(currentPt);

				rocketCorner.translate((int) currentPt.getX() - (int) prevPt.getX(), (int) currentPt.getY() - (int) prevPt.getY());

				prevPt = currentPt;
				repaint();
			}
			
			public void mouseMoved(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				label.setText("The coordinates are: X= " + x + " Y= " + y);
				label.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			}
		});
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		rocket.paintIcon(this, g, (int) rocketCorner.getX(), (int) rocketCorner.getY());
	}
}
