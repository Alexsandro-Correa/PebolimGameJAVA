package br.com.alexsandro.gamepebolim.field;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.Game;

public class Tile {

	public static BufferedImage P1 = Game.sprite.getSprite(49, 0, 16, 16);
	public static BufferedImage P2 = Game.sprite.getSprite(49, 16, 16, 16);
	public static BufferedImage P3 = Game.sprite.getSprite(49, 32, 16, 16);
	public static BufferedImage P4 = Game.sprite.getSprite(49, 48, 16, 16);
	public static BufferedImage P5 = Game.sprite.getSprite(49, 64, 16, 16);
	public static BufferedImage P6 = Game.sprite.getSprite(49, 80, 16, 16);
	
	public static BufferedImage P7 = Game.sprite.getSprite(65, 0, 16, 16);
	public static BufferedImage P8 = Game.sprite.getSprite(65, 16, 16, 16);
	public static BufferedImage P9 = Game.sprite.getSprite(65, 32, 16, 16);
	public static BufferedImage P10 = Game.sprite.getSprite(65, 48, 16, 16);
	public static BufferedImage P11 = Game.sprite.getSprite(65, 64, 16, 16);
	public static BufferedImage P12 = Game.sprite.getSprite(65, 80, 16, 16);
	
	public static BufferedImage P13 = Game.sprite.getSprite(81, 0, 16, 16);
	public static BufferedImage P14 = Game.sprite.getSprite(81, 16, 16, 16);
	public static BufferedImage P15 = Game.sprite.getSprite(81, 32, 16, 16);
	public static BufferedImage P16 = Game.sprite.getSprite(81, 48, 16, 16);
	public static BufferedImage P17 = Game.sprite.getSprite(81, 64, 16, 16);
	public static BufferedImage P18 = Game.sprite.getSprite(81, 80, 16, 16);
	
	public static BufferedImage P19 = Game.sprite.getSprite(97, 0, 16, 16);
	public static BufferedImage P20 = Game.sprite.getSprite(97, 16, 16, 16);
	public static BufferedImage P21 = Game.sprite.getSprite(97, 32, 16, 16);
	public static BufferedImage P22 = Game.sprite.getSprite(97, 48, 16, 16);
	public static BufferedImage P23 = Game.sprite.getSprite(97, 64, 16, 16);
	public static BufferedImage P24 = Game.sprite.getSprite(97, 80, 16, 16);

	public static BufferedImage P25 = Game.sprite.getSprite(113, 0, 16, 16);
	public static BufferedImage P26 = Game.sprite.getSprite(113, 16, 16, 16);
	public static BufferedImage P27 = Game.sprite.getSprite(113, 32, 16, 16);
	public static BufferedImage P28 = Game.sprite.getSprite(113, 48, 16, 16);
	public static BufferedImage P29 = Game.sprite.getSprite(113, 64, 16, 16);
	public static BufferedImage P30 = Game.sprite.getSprite(113, 80, 16, 16);

	public static BufferedImage P36 = Game.sprite.getSprite(129, 0, 16, 16);
	public static BufferedImage P37 = Game.sprite.getSprite(129, 16, 16, 16);
	public static BufferedImage P38 = Game.sprite.getSprite(129, 32, 16, 16);
	public static BufferedImage P39 = Game.sprite.getSprite(129, 48, 16, 16);
	
	public static BufferedImage P40 = Game.sprite.getSprite(0, 80, 16, 16);
	public static BufferedImage P41 = Game.sprite.getSprite(16, 80, 16, 16);
	public static BufferedImage P42 = Game.sprite.getSprite(32, 80, 16, 16);

	private BufferedImage sprite;
	private int x, y;

	public Tile(int x, int y, BufferedImage sprite) {
		this.x = x;
		this.y = y;
		this.sprite = sprite;
	}

	public void render(Graphics g) {
		g.drawImage(sprite, x, y, null);
	}

}
