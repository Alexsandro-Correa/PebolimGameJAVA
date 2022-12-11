package br.com.alexsandro.gamepebolim;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.sprites.Sprites;

public class Controls {

	public boolean back = false;
	private static Sprites sprite  = new Sprites("/backgroundinicio.png");
	public static BufferedImage background =  Controls.sprite.getSprite(0,0,80, 97);
	
	public void tick() {
		if(back) {
			back = false;
			Game.gameState = "MENU";
		}
	}
	
	public void render(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(0, 0, 0, 100));
		g2.fillRect(0, 0, Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE);
		g.drawImage(background,0,0,Game.WIDTH*Game.SCALE, Game.HEIGHT*Game.SCALE,null);
		g.setColor(Color.magenta);
		g.setFont(new Font("Arial",Font.BOLD,8*Game.SCALE));
		g.drawString("Controles", 39*Game.SCALE,18*Game.SCALE);
		
		
		g.setColor(Color.blue);
		g.setFont(new Font("arial",Font.BOLD,5*Game.SCALE));
		
		g.drawString("Time Azul ", 22*Game.SCALE, 36*Game.SCALE);
		
		g.setFont(new Font("arial",Font.BOLD,4*Game.SCALE));
		
		g.drawString("Chute Direita = D ", 16*Game.SCALE, 45*Game.SCALE);
		g.drawString("Chute Esquerda = A", 16*Game.SCALE, 49*Game.SCALE );
		
		g.drawString("Cima = W ", 16*Game.SCALE, 53*Game.SCALE);
		g.drawString("Baixo = S", 16*Game.SCALE, 57*Game.SCALE );
		
		g.drawString("Cima Goleiro = Q ", 16*Game.SCALE, 61*Game.SCALE);
		g.drawString("Baixo Goleiro = Z", 16*Game.SCALE, 65*Game.SCALE );
		
		g.setColor(Color.red);
		
		g.setFont(new Font("arial",Font.BOLD,5*Game.SCALE));
		
		g.drawString("Time Vermelho ", 58*Game.SCALE, 36*Game.SCALE);
		
		g.setFont(new Font("arial",Font.BOLD,4*Game.SCALE));
		
		g.drawString("Chute Direita = >", 60*Game.SCALE, 45*Game.SCALE);
		g.drawString("Chute Esquerda = <", 60*Game.SCALE, 49*Game.SCALE );
		
		g.drawString("Cima = ^", 60*Game.SCALE, 53*Game.SCALE);
		g.drawString("Baixo = v", 60*Game.SCALE, 57*Game.SCALE );
		
		g.drawString("Cima Goleiro = O ", 60*Game.SCALE, 61*Game.SCALE);
		g.drawString("Baixo Goleiro = L", 60*Game.SCALE, 65*Game.SCALE );
		
		g.drawString("Pressione B para voltar ao menu!", 26*Game.SCALE, 100*Game.SCALE );
	}
}