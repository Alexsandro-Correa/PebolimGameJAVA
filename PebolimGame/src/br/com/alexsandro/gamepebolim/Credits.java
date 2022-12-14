package br.com.alexsandro.gamepebolim;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.sprites.Sprites;

public class Credits {

	public boolean back = false;
	private static Sprites sprite = new Sprites("/backgroundinicio.png");
	public static BufferedImage background = Credits.sprite.getSprite(0, 0, 80, 97);

	public void tick() {
		if (back) {
			back = false;
			Game.gameState = "MENU";
		}
	}

	public void render(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(0, 0, 0, 100));
		g2.fillRect(0, 0, Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE);
		g.drawImage(background, 0, 0, Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE, null);

		g2.setColor(new Color(0, 0, 0, 80));
		g2.fillRect(0, 0, Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE);

		g.setColor(new Color(255, 91, 76));
		g.setFont(new Font("Arial", Font.BOLD, 8 * Game.SCALE));
		g.drawString("Cr?ditos", 39 * Game.SCALE, 18 * Game.SCALE);

		g.setColor(Color.black);
		g.setFont(new Font("arial", Font.BOLD, 5 * Game.SCALE));

		g.setColor(Color.blue);
		g.drawString("Desenvolvimento ", 36 * Game.SCALE, 28 * Game.SCALE);

		g.setFont(new Font("arial", Font.BOLD, 4 * Game.SCALE));
		g.setColor(Color.black);
		g.drawString("Alexsandro Corr?a Rosa Matos", 28 * Game.SCALE, 38 * Game.SCALE);

		g.setFont(new Font("arial", Font.BOLD, 5 * Game.SCALE));
		g.setColor(Color.blue);
		g.drawString("Arte", 52 * Game.SCALE, 50 * Game.SCALE);

		g.setFont(new Font("arial", Font.BOLD, 4 * Game.SCALE));
		g.setColor(Color.black);
		g.drawString("Alexsandro Corr?a Rosa Matos", 28 * Game.SCALE, 60 * Game.SCALE);

		g.setFont(new Font("arial", Font.BOLD, 5 * Game.SCALE));
		g.setColor(Color.blue);
		g.drawString("Audio", 50 * Game.SCALE, 80 * Game.SCALE);

		g.setFont(new Font("arial", Font.BOLD, 4 * Game.SCALE));
		g.setColor(Color.black);
		g.drawString("Alexsandro Corr?a Rosa Matos", 28 * Game.SCALE, 90 * Game.SCALE);

		g.drawString("Erick Davi de Liz Rosa", 36 * Game.SCALE, 68 * Game.SCALE);

		g.setColor(new Color(255, 255, 255));
		g.drawString("Pressione B para voltar ao menu!", 26 * Game.SCALE, 100 * Game.SCALE);
	}

}
