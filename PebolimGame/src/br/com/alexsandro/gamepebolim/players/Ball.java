package br.com.alexsandro.gamepebolim.players;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.Game;

public class Ball extends Entity {

	public int width, height;
	public static boolean up = false, down = false, left = false, right = false;

	public static BufferedImage ball;


	public Ball(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);

		ball = Game.sprite.getSprite(0, 64, 16, 16);
	}

	public void tick() {
		if (up == true) {
			y--;
		} else if (down == true) {
			y++;
		}
	}
	
	public void render(Graphics g) {
		g.drawImage(Ball.ball, this.getX(), this.getY(), null);
	}

}
