package radioButton;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {

	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	
	ImageIcon pizza = new ImageIcon("pizza.jpg");
	ImageIcon burger = new ImageIcon("burger.jpg");
	ImageIcon hotdog = new ImageIcon("hotdog.jpg");
	
	JLabel pizzaLabel = new JLabel("Your Pizza it's on the way !");
	JLabel hamLabel = new JLabel("Your Hamburger it's on the way !");
	JLabel dogLabel = new JLabel("Your HotDog it's on the way !");
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaButton = new JRadioButton("pizza");
		hamburgerButton = new JRadioButton("hamburger");
		hotdogButton = new JRadioButton("hotdog");
		
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		pizzaButton.setIcon(pizza);
		hamburgerButton.setIcon(burger);
		hotdogButton.setIcon(hotdog);
		
		pizzaLabel.setVisible(false);
		hamLabel.setVisible(false);
		dogLabel.setVisible(false);
		
		pizzaLabel.setFont(new Font("Comic Sans Ms", Font.BOLD, 30));
		hamLabel.setFont(new Font("Comic Sans Ms", Font.BOLD, 30));
		dogLabel.setFont(new Font("Comic Sans Ms", Font.BOLD, 30));
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		this.add(pizzaLabel);
		this.add(hamLabel);
		this.add(dogLabel);
//		this.pack();
		this.setSize(800, 600);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == pizzaButton) {
			System.out.println("Here is your pizza Junge !");
			pizzaLabel.setVisible(true);
			hamLabel.setVisible(false);
			dogLabel.setVisible(false);
		}
		
		if(e.getSource() == hamburgerButton) {
			System.out.println("Here is your hamburger Junge !");
			pizzaLabel.setVisible(false);
			hamLabel.setVisible(true);
			dogLabel.setVisible(false);
		}
		
		if(e.getSource() == hotdogButton) {
			System.out.println("Here is your hotdog Junge !");
			pizzaLabel.setVisible(false);
			hamLabel.setVisible(false);
			dogLabel.setVisible(true);
		}
		
	}

}
