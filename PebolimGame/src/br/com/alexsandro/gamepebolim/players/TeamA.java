package br.com.alexsandro.gamepebolim.players;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.Game;

public class TeamA extends Entity {

	public int width, height;
	public static boolean up = false, down = false, left = false, right = false;

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
		if (up == true) {
			y--;
		} else if (down == true) {
			y++;
		}
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
