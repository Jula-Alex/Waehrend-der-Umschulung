package snakeGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

	static final int screen_width = 600;
	static final int screen_height = 600;
	static final int unit_size = 25;
	static final int game_units = (screen_width / unit_size) * unit_size; // 600
	static final int delay = 100;
	int[] x = new int[game_units];
	int[] y = new int[game_units];
	int appleX;
	int appleY;
	int appleEated;
	int bodyParts = 6;
	char direction = 'D';
	boolean running = false;
	Timer timer;
	Timer timer2;
	Random random;

	GamePanel() {
		random = new Random();
		this.setPreferredSize(new Dimension((int) getWidth(), (int) (getHeight())));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		gameStart();
	}

	public void gameStart() {
		newApple();
		running = true;
		timer = new Timer(delay, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}

	public void draw(Graphics g) {
		if (running) {
			for (int i = 0; i < getHeight(); i++) {
				// Draw the vertical and horizontal Lines
				g.drawLine(i * unit_size, 0, i * unit_size, getHeight()); // Vertical
				g.drawLine(0, i * unit_size, getWidth(), i * unit_size); // Horizontal
			}
			// Drawing Random apple
			g.setColor(Color.red);
			g.fillOval(appleX, appleY, unit_size, unit_size);
			// Drawing the body
			for (int i = 0; i < bodyParts; i++) {
				g.setColor(Color.red);
				g.fillRect(x[i], y[i], unit_size, unit_size);
			}
			// Drawing the head
			g.setColor(Color.green);
			g.fillRect(x[0], y[0], unit_size, unit_size);
			// Drawing the score
			g.setColor(Color.blue);
			g.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
			FontMetrics scoreMetric = getFontMetrics(g.getFont());
			g.drawString("Score: " + appleEated, (getWidth() - scoreMetric.stringWidth("Score: " + appleEated)) / 2,
					g.getFont().getSize());
		} else {
//			gameOver(g);
		}
	}

	public void newApple() {
		appleX = random.nextInt(600 / unit_size) * unit_size;
		appleY = random.nextInt(600 / unit_size) * unit_size;
		System.out.println("appleX: " + appleX + " appleY: " + appleY);
	}

	public void move() {
		// Logic for drawing the body
		for (int i = bodyParts; i > 0; i--) {
			x[i] = x[i - 1];
			y[i] = y[i - 1];
		}
		// Logic for move the snake
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

	public void checkApple() {
		if ((x[0] == appleX) && (y[0] == appleY)) {
			bodyParts++;
			appleEated++;
			newApple();
		}
	}

	public void checkCollisions() {
		// Check the walls
		if (x[0] < 0 || x[0] > getWidth() || y[0] < 0 || y[0] > getHeight()) {
			running = false;
		}
		// Check collide with body
		for (int i = bodyParts; i > 0; i--) {
			if ((x[0] == x[i]) && (y[0] == y[i])) {
				running = false;
			}
		}
	}

	public void gameOver(Graphics g) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (running) {
			move();
			checkCollisions();
			checkApple();
		} else {
			timer.stop();
		}
		repaint();
	}

	public class MyKeyAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				if (direction != 'S')
					direction = 'W';
				break;
			case KeyEvent.VK_DOWN:
				if (direction != 'W')
					direction = 'S';
				break;
			case KeyEvent.VK_LEFT:
				if (direction != 'D')
					direction = 'A';
				break;
			case KeyEvent.VK_RIGHT:
				if (direction != 'A')
					direction = 'D';
				break;
			}
		}
	}
}
