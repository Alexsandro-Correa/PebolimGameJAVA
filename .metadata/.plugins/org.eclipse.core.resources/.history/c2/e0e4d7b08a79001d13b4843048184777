package br.com.alexsandro.gamepebolim.players;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.Game;

public class TeamA extends Entity {

	public int width, height;
	public static boolean up = false, down = false, left = false, right = false, movedUp = true, movedDown = true;
	public static double newX;
	public static double newY;
	public static double speed = 0.1;
	public static byte gol = 0, maxGol = 1, finalGol;

	public static BufferedImage rightPlayerA;
	public static BufferedImage leftPlayerA;
	public static BufferedImage centerPlayerA;
	public static BufferedImage logo;

	public TeamA(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);

		centerPlayerA = Game.sprite.getSprite(32, 16, 16, 16);
		rightPlayerA = Game.sprite.getSprite(0, 16, 16, 16);
		leftPlayerA = Game.sprite.getSprite(16, 16, 16, 16);
		logo = Game.sprite.getSprite(0, 96, 16, 16);
		

	}

	public void tick() {		
		newX = x;
		newY = y;
		//System.out.println(x);
		//System.out.println(y);
		if (up == true && movedUp == true) {
			movedDown = true;
			for(int i = 0 ; i < Game.teamA.length; i++) {
				Game.teamA[i].y-=speed;
			}
			//y-=speed;
			if (y <= 27) {
				movedUp = false;
			}
		}

		if (down == true && movedDown == true) {
			movedUp = true;
			for(int i = 0 ; i < Game.teamA.length; i++) {
				Game.teamA[i].y+=speed;
			}
			//y+=speed;
			if (y > 86) {
				movedDown = false;
			}
		}

	}

	public void render(Graphics g) {
		if (TeamA.right == true) {
			g.drawImage(TeamA.rightPlayerA, getX()*Game.SCALE, getY()*Game.SCALE,16*Game.SCALE,16*Game.SCALE, null);
		} else if (TeamA.left == true) {
			g.drawImage(TeamA.leftPlayerA, getX()*Game.SCALE, getY()*Game.SCALE,16*Game.SCALE,16*Game.SCALE, null);
		} else if (TeamA.right == false && TeamA.left == false) {
			g.drawImage(TeamA.centerPlayerA, getX()*Game.SCALE, getY()*Game.SCALE,16*Game.SCALE,16*Game.SCALE, null);
		}
	}

}
