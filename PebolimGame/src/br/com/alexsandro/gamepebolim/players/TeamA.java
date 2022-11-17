package br.com.alexsandro.gamepebolim.players;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.Game;

public class TeamA extends Entity {

	public int width, height;
	public static boolean up = false, down = false, left = false, right = false, movedUp = true, movedDown = true;
	public static double newX;
	public static double newY;
	public static double speed = 1;
	public static byte gol = 0;

	public static BufferedImage rightPlayerA;
	public static BufferedImage leftPlayerA;
	public static BufferedImage centerPlayerA;

	public TeamA(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);

		centerPlayerA = Game.sprite.getSprite(32, 16, 16, 16);
		rightPlayerA = Game.sprite.getSprite(0, 16, 16, 16);
		leftPlayerA = Game.sprite.getSprite(16, 16, 16, 16);

	}

	public void tick() {		
		
		if (up == true && movedUp == true) {
			movedDown = true;
			y-=speed;
			if (y <= 29) {
				movedUp = false;
			}
		}

		if (down == true && movedDown == true) {
			movedUp = true;
			y+=speed;
			if (y > 83) {
				movedDown = false;
			}
		}
		newX = x;
		newY = y;

	}

	public void render(Graphics g) {
		if (TeamA.right == true) {
			g.drawImage(TeamA.rightPlayerA, this.getX(), this.getY(), null);
		} else if (TeamA.left == true) {
			g.drawImage(TeamA.leftPlayerA, this.getX(), this.getY(), null);
		} else if (TeamA.right == false && TeamA.left == false) {
			g.drawImage(TeamA.centerPlayerA, this.getX(), this.getY(), null);
		}
	}

}
