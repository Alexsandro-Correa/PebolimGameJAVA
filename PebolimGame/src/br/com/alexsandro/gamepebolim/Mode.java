package br.com.alexsandro.gamepebolim;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.players.GoalkeeperB;
import br.com.alexsandro.gamepebolim.players.TeamB;
import br.com.alexsandro.gamepebolim.sprites.Sprites;

public class Mode {

	public String[] options = { "VsPlayer", "VsIA" };

	public int currentOption = 0;
	public int maxOption = options.length - 1;
	public boolean up, down, enter;
	public boolean isRun = false;

	private static Sprites sprite = new Sprites("/backgroundinicio.png");
	public static BufferedImage background = sprite.getSprite(0, 0, 80, 97);
	public static BufferedImage ballIcon = Game.sprite.getSprite(32, 64, 16, 16);

	public void tick() {

		if (Menu.isRun == false) {

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
				if (options[currentOption] == "VsPlayer") {
					TeamB.cpu = false;
					GoalkeeperB.cpu = false;
					Game.gameState = "SELECIONARTIMEA";

				} else if (options[currentOption] == "VsIA") {
					TeamB.cpu = true;
					GoalkeeperB.cpu = true;
					Game.gameState = "SELECIONARTIMEA";
				}
			}
		} else {
			Game.gameState = "INICIO";
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
		g.drawString("Peb  lim Game", 29 * Game.SCALE, 29 * Game.SCALE);
		g.drawImage(ballIcon, 44 * Game.SCALE, 25 * Game.SCALE, 4 * Game.SCALE, 4 * Game.SCALE, null);

		g.setFont(new Font("Monospaced", Font.BOLD, 6 * Game.SCALE));
		g.setColor(Color.white);
		g.drawString("Player VS Player", 28 * Game.SCALE, 56 * Game.SCALE);
		g.drawString("Player VS I.A", 32 * Game.SCALE, 64 * Game.SCALE);

		if (options[currentOption] == "VsPlayer") {
			g.drawImage(ballIcon, 22 * Game.SCALE, 52 * Game.SCALE, 4 * Game.SCALE, 4 * Game.SCALE, null);
		} else if (options[currentOption] == "VsIA") {
			g.drawImage(ballIcon, 25 * Game.SCALE, 60 * Game.SCALE, 4 * Game.SCALE, 4 * Game.SCALE, null);
		}
	}

}
