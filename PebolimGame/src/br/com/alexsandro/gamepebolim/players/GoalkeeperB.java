package br.com.alexsandro.gamepebolim.players;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.Game;

public class GoalkeeperB extends Entity {

	public int width, height;
	public static boolean up = false, down = false, left = false, right = false, movedUp = true, movedDown = true;

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
		if (up == true && movedUp == true) {
			movedDown = true;
			y--;
			if (y <= 27) {
				movedUp = false;
			}
		}

		if (down == true && movedDown == true) {
			movedUp = true;
			y++;
			if (y > 85) {
				movedDown = false;
			}
		}
	}
	
	public void render(Graphics g) {
		
		if(GoalkeeperB.right == true) {
			g.drawImage(GoalkeeperB.rightKeeperB, this.getX(), this.getY(), null);
		} else if (GoalkeeperB.left == true) {
			g.drawImage(GoalkeeperB.leftKeeperB, this.getX(), this.getY(), null);
		} else if (GoalkeeperB.right == false && GoalkeeperB.left == false) {
			g.drawImage(GoalkeeperB.centerKeeperB, this.getX(), this.getY(), null);
		}
		
	}

}
