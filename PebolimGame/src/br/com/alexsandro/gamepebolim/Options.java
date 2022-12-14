package br.com.alexsandro.gamepebolim;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.sprites.Sprites;

public class Options {

	public String[] options = { "on", "off", "224", "336", "448", "560", "672", "784", "896" };

	public boolean up, down, enter;
	public int currentOption = 0;
	public int maxOption = options.length - 1;

	public static boolean sound = true;

	public static int size = 2;

	public boolean back = false;
	private static Sprites sprite = new Sprites("/backgroundinicio.png");
	public static BufferedImage background = Options.sprite.getSprite(0, 0, 80, 97);
	public static BufferedImage ballIcon = Game.sprite.getSprite(32, 64, 16, 16);

	public void tick() {
		if (back) {
			back = false;
			Game.gameState = "MENU";
		}
		if (up) {
			up = false;
			currentOption--;
			if (currentOption < 0) {
				currentOption = maxOption;
			}
		}

		if (down) {
			down = false;
			currentOption++;
			if (currentOption > maxOption) {
				currentOption = 0;
			}
		}

		if (enter) {
			enter = false;
			if (options[currentOption] == "on") {
				sound = true;
				System.out.println("On");

			} else if (options[currentOption] == "off") {
				sound = false;
				System.out.println("Off");
			} else if (options[currentOption] == "224") {
				Game.size = 2;
				Game.resizable = true;
			} else if (options[currentOption] == "336") {
				Game.size = 3;
				Game.resizable = true;
			} else if (options[currentOption] == "448") {
				Game.size = 4;
				Game.resizable = true;
			} else if (options[currentOption] == "560") {
				Game.size = 5;
				Game.resizable = true;
			} else if (options[currentOption] == "672") {
				Game.size = 6;
				Game.resizable = true;
			} else if (options[currentOption] == "784") {
				Game.size = 7;
				Game.resizable = true;
			} else if (options[currentOption] == "896") {
				Game.size = 8;
				Game.resizable = true;
			}

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
		g.drawString("Op??es", 42 * Game.SCALE, 18 * Game.SCALE);

		g.setColor(Color.black);
		g.setFont(new Font("arial", Font.BOLD, 5 * Game.SCALE));

		g.drawString("Sons", 51 * Game.SCALE, 28 * Game.SCALE);

		g.setColor(Color.white);
		g.setFont(new Font("arial", Font.BOLD, 4 * Game.SCALE));
		g.drawString("Ligar", 52 * Game.SCALE, 37 * Game.SCALE);
		g.drawString("Desligar", 50 * Game.SCALE, 42 * Game.SCALE);

		g.setColor(Color.black);
		g.setFont(new Font("arial", Font.BOLD, 5 * Game.SCALE));
		g.drawString("Tamanho da Janela", 35 * Game.SCALE, 52 * Game.SCALE);
		g.setFont(new Font("arial", Font.BOLD, 3 * Game.SCALE));

		g.setColor(Color.white);
		g.setFont(new Font("arial", Font.BOLD, 4 * Game.SCALE));
		g.drawString("224x224", 48 * Game.SCALE, 60 * Game.SCALE);
		g.drawString("336x336", 48 * Game.SCALE, 65 * Game.SCALE);
		g.drawString("448x448", 48 * Game.SCALE, 70 * Game.SCALE);
		g.drawString("560x560", 48 * Game.SCALE, 75 * Game.SCALE);
		g.drawString("672x672", 48 * Game.SCALE, 80 * Game.SCALE);
		g.drawString("784x784", 48 * Game.SCALE, 85 * Game.SCALE);
		g.drawString("896x896", 48 * Game.SCALE, 90 * Game.SCALE);

		if (options[currentOption] == "on") {
			g.drawImage(ballIcon, 45 * Game.SCALE, 34 * Game.SCALE, 4 * Game.SCALE, 4 * Game.SCALE, null);
		} else if (options[currentOption] == "off") {
			g.drawImage(ballIcon, 43 * Game.SCALE, 39 * Game.SCALE, 4 * Game.SCALE, 4 * Game.SCALE, null);
		} else if (options[currentOption] == "224") {
			g.drawImage(ballIcon, 38 * Game.SCALE, 57 * Game.SCALE, 4 * Game.SCALE, 4 * Game.SCALE, null);
		} else if (options[currentOption] == "336") {
			g.drawImage(ballIcon, 38 * Game.SCALE, 62 * Game.SCALE, 4 * Game.SCALE, 4 * Game.SCALE, null);
		} else if (options[currentOption] == "448") {
			g.drawImage(ballIcon, 38 * Game.SCALE, 67 * Game.SCALE, 4 * Game.SCALE, 4 * Game.SCALE, null);
		} else if (options[currentOption] == "560") {
			g.drawImage(ballIcon, 38 * Game.SCALE, 72 * Game.SCALE, 4 * Game.SCALE, 4 * Game.SCALE, null);
		} else if (options[currentOption] == "672") {
			g.drawImage(ballIcon, 38 * Game.SCALE, 77 * Game.SCALE, 4 * Game.SCALE, 4 * Game.SCALE, null);
		} else if (options[currentOption] == "784") {
			g.drawImage(ballIcon, 38 * Game.SCALE, 82 * Game.SCALE, 4 * Game.SCALE, 4 * Game.SCALE, null);
		} else if (options[currentOption] == "896") {
			g.drawImage(ballIcon, 38 * Game.SCALE, 87 * Game.SCALE, 4 * Game.SCALE, 4 * Game.SCALE, null);
		}

		g.setColor(new Color(255, 255, 255));
		g.drawString("Pressione B para voltar ao menu!", 26 * Game.SCALE, 100 * Game.SCALE);
	}

}
