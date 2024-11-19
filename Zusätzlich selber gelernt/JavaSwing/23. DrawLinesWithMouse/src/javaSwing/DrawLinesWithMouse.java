package javaSwing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class DrawLinesWithMouse extends JPanel {

	Border borderBlack = BorderFactory.createLineBorder(Color.black, 5);
	
	int startX, startY, endX, endY;
	
	DrawLinesWithMouse() {
		setBorder(borderBlack);
		setPreferredSize(new Dimension(500, 500));
		
//		addMouseListener(new MouseAdapter() {
//			public void mousePressed(MouseEvent yo) {
//				startX = yo.getX();
//				startY = yo.getY();
//				System.out.println("startX: " + startX + " startY: " + startY);
////				repaint();
//			}
//			
//			public void mouseReleased(MouseEvent daje) {
//				endX = daje.getX();
//				endY = daje.getY();
//				System.out.println("endX: " + startX + " endY: " + startY);
//				repaint();
//			}
//		});
		
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				startX = e.getX();
				startY = e.getY();
				endX = e.getX();
				endY = e.getY();
				System.out.println(startX + "  " + startY + "---" + endX + "  " + endY);
				repaint();
			}
		});
	}
	
	protected void paintComponent(Graphics disegnatore) {
//		super.paintComponent(disegnatore);
//		disegnatore.setColor(Color.red);
//		disegnatore.drawRect(startX, startY, endX, endY);
//		disegnatore.drawLine(startX, startY, endX, endY);
//		disegnatore.drawOval(startX, startY, endX, endY);
		Graphics2D g2d = (Graphics2D) disegnatore; // Cast Object Graphics in Graphics2D 
		g2d.setColor(Color.RED);
		g2d.setStroke(new BasicStroke(10));
		g2d.drawLine(startX, startY, endX, endY);
	}
}
