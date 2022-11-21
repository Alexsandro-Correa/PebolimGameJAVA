package br.com.alexsandro.gamepebolim.players;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.Game;

public class Ball extends Entity {

	public int width, height;
	public static boolean up = true, down = false, left = false, right = false, movedUp = true, movedDown;
	public static double maxX = 83, maxY = 85, minX = 13, minY = 27.5;
	public static boolean ballUp = Game.rand.nextBoolean();
	public static boolean ballRight = Game.rand2.nextBoolean();
	public static boolean running = true;
	public static boolean isGoal = false;
	public static double speed = 1;
	public static double time;

	public static BufferedImage ball;

	public Ball(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);

		ball = Game.sprite.getSprite(0, 64, 16, 16);
	}

	public void tick() {

		
		if(isGoal == true) {
			x = 48;
			y = 56;
			isGoal = false;
		}
		//Rever essa lógica > Colisão da Bola com o Player - Lembrar de usar as variávies center,right e left.
		//System.out.println("Ball" + x);
		//System.out.println("Player"+TeamA.newX);
		//System.out.println(y);
		//System.out.println(TeamA.newY);
		
		if(running == true) {

			System.out.println(y);
			System.out.println(Game.teamA[1].y+4);
			if(y == (Game.teamA[1].y+4)) {
				if(TeamA.right) {
					y-=speed;
				}
				
			}
			
		if (ballUp == true && ballRight == false) {
			
			y-=speed;
			x-=speed;
			
			if(x <= 11 && y > 47 && y < 65) {
				x-=speed*2;
				isGoal = true;
				TeamA.gol++;
				x--;
				ballRight = true;
			}

			if (y <= 26) {
				ballUp = false;
			}

			if (x <= 11) {
				ballRight = true;
			}

		} if (ballUp == false && ballRight == true) {
			y+=speed;
			x+=speed;
			
			if(x >= 85 && y > 47 && y < 65) {
				x+=speed*2;
				isGoal = true;
				TeamB.gol++;
				x++;
				ballRight = false;
			}
			
			if (y >= 85) {
				ballUp = true;
			}

			if (x >= 85) {
				ballRight = false;
			}

		} if (ballUp == false && ballRight == false) {
			y+=speed;
			x-=speed;
			
			if(x <= 11 && y > 47 && y < 65) {
				x-=speed*2;
				isGoal = true;
				TeamA.gol++;
				x--;
				ballRight = true;
			}
			
			if (y >= 85) {
				ballUp = true;
			}

			if (x <= 11) {
				ballRight = true;
			}

		} if (ballUp == true && ballRight == true) {
			y-=speed;
			x+=speed;
			
			if(x >= 85 && y > 47 && y < 65) {
				x+=speed*2;
				isGoal = true;
				TeamB.gol++;
				x++;
				ballRight = false;
			}
			
			if (y <= 26) {
				ballUp = false;

			}

			if (x >= 85) {
				ballRight = false;
			}
		}
		
		time+=speed;
		System.out.println(time);
		if(time >= 6) {
	
			running = false;
		
			}
		}
		
		

	}
	

	public void render(Graphics g) {
		g.drawImage(Ball.ball, this.getX(), this.getY(), null);
	}

}
