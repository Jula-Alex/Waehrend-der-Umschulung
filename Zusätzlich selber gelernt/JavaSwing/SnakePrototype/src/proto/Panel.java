package proto;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel extends JPanel {
	Font font = new Font("Comic Sans MS", Font.BOLD, 70);
	Timer timer;
	int currentStep = 0;
	String[] messages = {"Ja", "va", "Swing", "Tzenergame !!!"};

	Panel() {
		setPreferredSize(new Dimension(600, 600));
		setBackground(Color.black);
		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("prima Fase");
				currentStep++;
				repaint();
				if (currentStep >= messages.length)
					timer.stop();
			}
		});
		timer.start();
		System.out.println("Timer Partito");
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(font);
        g.setColor(Color.white);
        
		if (currentStep < messages.length) {
            // Ottieni la stringa corrente da mostrare
            String message = messages[currentStep];

            // Calcola la larghezza e l'altezza del testo per centrarlo
            FontMetrics metrics = g.getFontMetrics(font);
            int x = (getWidth() - metrics.stringWidth(message)) / 2;
            int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();

            // Disegna il testo centrato
            g.drawString(message, x, y);
        }
	}
}
