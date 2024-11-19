package slider;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener {

	JFrame frame;

	JPanel panel;

	JLabel label;
	JLabel label2;

	JSlider slider;

	Border borderBlack = BorderFactory.createLineBorder(Color.black, 5);
	Border borderGreen = BorderFactory.createLineBorder(Color.green, 5);
	Border borderRed = BorderFactory.createLineBorder(Color.red, 5);

	SliderDemo() {
		frame = new JFrame("Slider Demo");
		frame.setSize(420, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		panel = new JPanel();
//		panel.setBorder(borderBlack);

		// The first it's the minimum, the second it's the maximum and the last it's the
		// start value (default 50%)
		slider = new JSlider(0, 100, 50);
		slider.setPreferredSize(new Dimension(400, 200));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli", Font.BOLD, 15));
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.addChangeListener(this);
//		slider.setBorder(borderGreen);

		label = new JLabel();
		label.setFont(new Font("MV Boli", Font.BOLD, 25));
		label.setText("°C = " + slider.getValue());
//		label.setBorder(borderRed);

		label2 = new JLabel();
		label2.setFont(new Font("MV Boli", Font.BOLD, 25));
//		label2.setBorder(borderBlack);

		panel.add(slider);
		panel.add(label);
		panel.add(label2);
		frame.add(panel);
		frame.setVisible(true);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("°C = " + slider.getValue());

		label2.setText(slider.getValue() <= 100 ? "Sauna" : label2.getText());

		label2.setText(slider.getValue() <= 58 ? "Sahara" : label2.getText());

		label2.setText(slider.getValue() <= 40 ? "Very hot summer" : label2.getText());

		label2.setText(slider.getValue() <= 30 ? "Hot Summer" : label2.getText());

		label2.setText(slider.getValue() <= 24 ? "Perfect" : label2.getText());

		label2.setText(slider.getValue() <= 15 ? "Cold" : label2.getText());

		label2.setText(slider.getValue() <= 10 ? "Too Cold" : label2.getText());

		label2.setText(slider.getValue() <= 0 ? "I'm freezing !" : label2.getText());
	}

}
