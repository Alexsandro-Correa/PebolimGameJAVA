package br.com.alexsandro.gamepebolim;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;

import br.com.alexsandro.gamepebolim.field.Field;
import br.com.alexsandro.gamepebolim.players.Entity;
import br.com.alexsandro.gamepebolim.players.GoalkeeperA;
import br.com.alexsandro.gamepebolim.players.GoalkeeperB;
import br.com.alexsandro.gamepebolim.players.Ball;
import br.com.alexsandro.gamepebolim.players.TeamA;
import br.com.alexsandro.gamepebolim.players.TeamB;
import br.com.alexsandro.gamepebolim.sprites.Sprites;

public class Game extends Canvas implements Runnable, KeyListener {

	private static final long serialVersionUID = 1L;
	public static int WIDTH = 112;
	public static int HEIGHT = 112;
	public static int SCALE = 8;

	public BufferedImage layer = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	private boolean isRunning = true;
	public TeamA teamA;
	public TeamB teamB;
	public GoalkeeperA keeperA;
	public GoalkeeperB keeperB;
	public Ball ball;

	private BufferedImage image;

	public List<Entity> entities;
	public static Sprites sprite;
	public static Field field;
	public static Random rand = new Random();
	public static Random rand2 = new Random();

	public Game() {
		rand.nextBoolean();
		rand2.nextBoolean();
		
		this.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		this.addKeyListener(this);

		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		entities = new ArrayList<Entity>();
		sprite = new Sprites("/SpritesPebolim.png");
		field = new Field("/map.png");

		entities.add(ball = new Ball(48, 56, 16, 16, sprite.getSprite(0, 64, 16, 16)));

		// Goleiros A e B
		entities.add(keeperB = new GoalkeeperB(85, 56, 16, 16, sprite.getSprite(32, 32, 16, 16)));
		entities.add(keeperA = new GoalkeeperA(11, 56, 16, 16, sprite.getSprite(32, 48, 16, 16)));

		// Defensores A
		entities.add(teamA = new TeamA(30, 75, 16, 16, sprite.getSprite(32, 16, 16, 16)));
		entities.add(teamA = new TeamA(30, 57, 16, 16, sprite.getSprite(32, 16, 16, 16)));
		entities.add(teamA = new TeamA(30, 39, 16, 16, sprite.getSprite(32, 16, 16, 16)));

		// Meias A
		entities.add(teamA = new TeamA(54, 75, 16, 16, sprite.getSprite(32, 16, 16, 16)));
		entities.add(teamA = new TeamA(54, 57, 16, 16, sprite.getSprite(32, 16, 16, 16)));
		entities.add(teamA = new TeamA(54, 39, 16, 16, sprite.getSprite(32, 16, 16, 16)));

		// Atacantes A
		entities.add(teamA = new TeamA(78, 66, 16, 16, sprite.getSprite(32, 16, 16, 16)));
		entities.add(teamA = new TeamA(78, 48, 16, 16, sprite.getSprite(32, 16, 16, 16)));
		// Defensores B
		entities.add(teamB = new TeamB(66, 75, 16, 16, sprite.getSprite(32, 0, 16, 16)));
		entities.add(teamB = new TeamB(66, 57, 16, 16, sprite.getSprite(32, 0, 16, 16)));
		entities.add(teamB = new TeamB(66, 39, 16, 16, sprite.getSprite(32, 0, 16, 16)));

		// Meias B
		entities.add(teamB = new TeamB(42, 75, 16, 16, sprite.getSprite(32, 0, 16, 16)));
		entities.add(teamB = new TeamB(42, 57, 16, 16, sprite.getSprite(32, 0, 16, 16)));
		entities.add(teamB = new TeamB(42, 39, 16, 16, sprite.getSprite(32, 0, 16, 16)));

		// Atacantes B
		entities.add(teamB = new TeamB(18, 66, 16, 16, sprite.getSprite(32, 0, 16, 16)));
		entities.add(teamB = new TeamB(18, 48, 16, 16, sprite.getSprite(32, 0, 16, 16)));

	}

	public static void main(String[] args) {
		Game game = new Game();
		JFrame frame = new JFrame("Pebolim");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(game);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		new Thread(game).start();

	}

	// Atualizar o jogo
	public void tick() {

		for (int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);

			e.tick();
		}
	}

	// Renderizar o jogo
	public void render() {

		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = image.getGraphics();
		g.setColor(new Color(0, 255, 0));
		g.fillRect(0, 0, WIDTH, HEIGHT);

		field.render(g);
		for (int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			e.render(g);
		}

		g.setFont(new Font("Arial", Font.BOLD, 10));
		Color font = new Color(255, 255, 255);
		g.setColor(font);
		g.drawString("Team A " + TeamB.gol, 10, 12);
		g.drawString(TeamA.gol + " Team B " , 60, 12);
		g.drawString(" : ", 53, 12);

		g.dispose();
		g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, WIDTH * SCALE, HEIGHT * SCALE, null);
		bs.show();

	}

	@Override
	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		int frames = 0;
		double timer = System.currentTimeMillis();
		requestFocus();
		while (isRunning) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if (delta >= 1) {
				tick();
				render();
				frames++;
				delta--;
			}

			if (System.currentTimeMillis() - timer >= 1000) {
				System.out.println("FPS: " + frames);
				frames = 0;
				timer += 1000;
			}
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			TeamA.up = true;

		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			TeamA.down = true;

		} else if (e.getKeyCode() == KeyEvent.VK_A) {
			TeamA.right = true;
			GoalkeeperA.right = true;
		} else if (e.getKeyCode() == KeyEvent.VK_D) {
			TeamA.left = true;
			GoalkeeperA.left = true;

		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			TeamB.up = true;

		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			TeamB.down = true;

		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			TeamB.right = true;
			GoalkeeperB.right = true;

		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			TeamB.left = true;
			GoalkeeperB.left = true;

		} else if (e.getKeyCode() == KeyEvent.VK_Q) {
			GoalkeeperA.up = true;

		} else if (e.getKeyCode() == KeyEvent.VK_Z) {
			GoalkeeperA.down = true;

		} else if (e.getKeyCode() == KeyEvent.VK_O) {
			GoalkeeperB.up = true;

		} else if (e.getKeyCode() == KeyEvent.VK_L) {
			GoalkeeperB.down = true;

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			TeamA.up = false;

		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			TeamA.down = false;

		} else if (e.getKeyCode() == KeyEvent.VK_A) {
			TeamA.right = false;
			GoalkeeperA.right = false;

		} else if (e.getKeyCode() == KeyEvent.VK_D) {
			TeamA.left = false;
			GoalkeeperA.left = false;

		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			TeamB.up = false;

		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			TeamB.down = false;

		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			TeamB.right = false;
			GoalkeeperB.right = false;

		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			TeamB.left = false;
			GoalkeeperB.left = false;

		} else if (e.getKeyCode() == KeyEvent.VK_Q) {
			GoalkeeperA.up = false;

		} else if (e.getKeyCode() == KeyEvent.VK_Z) {
			GoalkeeperA.down = false;

		}else if (e.getKeyCode() == KeyEvent.VK_O) {
			GoalkeeperB.up = false;

		} else if (e.getKeyCode() == KeyEvent.VK_L) {
			GoalkeeperB.down = false;

		}
	}

}
