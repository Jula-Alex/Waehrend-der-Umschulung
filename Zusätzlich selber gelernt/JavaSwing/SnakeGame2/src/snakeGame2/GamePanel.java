package snakeGame2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.*;
import javax.swing.SpringLayout.Constraints;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	int screen_width = 600;
	int screen_height = 600;
	int unit_size = 25;
	int game_units = (screen_width * screen_height) / unit_size;
	int delay = 100;
	int[] x = new int[game_units];
	int[] y = new int[game_units];
	int appleX;
	int appleY;
	int appleEated;
	int bodyParts = 6;
	char direction = 'D';
	boolean running = true;
	Timer timer;
	Random random;
	
	Timer timer2;
	String[] messages = {"Ja", "va", "Swing", "Tzenergame !!!"};
	Font font = new Font("Comic Sans MS", Font.BOLD, 70);
	int currentStep = 0;

	GamePanel() {
		random = new Random();
		setPreferredSize(new Dimension(600, 600));
		setBackground(Color.black);
		setFocusable(true);
		addKeyListener(this);
//		gameStart();
		startMessageTimer();
	}

	public void startMessageTimer() {
		ActionListener messageListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currentStep++;
				repaint();
				if(currentStep >= messages.length) {
					timer2.stop();
					gameStart();
				}
			}
		};
		timer2 = new Timer(1000, messageListener);
		timer2.start();
		System.out.println("Timer2 Partito");
	}

	public void gameStart() {
		newApple();
		running = true;
		timer = new Timer(delay, this);
		timer.start();
	}

	public void newApple() {
		appleX = random.nextInt(screen_width / unit_size) * unit_size;
		appleY = random.nextInt(screen_height / unit_size) * unit_size;
		System.out.println(appleX + " " + appleY);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
//		draw(g);
		if(currentStep < messages.length) {
			g.setFont(font);
			g.setColor(Color.white);
			
			String message = messages[currentStep];
			FontMetrics metrics = g.getFontMetrics(font);
			int x = (getWidth() - metrics.stringWidth(message)) / 2;
			int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
			g.drawString(message, x, y);
		} else {
			draw(g);
		}
	}

	public void draw(Graphics g) {
		if (running) {
			// drawing grid
			for (int i = 0; i < screen_width; i += unit_size) {
				g.drawLine(0, i, screen_width, i);
				g.drawLine(i, 0, i, screen_height);
			}
			// drawing apple
			g.setColor(Color.red);
			g.fillOval(appleX, appleY, unit_size, unit_size);
			// drawing head
			g.setColor(Color.green);
			g.fillRect(x[0], y[0], unit_size, unit_size);
			// drawing body
			g.setColor(Color.red);
			for (int i = 1; i < bodyParts; i++) {
				g.fillRect(x[i], y[i], unit_size, unit_size);
			}
			// drawing the score
			g.setColor(Color.white);
			Font font = new Font("Comic Sans MS", Font.BOLD, 25);
			FontMetrics metrics = g.getFontMetrics(font);
			String score = "Score: " + appleEated;
			int x = (screen_width - metrics.stringWidth(score)) / 2;
			int y = ((screen_height - metrics.getHeight())) + metrics.getAscent();
			g.setFont(font);
			g.drawString(score, x, y);
		} else {
			// drawing GameOver
			g.setColor(Color.white);
			Font font = new Font("Comic Sans MS", Font.BOLD, 50);
			FontMetrics metrics = g.getFontMetrics(font);
			String text = "GameOver";
			int x = (screen_width - metrics.stringWidth(text)) / 2;
			int y = ((screen_height - metrics.getHeight()) / 2) + metrics.getAscent();
			g.setFont(font);
			g.drawString(text, x, y);
			// drawing Score
			g.setColor(Color.green);
			Font fontScore = new Font("Comic Sans MS", Font.BOLD, 25);
			FontMetrics metricsScore = g.getFontMetrics(fontScore);
			String score = "Score: " + appleEated;
			int xScore = (screen_width - metricsScore.stringWidth(score)) / 2;
			int yScore = ((screen_height - metricsScore.getHeight()) / 2) + metrics.getAscent() + 100;
			g.setFont(fontScore);
			g.drawString(score, xScore, yScore);
		}

		repaint();
	}

	public void move() {
		for (int i = bodyParts; i > 0; i--) {
			x[i] = x[i - 1];
			y[i] = y[i - 1];
		}
		switch (direction) {
		case 'W':
			y[0] = y[0] - unit_size;
			break;
		case 'S':
			y[0] = y[0] + unit_size;
			break;
		case 'A':
			x[0] = x[0] - unit_size;
			break;
		case 'D':
			x[0] = x[0] + unit_size;
			break;
		}
	}

	public void checkCollision() {
		if (x[0] < 0 || y[0] < 0 || x[0] > screen_width || y[0] > screen_height) {
			running = false;
		}
		if (x[0] == appleX && y[0] == appleY) {
			bodyParts++;
			appleEated++;
			newApple();
		}
		for (int i = 1; i < bodyParts; i++) {
			if (x[i] == x[0] && y[i] == y[0]) {
				running = false;
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (running) {
			move();
			checkCollision();
		} else {
			timer.stop();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case 'W':
			if (direction != 'S')
				direction = 'W';
			break;
		case 'S':
			if (direction != 'W')
				direction = 'S';
			break;
		case 'A':
			if (direction != 'D')
				direction = 'A';
			break;
		case 'D':
			if (direction != 'A')
				direction = 'D';
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
