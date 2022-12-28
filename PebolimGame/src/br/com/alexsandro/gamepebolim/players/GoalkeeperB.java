package br.com.alexsandro.gamepebolim.players;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.Game;

public class GoalkeeperB extends Entity {

	public int width, height;
	public static boolean up = false, down = false, left = false, right = false, movedUp = true, movedDown = true;
	public static boolean cpu = false;
	public static double speed = 0.6;

	public static BufferedImage rightKeeperB;
	public static BufferedImage leftKeeperB;
	public static BufferedImage centerKeeperB;

	public GoalkeeperB(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);

		centerKeeperB = Game.sprite.getSprite(32, 32, 16, 16);
		rightKeeperB = Game.sprite.getSprite(0, 32, 16, 16);
		leftKeeperB = Game.sprite.getSprite(16, 32, 16, 16);

	}

	public void tick() {

		iA();

		if (up == true && movedUp == true) {
			movedDown = true;
			y -= speed;
			if (y <= 47) {
				movedUp = false;
			}
		}

		if (down == true && movedDown == true) {
			movedUp = true;
			y += speed;
			if (y > 67) {
				movedDown = false;
			}
		}
	}

	public void iA() {
		if (cpu) {
			if (Game.keeperB.y >= Game.ball.y - 7 && Game.keeperB.y <= Game.ball.y - 5) {
				down = false;
				up = false;
			} else {
				if (Game.keeperB.y > Game.ball.y - 6) {
					if (!Game.ball.isCollidingGb((int) Game.keeperB.x, (int) Game.keeperB.y)) {
						up = true;
						down = false;
					}
				}
				if (Game.keeperB.y < Game.ball.y - 6) {
					if (!Game.ball.isCollidingGb((int) Game.keeperB.x, (int) Game.keeperB.y)) {
						up = false;
						down = true;
					}
				}

			}
			if (Game.ball.isCollidingGb((int) Game.keeperB.x, (int) Game.keeperB.y)) {
				up = false;
				down = false;
				left = true;
				right = false;

			} else {
				left = false;
				right = false;
			}
		}

	}

	public void render(Graphics g) {

		if (GoalkeeperB.right == true) {
			g.drawImage(GoalkeeperB.rightKeeperB, getX() * Game.SCALE, getY() * Game.SCALE, 16 * Game.SCALE,
					16 * Game.SCALE, null);
		} else if (GoalkeeperB.left == true) {
			g.drawImage(GoalkeeperB.leftKeeperB, getX() * Game.SCALE, getY() * Game.SCALE, 16 * Game.SCALE,
					16 * Game.SCALE, null);
		} else if (GoalkeeperB.right == false && GoalkeeperB.left == false) {
			g.drawImage(GoalkeeperB.centerKeeperB, getX() * Game.SCALE, getY() * Game.SCALE, 16 * Game.SCALE,
					16 * Game.SCALE, null);
		}

	}

}
