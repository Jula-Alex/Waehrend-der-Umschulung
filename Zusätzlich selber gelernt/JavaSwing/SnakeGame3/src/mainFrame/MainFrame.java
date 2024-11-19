package mainFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Frame;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.ComponentOrientation;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		// Panel 
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(800, 800));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Green");
		btnNewButton.setBounds(101, 108, 299, 232);
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setFont(new Font("Stencil", Font.BOLD, 10));
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(539, 214, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Button button = new Button("New button");
		button.setBounds(173, 414, 66, 21);
		contentPane.add(button);
		
		// Frame
		setTitle("SnakeGame");
		setName("MyFrame");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\IJula\\Desktop\\Java\\JavaSwing\\01.FrameAndLabel\\1.jpg"));
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 872, 601);
		setLocationRelativeTo(null);
		pack();
		

	}
}
