package wiSo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class SecondPanel extends JPanel {
	// Border
	Border red = BorderFactory.createLineBorder(Color.red, 3);
	// Panels
	JPanel panelLeft = new JPanel();
	JPanel panelBottom = new JPanel();
	JPanel panelTop = new JPanel();
	JPanel panelCenter = new JPanel();
	JPanel numFragePanel = new JPanel();
	JPanel container = new JPanel();
	JPanel textCon = new JPanel();
	JPanel buttonsCon = new JPanel();
	JPanel scrollButtonsCon = new JPanel();
	JPanel actionButtonsCon = new JPanel();
	// Variables
	int num;
	// Labels
	JLabel numFrage = new JLabel("Frage Nr. 1");
	JLabel test = new JLabel();
	// Buttons Icons
	ImageIcon maxLeftI = new ImageIcon("maxLeft.png");
	ImageIcon leftI = new ImageIcon("left.png");
	ImageIcon maxRightI = new ImageIcon("maxRight.png");
	ImageIcon rightI = new ImageIcon("right.png");
	ImageIcon treeIcon = new ImageIcon("treeIcon.jpg");
	// Buttons
	JButton maxLeft = new JButton();
	JButton left = new JButton();
	JButton maxRight = new JButton();
	JButton right = new JButton();

	SecondPanel() {
		setBackground(new Color(179, 198, 255));
		setLayout(new BorderLayout());
//		setBorder(red);

//		panelLeft.setBackground(Color.black);
		panelLeft.setPreferredSize(new Dimension(50, 0));

//		panelBottom.setBackground(Color.red);
		panelBottom.setPreferredSize(new Dimension(0, 180));

//		panelTop.setBackground(Color.red);
		panelTop.setPreferredSize(new Dimension(0, 20));

//		panelCenter.setBackground(Color.green);
		panelCenter.setLayout(new BorderLayout());

//		numFragePanel.setBackground(Color.yellow);
		numFragePanel.setPreferredSize(new Dimension(0, 20));
		numFragePanel.setLayout(new BorderLayout());

		numFrage.setFont(new Font("Arial", Font.PLAIN, 15));

//		container.setBackground(Color.magenta);
		container.setPreferredSize(new Dimension(650, 0));
		container.setLayout(new BorderLayout());

//		buttonsCon.setBackground(Color.white);
		buttonsCon.setPreferredSize(new Dimension(0, 105));
		buttonsCon.setLayout(new BorderLayout());

//		scrollButtonsCon.setBackground(Color.yellow);
		scrollButtonsCon.setPreferredSize(new Dimension(0, 45));
		scrollButtonsCon.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));

//		actionButtonsCon.setBackground(Color.black);
		actionButtonsCon.setPreferredSize(new Dimension(0, 45));
		actionButtonsCon.setLayout(new BorderLayout());

		// Scroll Buttons
		maxLeft.setPreferredSize(new Dimension(80, 30));
		maxLeft.setIcon(maxLeftI);
		maxLeft.setHorizontalTextPosition(JButton.CENTER);

		left.setPreferredSize(new Dimension(80, 30));
		left.setIcon(leftI);

		maxRight.setPreferredSize(new Dimension(80, 30));
		maxRight.setIcon(maxRightI);

		right.setPreferredSize(new Dimension(80, 30));
		right.setIcon(rightI);
		
		
		test.setIcon(treeIcon);
		test.setPreferredSize(new Dimension(300, 300));

		this.add(panelLeft, BorderLayout.WEST);
		this.add(panelBottom, BorderLayout.SOUTH);
		this.add(panelTop, BorderLayout.NORTH);
		this.add(panelCenter, BorderLayout.CENTER);
		panelCenter.add(numFragePanel, BorderLayout.NORTH);
		numFragePanel.add(numFrage, BorderLayout.WEST);
		panelCenter.add(container, BorderLayout.WEST);
		container.add(buttonsCon, BorderLayout.SOUTH);
		container.add(test, BorderLayout.CENTER);
		buttonsCon.add(scrollButtonsCon, BorderLayout.NORTH);
		buttonsCon.add(actionButtonsCon, BorderLayout.SOUTH);
		scrollButtonsCon.add(maxLeft);
		scrollButtonsCon.add(left);
		scrollButtonsCon.add(maxRight);
		scrollButtonsCon.add(right);
	}
}
