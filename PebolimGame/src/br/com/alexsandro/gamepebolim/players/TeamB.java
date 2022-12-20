package br.com.alexsandro.gamepebolim.players;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.Game;

public class TeamB extends Entity {

	public int width, height;
	public static boolean up = false, down = false, left = false, right = false, movedUp = true, movedDown = true;
	public static double speed = 0.1;
	public static byte gol = 0, maxGol = 5, finalGol;
	public static boolean cpu = false;

	public static BufferedImage rightPlayerB;
	public static BufferedImage leftPlayerB;
	public static BufferedImage centerPlayerB;
	public static BufferedImage logo;

	public TeamB(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);

		centerPlayerB = Game.sprite.getSprite(32, 0, 16, 16);
		rightPlayerB = Game.sprite.getSprite(0, 0, 16, 16);
		leftPlayerB = Game.sprite.getSprite(16, 0, 16, 16);
		logo = Game.sprite.getSprite(16, 96, 16, 16);

	}

	public void tick() {

		if (cpu) {
			for (int i = 0; i < Game.teamB.length; i++) {
				if (calculateDistance(Game.teamB[i].getX(), Game.teamB[i].getY(), Game.ball.getX(),
						Game.ball.getY()) < 18) {
					up = true;
					down = false;

					if (Game.ball.isCollidingTb(getX(), getY())) {
						up = false;
						if (Game.rand.nextInt(100) < 60) {
							left = true;

						} else {
							right = true;
						}
					} else {
						right = false;
						left = false;
					}

				} else if (calculateDistance(Game.teamB[i].getX(), Game.teamB[i].getY(), Game.ball.getX(),
						Game.ball.getY()) > 18) {
					down = true;
					up = false;

					if (Game.ball.isCollidingTb(getX(), getY())) {
						down = false;
						if (Game.rand.nextInt(100) < 60) {
							left = true;
							right = false;
						} else {
							right = true;
							left = false;

						}
					} else {
						right = false;
						left = false;
					}
				}
			}
		}

		if (up == true && movedUp == true)

		{
			movedDown = true;
			for (int i = 0; i < Game.teamB.length; i++) {
				Game.teamB[i].y -= speed;
			}

			if (y <= 27) {
				movedUp = false;
			}
		}

		if (down == true && movedDown == true) {
			movedUp = true;
			for (int i = 0; i < Game.teamB.length; i++) {
				Game.teamB[i].y += speed;
			}

			if (y > 86) {
				movedDown = false;
			}
		}
	}

	public void render(Graphics g) {

		if (TeamB.left == true) {
			g.drawImage(TeamB.rightPlayerB, getX() * Game.SCALE, getY() * Game.SCALE, 16 * Game.SCALE, 16 * Game.SCALE,
					null);
		} else if (TeamB.right == true) {
			g.drawImage(TeamB.leftPlayerB, getX() * Game.SCALE, getY() * Game.SCALE, 16 * Game.SCALE, 16 * Game.SCALE,
					null);
		} else if (TeamB.right == false && TeamB.left == false) {
			g.drawImage(TeamB.centerPlayerB, getX() * Game.SCALE, getY() * Game.SCALE, 16 * Game.SCALE, 16 * Game.SCALE,
					null);
		}

	}
}
