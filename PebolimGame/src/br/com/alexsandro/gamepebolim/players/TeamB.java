package br.com.alexsandro.gamepebolim.players;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.Game;

public class TeamB extends Entity {

	public int width, height;
	public static boolean up = false, down = false, left = false, right = false, movedUp = true, movedDown = true;
	public static double speed = 0.1;
	public static byte gol = 0;

	public static BufferedImage rightPlayerB;
	public static BufferedImage leftPlayerB;
	public static BufferedImage centerPlayerB;

	public TeamB(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);

		centerPlayerB = Game.sprite.getSprite(32, 0, 16, 16);
		rightPlayerB = Game.sprite.getSprite(16, 0, 16, 16);
		leftPlayerB = Game.sprite.getSprite(0, 0, 16, 16);

	}

	public void tick() {
		if (up == true && movedUp == true) {
			movedDown = true;
			for(int i = 0 ; i < Game.teamB.length; i++) {
				Game.teamB[i].y-=speed;
			}
			//y-=speed;
			if (y <= 31) {
				movedUp = false;
			}
		}

		if (down == true && movedDown == true) {
			movedUp = true;
			for(int i = 0 ; i < Game.teamB.length; i++) {
				Game.teamB[i].y+=speed;
			}
			//y+=speed;
			if (y > 82) {
				movedDown = false;
			}
		}
	}
	
	public void render(Graphics g) {
	
		if (TeamB.right == true) {
			g.drawImage(TeamB.rightPlayerB, this.getX(), this.getY(), null);
		} else if (TeamB.left == true) {
			g.drawImage(TeamB.leftPlayerB, this.getX(), this.getY(), null);
		} else if (TeamB.right == false && TeamB.left == false) {
			g.drawImage(TeamB.centerPlayerB, this.getX(), this.getY(), null);
		}
	
	}
}
