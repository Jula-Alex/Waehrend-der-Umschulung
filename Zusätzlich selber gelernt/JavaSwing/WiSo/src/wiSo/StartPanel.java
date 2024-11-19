package wiSo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class StartPanel extends JPanel implements ActionListener {

	// Labels
	JLabel themenGebiet = new JLabel("Themengebiet:");
	JLabel coordinates = new JLabel();
	JLabel anzahlFragen = new JLabel("Anzahl Fragen (max. 100):");
	JLabel zufällig = new JLabel("zufällig");

	// Border
	Border black = BorderFactory.createLineBorder(Color.black, 1);
	Border up = BorderFactory.createMatteBorder(2, 0, 0, 0, Color.blue);

	// Mouse Coordinates
	int x, y;

	// Dropdown
	String[] themen = { "Winter 2021/22", "Sommer 2022", "Winter 2022/23", "Sommer 2023", "Winter 2023/24",
			"Sommer 2024" };
	JComboBox dropDown = new JComboBox(themen);

	// Fonts
	Font normal = new Font("Arial", Font.PLAIN, 12);

	// TextField
	JTextField alle = new JTextField("alle");

	// CheckBox
	JCheckBox check = new JCheckBox();

	// Buttons
	JButton beenden = new JButton("Beenden");
	JButton test = new JButton("Test Starten");

	StartPanel() {
		setBackground(new Color(179, 198, 255));
		setLayout(null);

		// Coordinates
		coordinates.setBounds(200, 390, 300, 25);

		// Themengebiet
		themenGebiet.setBounds(40, 45, 100, 30);
		themenGebiet.setFont(new Font("Arial", Font.PLAIN, 12));
		themenGebiet.setForeground(Color.BLACK);

		// Dropdown
		dropDown.setBounds(40, 80, 150, 25);
		dropDown.setFocusable(false);
		dropDown.setBackground(new Color(253, 253, 253));
		dropDown.setFont(normal);
		dropDown.setForeground(Color.BLACK);
		dropDown.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				dropDown.setBorder(up);
			}
			public void mouseExited(MouseEvent e) {
				dropDown.setBorder(null);
			}
		});

		dropDown.addActionListener(this);
		dropDown.setSelectedIndex(0);
		
		// Anzahl Fragen (max. 100):
		anzahlFragen.setBounds(40, 125, 150, 25);
		anzahlFragen.setFont(normal);
		anzahlFragen.setForeground(Color.BLACK);

		// Alle - TextField
		alle.setBounds(40, 150, 50, 25);
		alle.setBorder(BorderFactory.createEmptyBorder());

		// CheckBox + zufällig
		check.setBounds(38, 195, 65, 20);
		check.setBackground(new Color(179, 198, 255));
		check.setText("zufällig");
		check.setFont(normal);
//		zufällig.setBounds(70, 198, 50, 25);
//		zufällig.setFont(normal);

		// Beenden Button
		beenden.setBounds(40, 230, 100, 30);
		beenden.setFont(normal);
		beenden.addActionListener(this);

		// Test Starten Button
		test.setBounds(150, 230, 100, 30);
		test.setFont(normal);
		test.addActionListener(this);

		// Add Components
		addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				x = e.getX();
				y = e.getY();
//				System.out.println("funziona");
				coordinates.setText("Coordinates: X= " + x + " Y= " + y);
			}
		});
		add(coordinates);
		add(themenGebiet);
		add(dropDown);
		add(anzahlFragen);
		add(alle);
		add(zufällig);
		add(check);
		add(beenden);
		add(test);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Beenden
		if (e.getSource() == beenden) {
			System.exit(0);
		}
		// Test Starten
		if(e.getSource() == test && dropDown.getSelectedIndex() == 1) {
			Frame2 firstWindow = new Frame2();
		}
		
		if(e.getSource() == dropDown) {
			System.out.println(dropDown.getSelectedIndex());
		}
		
	}

}
