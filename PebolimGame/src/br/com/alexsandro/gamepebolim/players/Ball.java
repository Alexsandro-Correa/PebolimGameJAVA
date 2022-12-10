package br.com.alexsandro.gamepebolim.players;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.Game;

public class Ball extends Entity {

	public int width, height;
	public static boolean up = true, down = false, left = false, right = false, movedUp = true, movedDown;
	public static boolean ballUp = Game.rand.nextBoolean();
	public static boolean ballRight = Game.rand2.nextBoolean();
	public static boolean ballDown, ballLeft;
	public static boolean firstLooping = true;
	public static boolean running = true;
	public static boolean isGoal = false;
	public static double speed = 1;

	public static BufferedImage ball;

	public Ball(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);

		ball = Game.sprite.getSprite(0, 64, 16, 16);
	}

	public void tick() {

		if (firstLooping == true) {
			if (ballRight == true) {
				ballLeft = false;
			}
			if (ballRight == false) {
				ballLeft = true;
			}
			if (ballUp == true) {
				ballDown = false;
			}
			if (ballUp == false) {
				ballDown = true;
			}
			firstLooping = false;
		}

		if (isGoal == true) {
			x = 48;
			y = 56;
			isGoal = false;
		}

		for (int i = 0; i < Game.teamA.length; i++) {

			if (TeamA.left == true && x <= Game.teamA[i].x + 2 && x >= Game.teamA[i].x
					&& y == (int) (Game.teamA[i].y)) {
				ballRight = true;
				running = true;
			} else if (TeamA.left == true && x <= Game.teamA[i].x + 2 && x >= Game.teamA[i].x
					&& y >= (int) (Game.teamA[i].y - 2) && y <= (int) (Game.teamA[i].y)) {
				ballRight = true;
				ballUp = true;
				running = true;
			} else if (TeamA.left == true && x <= Game.teamA[i].x + 2 && x >= Game.teamA[i].x
					&& y >= (int) (Game.teamA[i].y) && y <= (int) (Game.teamA[i].y + 2)) {
				ballRight = true;
				ballDown = true;
				running = true;
			}

			if (TeamA.right == true && x >= Game.teamA[i].x - 2 && x <= Game.teamA[i].x
					&& y == (int) (Game.teamA[i].y)) {
				ballLeft = true;
				running = true;
			} else if (TeamA.right == true && x >= Game.teamA[i].x - 2 && x <= Game.teamA[i].x
					&& y >= (int) (Game.teamA[i].y - 2) && y <= (int) (Game.teamA[i].y)) {
				ballLeft = true;
				ballUp = true;
				running = true;
			} else if (TeamA.right == true && x >= Game.teamA[i].x - 2 && x <= Game.teamA[i].x
					&& y >= (int) (Game.teamA[i].y) && y <= (int) (Game.teamA[i].y + 2)) {
				ballLeft = true;
				ballDown = true;
				running = true;
			}

			if (TeamB.right == true && x <= Game.teamB[i].x + 2 && x >= Game.teamB[i].x
					&& y == (int) (Game.teamB[i].y)) {
				ballRight = true;
				running = true;
			} else if (TeamB.right == true && x <= Game.teamB[i].x + 2 && x >= Game.teamB[i].x
					&& y >= (int) (Game.teamB[i].y - 2) && y <= (int) (Game.teamB[i].y)) {
				ballRight = true;
				ballUp = true;
				running = true;
			} else if (TeamB.right == true && x <= Game.teamB[i].x + 2 && x >= Game.teamB[i].x
					&& y >= (int) (Game.teamB[i].y) && y <= (int) (Game.teamB[i].y + 2)) {
				ballRight = true;
				ballDown = true;
				running = true;
			}

			if (TeamB.left == true && x >= Game.teamB[i].x - 2 && x <= Game.teamB[i].x
					&& y == (int) (Game.teamB[i].y)) {
				ballLeft = true;
				running = true;
			} else if (TeamB.left == true && x >= Game.teamB[i].x - 2 && x <= Game.teamB[i].x
					&& y >= (int) (Game.teamB[i].y - 2) && y <= (int) (Game.teamB[i].y)) {
				ballLeft = true;
				ballUp = true;
				running = true;
			} else if (TeamB.left == true && x >= Game.teamB[i].x - 2 && x <= Game.teamB[i].x
					&& y >= (int) (Game.teamB[i].y) && y <= (int) (Game.teamB[i].y + 2)) {
				ballLeft = true;
				ballDown = true;
				running = true;
			}

			if (GoalkeeperA.left == true && x <= Game.keeperA.x + 2 && x >= Game.keeperA.x
					&& y == (int) (Game.keeperA.y)) {
				ballRight = true;
				running = true;
			} else if (GoalkeeperA.left == true && x <= Game.keeperA.x + 2 && x >= Game.keeperA.x
					&& y >= (int) (Game.keeperA.y - 2) && y <= (int) (Game.keeperA.y)) {
				ballRight = true;
				ballUp = true;
				running = true;
			} else if (GoalkeeperA.left == true && x <= Game.keeperA.x + 2 && x >= Game.keeperA.x
					&& y >= (int) (Game.keeperA.y) && y <= (int) (Game.keeperA.y + 2)) {
				ballRight = true;
				ballDown = true;
				running = true;
			}

			if (GoalkeeperB.left == true && x >= Game.keeperB.x - 2 && x <= Game.keeperB.x
					&& y == (int) (Game.keeperB.y)) {
				ballLeft = true;
				running = true;
			} else if (GoalkeeperB.left == true && x >= Game.keeperB.x - 2 && x <= Game.keeperB.x
					&& y >= (int) (Game.keeperB.y - 2) && y <= (int) (Game.keeperB.y)) {
				ballLeft = true;
				ballUp = true;
				running = true;
			} else if (GoalkeeperB.left == true && x >= Game.keeperB.x - 2 && x <= Game.keeperB.x
					&& y >= (int) (Game.keeperB.y) && y <= (int) (Game.keeperB.y + 2)) {
				ballLeft = true;
				ballDown = true;
				running = true;
			}
		}

		if (running == true) {

			if ((int) x <= 11 && (int) y > 47 && (int) y < 65) {
				x -= speed * 2;
				isGoal = true;
				TeamB.gol++;
				ballRight = true;
				ballLeft = false;
			}

			if ((int) x >= 85 && (int) y > 47 && (int) y < 65) {
				x += speed * 2;
				isGoal = true;
				TeamA.gol++;
				ballRight = false;
				ballLeft = true;
			}

			if (ballRight == true) {
				x += speed;
			}

			if (ballLeft == true) {
				x -= speed;
			}

			if (ballUp == true) {
				y -= speed;
			}

			if (ballDown == true) {
				y += speed;
			}

			if (y <= 26) {
				ballUp = false;
				ballDown = true;
			}

			if (x <= 11) {
				ballRight = true;
				ballLeft = false;
			}

			if (y >= 85) {
				ballUp = true;
				ballDown = false;
			}

			if (x >= 85) {
				ballRight = false;
				ballLeft = true;
			}

			if (y >= 85) {
				ballUp = true;
				ballDown = false;
			}

			if (x <= 11) {
				ballRight = true;
				ballLeft = false;
			}

		}

		if (y <= 26) {
			ballUp = false;
			ballDown = true;
		}

		if (x >= 85) {
			ballRight = false;
			ballLeft = true;
		}

		if (isColliding((int) x, (int) y)) {
			running = false;
			ballUp = false;
			ballDown = false;
			ballRight = false;
			ballLeft = false;
		}

	}

	public boolean isColliding(int xnext, int ynext) {

		Rectangle playerCurrent = new Rectangle(xnext, ynext, 3, 3);

		for (int i = 0; i < Game.teamA.length; i++) {
			TeamA tA = Game.teamA[i];
			Rectangle targetPlayer = new Rectangle(tA.getX(), tA.getY(), 3, 3);
			if (playerCurrent.intersects(targetPlayer)) {
				return true;
			}

		}

		for (int i = 0; i < Game.teamB.length; i++) {
			TeamB tB = Game.teamB[i];
			Rectangle targetPlayer = new Rectangle(tB.getX(), tB.getY(), 3, 3);
			if (playerCurrent.intersects(targetPlayer)) {
				return true;
			}

		}

		GoalkeeperA gA = Game.keeperA;
		Rectangle targetKeeperA = new Rectangle(gA.getX(), gA.getY(), 3, 3);
		if (playerCurrent.intersects(targetKeeperA)) {
			return true;
		}

		GoalkeeperB gB = Game.keeperB;
		Rectangle targetKeeperB = new Rectangle(gB.getX(), gB.getY(), 3, 3);
		if (playerCurrent.intersects(targetKeeperB)) {
			return true;
		}

		return false;
	}

	public void render(Graphics g) {
		g.drawImage(Ball.ball, this.getX(), this.getY(), null);
	}

}
