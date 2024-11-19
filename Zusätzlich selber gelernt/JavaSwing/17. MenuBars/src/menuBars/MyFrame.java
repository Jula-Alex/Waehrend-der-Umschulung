package menuBars;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener {
	
	JMenuBar menuBar = new JMenuBar();
	
	JMenu fileMenu = new JMenu("File");
	JMenu editMenu = new JMenu("Edit");
	JMenu helpMenu = new JMenu("Help");
	
	JMenuItem loadItem = new JMenuItem("Load");
	JMenuItem saveItem = new JMenuItem("Save");
	JMenuItem exitItem = new JMenuItem("Exit");
	
	ImageIcon loadIcon = new ImageIcon("load.png");
	ImageIcon saveIcon = new ImageIcon("save.png");
	ImageIcon exitIcon = new ImageIcon("exit.png");
	
	MyFrame() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		loadItem.setMnemonic(KeyEvent.VK_L); // When you look in the window, the letter L will be Underlined
		saveItem.setMnemonic(KeyEvent.VK_S); // This is s for save
		exitItem.setMnemonic(KeyEvent.VK_E); // This is l for exit
		
		fileMenu.setMnemonic(KeyEvent.VK_F); // This work with Alt + Key(F)
		editMenu.setMnemonic(KeyEvent.VK_E); // You can see that the first letter it's Underlined too
		helpMenu.setMnemonic(KeyEvent.VK_H); 
		
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loadItem) {
			System.out.println("**beep boop** File it's loaded");
		}
		if(e.getSource() == saveItem) {
			System.out.println("**beep boop** File it's saved");
		}
		if(e.getSource() == exitItem) {
			System.exit(0);
		}
		
	}

}
