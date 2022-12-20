package br.com.alexsandro.gamepebolim.players;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.Game;

public class GoalkeeperB extends Entity {

	public int width, height;
	public static boolean up = false, down = false, left = false, right = false, movedUp = true, movedDown = true;
	public static boolean cpu = true;

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

		if (cpu) {
			if (getX() < Game.ball.getX() +50) {
				if (calculateDistance(getX(), getY(), Game.ball.getX(), Game.ball.getY()) < 10) {
					up = true;
					down = false;

					if (Game.ball.isCollidingGb(getX(), getY())) {
						up = false;
						left = true;

					} else {
						left = false;
					}

				} else if (calculateDistance(getX(), getY(), Game.ball.getX(), Game.ball.getY()) > 10) {
					down = true;
					up = false;

					if (Game.ball.isCollidingGb(getX(), getY())) {
						down = false;
						left = true;
					} else {
						left = false;
					}
				}
			}else {
				if(y >= 56) {
					movedUp = true;
				}
			}

			if (up == true && movedUp == true) {
				movedDown = true;
				y--;
				if (y <= 47) {
					movedUp = false;
				}
			}

			if (down == true && movedDown == true) {
				movedUp = true;
				y++;
				if (y > 67) {
					movedDown = false;
				}
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
