package br.com.alexsandro.gamepebolim.players;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.Game;

public class GoalkeeperA extends Entity {

	public int width, height;
	public static boolean up = false, down = false, left = false, right = false;

	public static BufferedImage rightKeeperA;
	public static BufferedImage leftKeeperA;
	public static BufferedImage centerKeeperA;

	public GoalkeeperA(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);

		centerKeeperA = Game.sprite.getSprite(32, 48, 16, 16);
		rightKeeperA = Game.sprite.getSprite(0, 48, 16, 16);
		leftKeeperA = Game.sprite.getSprite(16, 48, 16, 16);

	}

	public void tick() {
		if (up == true) {
			y--;
		} else if (down == true) {
			y++;
		}
	}
	
	public void render(Graphics g) {
		
		if(GoalkeeperA.right == true) {
			g.drawImage(GoalkeeperA.rightKeeperA, this.getX(), this.getY(), null);
		} else if (GoalkeeperA.left == true) {
			g.drawImage(GoalkeeperA.leftKeeperA, this.getX(), this.getY(), null);
		} else if (GoalkeeperA.right == false && GoalkeeperA.left == false) {
			g.drawImage(GoalkeeperA.centerKeeperA, this.getX(), this.getY(), null);
		}
	}

}
