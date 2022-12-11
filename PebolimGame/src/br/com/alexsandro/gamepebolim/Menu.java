package br.com.alexsandro.gamepebolim;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.sprites.Sprites;

public class Menu {

public String[] options = {"Iniciar", "Controles" ,"Creditos", "Sair"};
	
	public int currentOption = 0;
	public int maxOption = options.length - 1;
	public boolean up,down,enter;
	
	private static Sprites sprite  = new Sprites("/backgroundinicio.png");
	public static BufferedImage background =  Menu.sprite.getSprite(0,0,80, 97);
	public static BufferedImage ballIcon =  Game.sprite.getSprite(32,64,16,16);
	
	public void tick() {
		if(up) {
			up = false;
			currentOption--;
			if(currentOption < 0) {
				currentOption = maxOption;
			}
		}
		
		if(down) {
			down = false;
			currentOption++;
			if(currentOption > maxOption) {
				currentOption = 0;
			}
		}
		if(enter) {
			enter = false;
			if(options[currentOption] == "Iniciar") {
				Game.gameState = "INICIO";
				
			}else if (options[currentOption] == "Controles") {
				Game.gameState = "CONTROLES";
				
			}else if(options[currentOption] == "Creditos") {
				Game.gameState = "CREDITOS";
				
			}else if(options[currentOption] == "Sair") {
				Game.gameState = "SAIR";
				
			}
		}
	}
	
	public void render(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(0, 0, 0, 100));
		g2.fillRect(0, 0, Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE);
		g.drawImage(background,0,0,Game.WIDTH*Game.SCALE, Game.HEIGHT*Game.SCALE,null);
		g.setColor(Color.magenta);
		g.setFont(new Font("Arial",Font.BOLD,8*Game.SCALE));
		g.drawString("Peb  lim Game", 29*Game.SCALE,29*Game.SCALE);
		g.drawImage(ballIcon,44*Game.SCALE,25*Game.SCALE,4*Game.SCALE,4*Game.SCALE,null);
		//Menu Options
		
		g.setColor(Color.blue);
		g.setFont(new Font("arial",Font.BOLD,6*Game.SCALE));
		g.drawString("Iniciar", 48*Game.SCALE, 48*Game.SCALE);
		g.drawString("Controles", 44*Game.SCALE ,56*Game.SCALE );
		g.drawString("Cr�ditos",46*Game.SCALE , 64*Game.SCALE);
		g.drawString("Sair",51*Game.SCALE , 72*Game.SCALE);
		
		if(options[currentOption] == "Iniciar") {
			g.drawImage(ballIcon,40*Game.SCALE, 44*Game.SCALE,4*Game.SCALE,4*Game.SCALE,null);
		}else if(options[currentOption] == "Controles") {
			g.drawImage(ballIcon,36*Game.SCALE ,52*Game.SCALE,4*Game.SCALE,4*Game.SCALE,null);
		}else if(options[currentOption] == "Creditos") {
			g.drawImage(ballIcon,38*Game.SCALE , 60*Game.SCALE,4*Game.SCALE,4*Game.SCALE,null);
		}else if(options[currentOption] == "Sair") {
			g.drawImage(ballIcon,44*Game.SCALE , 68*Game.SCALE,4*Game.SCALE,4*Game.SCALE,null);
		}
	}
	
}