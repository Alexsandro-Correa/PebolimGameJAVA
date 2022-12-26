package br.com.alexsandro.gamepebolim.players;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.Game;

public class GoalkeeperB extends Entity {

	public int width, height;
	public static boolean up = false, down = false, left = false, right = false, movedUp = true, movedDown = true;
	public static boolean cpu = true;
	public static double speed = 0.8;

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
			y-=speed;
			if (y <= 47) {
				movedUp = false;
			}
		}

		if (down == true && movedDown == true) {
			movedUp = true;
			y+=speed;
			if (y > 67) {
				movedDown = false;
			}
		}
	}
	
	public void iA() {
		if (cpu) {
			for (int i = 0; i < Game.teamB.length; i++) {
				if (Game.keeperB.y > Game.ball.y - 7 && Game.keeperB.y < Game.ball.y + 7) {
					if (!Game.ball.isCollidingGb((int) Game.keeperB.x, (int) Game.keeperB.y)) {
						System.out.println("Aqui1");
						up = true;
						down = false;
					}
				}

				if (Game.teamB[i].y > Game.keeperB.y + 13 && Game.keeperB.y < Game.ball.y - 7) {
					if (!Game.ball.isCollidingGb((int) Game.teamB[0].x, (int) Game.teamB[0].y)) {
						up = false;
						down = true;
						System.out.println("Aqui2");
					}
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
		} // l�gica de chute aqui

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
