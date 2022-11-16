package br.com.alexsandro.gamepebolim.players;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.Game;

public class Ball extends Entity {

	public int width, height;
	public static boolean up = true, down = false, left = false, right = false, movedUp = true, movedDown;
	public static double maxX = 83, maxY = 85, minX = 13, minY = 27.5;

	public static BufferedImage ball;

	public Ball(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);

		ball = Game.sprite.getSprite(0, 64, 16, 16);
	}

	public void tick() {

		// System.out.println(y);
		// Posi��o Inicial
		// x = 48
		// y = 56

		//L�gica ainda precisa de ajustes
		
		if (up == true) {
			y--;
			if (y == 26) {
				up = false;
				while(y >= 25) {
					y+=20;
				}
			}
		}
		

		/*
		 * if (down == true && Field.isFree((int) (this.getX()), (int) (this.getY()))) {
		 * y++; }
		 */

	}

	public void render(Graphics g) {
		g.drawImage(Ball.ball, this.getX(), this.getY(), null);
	}

}
