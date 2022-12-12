package br.com.alexsandro.gamepebolim.players;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.Game;
import br.com.alexsandro.gamepebolim.Sounds;

public class Ball extends Entity {

	public int width, height;
	public static boolean up = true, down = false, left = false, right = false, movedUp = true, movedDown;
	public static boolean ballUp = Game.rand.nextBoolean();
	public static boolean ballRight = Game.rand2.nextBoolean();
	public static boolean ballDown, ballLeft;
	public static boolean firstLooping = true;
	public static boolean running = true;
	public static boolean isGoal = false;
	public static double speed = 1;

	public static BufferedImage ball;

	public Ball(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);

		ball = Game.sprite.getSprite(32, 64, 16, 16);
	}

	public void tick() {
		// x = 63; Meio
		// y = 55; Meio
		// x = 18; // Colisao Esquerda
		// x = 90; //Colisao Direita
		// y = 54; // Gol
		// y = 72; // Gol
		// y = 34; // Colisao y Cima
		// y = 92; // Colisao y Baixo
		if (firstLooping == true) {

			ballRight = true;
			if (ballRight == true) {
				ballLeft = false;
			}
			if (ballRight == false) {
				ballLeft = true;
			}
			if (ballUp == true) {
				ballDown = false;
			}
			if (ballUp == false) {
				ballDown = true;
			}
			firstLooping = false;
		}

		if (isGoal == true) {
			x = 63;
			y = 55;
			isGoal = false;
		}

		for (int i = 0; i < Game.teamA.length; i++) {

			if (TeamA.left == true && x <= Game.teamA[i].x + 12 && x >= Game.teamA[i].x
					&& y == (int) (Game.teamA[i].y + 7)) {
				ballRight = true;
				running = true;
			} else if (TeamA.left == true && x <= Game.teamA[i].x + 12 && x >= Game.teamA[i].x
					&& y >= (int) (Game.teamA[i].y + 4) && y <= (int) (Game.teamA[i].y + 6)) {
				ballRight = true;
				ballUp = true;
				running = true;
			} else if (TeamA.left == true && x <= Game.teamA[i].x + 12 && x >= Game.teamA[i].x
					&& y >= (int) (Game.teamA[i].y + 7) && y <= (int) (Game.teamA[i].y + 10)) {
				ballRight = true;
				ballDown = true;
				running = true;
			}

			if (TeamA.right == true && x >= Game.teamA[i].x && x <= Game.teamA[i].x + 10
					&& y == (int) (Game.teamA[i].y + 7)) {
				ballLeft = true;
				running = true;
			} else if (TeamA.right == true && x >= Game.teamA[i].x && x <= Game.teamA[i].x + 10
					&& y >= (int) (Game.teamA[i].y + 4) && y <= (int) (Game.teamA[i].y + 6)) {
				ballLeft = true;
				ballUp = true;
				running = true;
			} else if (TeamA.right == true && x >= Game.teamA[i].x && x <= Game.teamA[i].x + 10
					&& y >= (int) (Game.teamA[i].y + 7) && y <= (int) (Game.teamA[i].y + 10)) {
				ballLeft = true;
				ballDown = true;
				running = true;
			}

			if (TeamB.right == true && x <= Game.teamB[i].x + 12 && x >= Game.teamB[i].x
					&& y == (int) (Game.teamB[i].y + 7)) {
				ballRight = true;
				running = true;
			} else if (TeamB.right == true && x <= Game.teamB[i].x + 12 && x >= Game.teamB[i].x
					&& y >= (int) (Game.teamB[i].y + 4) && y <= (int) (Game.teamB[i].y + 6)) {
				ballRight = true;
				ballUp = true;
				running = true;
			} else if (TeamB.right == true && x <= Game.teamB[i].x + 12 && x >= Game.teamB[i].x
					&& y >= (int) (Game.teamB[i].y + 7) && y <= (int) (Game.teamB[i].y + 10)) {
				ballRight = true;
				ballDown = true;
				running = true;
			}

			if (TeamB.left == true && x >= Game.teamB[i].x && x <= Game.teamB[i].x + 10
					&& y == (int) (Game.teamB[i].y + 7)) {
				ballLeft = true;
				running = true;
			} else if (TeamB.left == true && x >= Game.teamB[i].x && x <= Game.teamB[i].x + 10
					&& y >= (int) (Game.teamB[i].y + 4) && y <= (int) (Game.teamB[i].y + 6)) {
				ballLeft = true;
				ballUp = true;
				running = true;
			} else if (TeamB.left == true && x >= Game.teamB[i].x && x <= Game.teamB[i].x + 10
					&& y >= (int) (Game.teamB[i].y + 7) && y <= (int) (Game.teamB[i].y + 10)) {
				ballLeft = true;
				ballDown = true;
				running = true;
			}

			if (GoalkeeperA.left == true && x <= Game.keeperA.x + 12 && x >= Game.keeperA.x
					&& y == (int) (Game.keeperA.y + 7)) {
				ballRight = true;
				running = true;
			} else if (GoalkeeperA.left == true && x <= Game.keeperA.x + 12 && x >= Game.keeperA.x
					&& y >= (int) (Game.keeperA.y + 4) && y <= (int) (Game.keeperA.y + 6)) {
				ballRight = true;
				ballUp = true;
				running = true;
			} else if (GoalkeeperA.left == true && x <= Game.keeperA.x + 12 && x >= Game.keeperA.x
					&& y >= (int) (Game.keeperA.y + 7) && y <= (int) (Game.keeperA.y + 10)) {
				ballRight = true;
				ballDown = true;
				running = true;
			}

			if (GoalkeeperB.left == true && x >= Game.keeperB.x && x <= Game.keeperB.x + 10
					&& y == (int) (Game.keeperB.y + 7)) {
				ballLeft = true;
				running = true;
			} else if (GoalkeeperB.left == true && x >= Game.keeperB.x && x <= Game.keeperB.x + 10
					&& y >= (int) (Game.keeperB.y + 4) && y <= (int) (Game.keeperB.y + 6)) {
				ballLeft = true;
				ballUp = true;
				running = true;
			} else if (GoalkeeperB.left == true && x >= Game.keeperB.x && x <= Game.keeperB.x + 10
					&& y >= (int) (Game.keeperB.y + 7) && y <= (int) (Game.keeperB.y + 10)) {
				ballLeft = true;
				ballDown = true;
				running = true;
			}
		}

		if (running == true) {

			if ((int) x <= 18 && (int) y > 53 && (int) y < 73) {
				Sounds.gol.play();
				x -= speed * 2;
				isGoal = true;
				TeamB.gol++;
				ballRight = true;
				ballLeft = false;
			}

			if ((int) x >= 90 && (int) y > 53 && (int) y < 73) {
				Sounds.gol.play();
				x += speed * 2;
				isGoal = true;
				TeamA.gol++;
				ballRight = false;
				ballLeft = true;
			}

			if (ballRight == true) {
				x += speed;
			}

			if (ballLeft == true) {
				x -= speed;
			}

			if (ballUp == true) {
				y -= speed;
			}

			if (ballDown == true) {
				y += speed;
			}

			if (y <= 34) {
				ballUp = false;
				ballDown = true;
			}

			if (x <= 18) {
				ballRight = true;
				ballLeft = false;
			}

			if (y >= 92) {
				ballUp = true;
				ballDown = false;
			}

			if (x >= 90) {
				ballRight = false;
				ballLeft = true;
			}

			if (y >= 92) {
				ballUp = true;
				ballDown = false;
			}

			if (x <= 18) {
				ballRight = true;
				ballLeft = false;
			}

		}

		if (isColliding((int) x, (int) y)) {
			running = false;
			ballUp = false;
			ballDown = false;
			ballRight = false;
			ballLeft = false;
		}

	}

	public boolean isColliding(int xnext, int ynext) {

		Rectangle playerCurrent = new Rectangle((int) x, (int) y, 3, 3);

		
		 for (int i = 0; i < Game.teamA.length; i++) { TeamA tA = Game.teamA[i];
		 Rectangle targetPlayer = new Rectangle(tA.getX()+8, tA.getY()+6, 3, 3); if
		  (playerCurrent.intersects(targetPlayer)) { return true; }
		 
		 }
		  
		  for (int i = 0; i < Game.teamB.length; i++) { TeamB tB = Game.teamB[i];
		  Rectangle targetPlayer = new Rectangle(tB.getX()+8, tB.getY()+6, 3, 3); if
		 (playerCurrent.intersects(targetPlayer)) { return true; }
		  
		  }
		  
		  GoalkeeperA gA = Game.keeperA; Rectangle targetKeeperA = new
		  Rectangle(gA.getX()+8, gA.getY()+6, 3, 3); if
		  (playerCurrent.intersects(targetKeeperA)) { return true; }
		  
		  GoalkeeperB gB = Game.keeperB; Rectangle targetKeeperB = new
		  Rectangle(gB.getX()+8, gB.getY()+6, 3, 3); if
		  (playerCurrent.intersects(targetKeeperB)) { return true; }
		 

		return false;
	}

	public void render(Graphics g) {
		g.drawImage(Ball.ball, getX() * Game.SCALE, getY() * Game.SCALE, 4 * Game.SCALE, 4 * Game.SCALE, null);
	}

}
