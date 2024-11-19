package textField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton button;
	JTextField textField;
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
	    button = new JButton("Submit");
		button.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Consolas", Font.BOLD, 35));
		textField.setForeground(new Color(0x00ff00));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.RED);
		textField.setText("username");
		
		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			System.out.println("Welcome " + textField.getText()); 
			textField.setEditable(false);
			button.setEnabled(false);
		}
		
	}

}
