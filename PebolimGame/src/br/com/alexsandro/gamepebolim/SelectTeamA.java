package br.com.alexsandro.gamepebolim;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import br.com.alexsandro.gamepebolim.players.TeamA;
import br.com.alexsandro.gamepebolim.sprites.Logos;
import br.com.alexsandro.gamepebolim.sprites.Sprites;
import br.com.alexsandro.gamepebolim.sprites.UniformsA;

public class SelectTeamA {

	public String[] options = { "gre", "ipa", "pal", "sao", "san", "cor", "cru", "cam", "ctb", "cap", "fla", "vas",
			"bot", "flu", "bra", "arg", "fra", "ita", "ale", "ing", "mil", "imi", "bar", "psg", "mad", "aja", "cit",
			"uni", "jap", "ara" };

	public int currentOption = 0;
	public int maxOption = options.length - 1;
	public boolean up, down, enter;

	private static Sprites sprite = new Sprites("/backgroundinicio.png");
	public static BufferedImage background = SelectTeamA.sprite.getSprite(0, 0, 80, 97);
	public static BufferedImage ballIcon = Game.sprite.getSprite(32, 64, 16, 16);

	public void tick() {
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
			if (options[currentOption] == "gre") {
				TeamA.centerPlayerA = UniformsA.gre;
				TeamA.rightPlayerA = UniformsA.greRight;
				TeamA.leftPlayerA = UniformsA.greLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.gre;

			} else if (options[currentOption] == "ipa") {
				TeamA.centerPlayerA = UniformsA.ipa;
				TeamA.rightPlayerA = UniformsA.ipaRight;
				TeamA.leftPlayerA = UniformsA.ipaLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.ipa;

			} else if (options[currentOption] == "pal") {
				TeamA.centerPlayerA = UniformsA.pal;
				TeamA.rightPlayerA = UniformsA.palRight;
				TeamA.leftPlayerA = UniformsA.palLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.pal;

			} else if (options[currentOption] == "sao") {
				TeamA.centerPlayerA = UniformsA.sao;
				TeamA.rightPlayerA = UniformsA.saoRight;
				TeamA.leftPlayerA = UniformsA.saoLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.sao;

			} else if (options[currentOption] == "san") {
				TeamA.centerPlayerA = UniformsA.san;
				TeamA.rightPlayerA = UniformsA.sanRight;
				TeamA.leftPlayerA = UniformsA.sanLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.san;

			} else if (options[currentOption] == "cor") {
				TeamA.centerPlayerA = UniformsA.cor;
				TeamA.rightPlayerA = UniformsA.corRight;
				TeamA.leftPlayerA = UniformsA.corLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.cor;

			} else if (options[currentOption] == "cru") {
				TeamA.centerPlayerA = UniformsA.cru;
				TeamA.rightPlayerA = UniformsA.cruRight;
				TeamA.leftPlayerA = UniformsA.cruLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.cru;

			} else if (options[currentOption] == "cam") {
				TeamA.centerPlayerA = UniformsA.cam;
				TeamA.rightPlayerA = UniformsA.camRight;
				TeamA.leftPlayerA = UniformsA.camLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.cam;

			} else if (options[currentOption] == "ctb") {
				TeamA.centerPlayerA = UniformsA.ctb;
				TeamA.rightPlayerA = UniformsA.ctbRight;
				TeamA.leftPlayerA = UniformsA.ctbLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.ctb;

			} else if (options[currentOption] == "cap") {
				TeamA.centerPlayerA = UniformsA.cap;
				TeamA.rightPlayerA = UniformsA.capRight;
				TeamA.leftPlayerA = UniformsA.capLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.cap;

			} else if (options[currentOption] == "fla") {
				TeamA.centerPlayerA = UniformsA.fla;
				TeamA.rightPlayerA = UniformsA.flaRight;
				TeamA.leftPlayerA = UniformsA.flaLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.fla;

			} else if (options[currentOption] == "vas") {
				TeamA.centerPlayerA = UniformsA.vas;
				TeamA.rightPlayerA = UniformsA.vasRight;
				TeamA.leftPlayerA = UniformsA.vasLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.vas;

			} else if (options[currentOption] == "bot") {
				TeamA.centerPlayerA = UniformsA.bot;
				TeamA.rightPlayerA = UniformsA.botRight;
				TeamA.leftPlayerA = UniformsA.botLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.bot;

			} else if (options[currentOption] == "flu") {
				TeamA.centerPlayerA = UniformsA.flu;
				TeamA.rightPlayerA = UniformsA.fluRight;
				TeamA.leftPlayerA = UniformsA.fluLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.flu;

			} else if (options[currentOption] == "bra") {
				TeamA.centerPlayerA = UniformsA.bra;
				TeamA.rightPlayerA = UniformsA.braRight;
				TeamA.leftPlayerA = UniformsA.braLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.bra;

			} else if (options[currentOption] == "arg") {
				TeamA.centerPlayerA = UniformsA.arg;
				TeamA.rightPlayerA = UniformsA.argRight;
				TeamA.leftPlayerA = UniformsA.argLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.arg;

			} else if (options[currentOption] == "fra") {
				TeamA.centerPlayerA = UniformsA.fra;
				TeamA.rightPlayerA = UniformsA.fraRight;
				TeamA.leftPlayerA = UniformsA.fraLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.fra;

			} else if (options[currentOption] == "ita") {
				TeamA.centerPlayerA = UniformsA.ita;
				TeamA.rightPlayerA = UniformsA.itaRight;
				TeamA.leftPlayerA = UniformsA.itaLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.ita;

			} else if (options[currentOption] == "ale") {
				TeamA.centerPlayerA = UniformsA.ale;
				TeamA.rightPlayerA = UniformsA.aleRight;
				TeamA.leftPlayerA = UniformsA.aleLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.ale;

			} else if (options[currentOption] == "ing") {
				TeamA.centerPlayerA = UniformsA.ing;
				TeamA.rightPlayerA = UniformsA.ingRight;
				TeamA.leftPlayerA = UniformsA.ingLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.ing;

			} else if (options[currentOption] == "mil") {
				TeamA.centerPlayerA = UniformsA.mil;
				TeamA.rightPlayerA = UniformsA.milRight;
				TeamA.leftPlayerA = UniformsA.milLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.mil;

			} else if (options[currentOption] == "imi") {
				TeamA.centerPlayerA = UniformsA.imi;
				TeamA.rightPlayerA = UniformsA.imiRight;
				TeamA.leftPlayerA = UniformsA.imiLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.imi;

			} else if (options[currentOption] == "bar") {
				TeamA.centerPlayerA = UniformsA.bar;
				TeamA.rightPlayerA = UniformsA.barRight;
				TeamA.leftPlayerA = UniformsA.barLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.bar;

			} else if (options[currentOption] == "psg") {
				TeamA.centerPlayerA = UniformsA.psg;
				TeamA.rightPlayerA = UniformsA.psgRight;
				TeamA.leftPlayerA = UniformsA.psgLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.psg;

			} else if (options[currentOption] == "mad") {
				TeamA.centerPlayerA = UniformsA.mad;
				TeamA.rightPlayerA = UniformsA.madRight;
				TeamA.leftPlayerA = UniformsA.madLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.mad;

			} else if (options[currentOption] == "aja") {
				TeamA.centerPlayerA = UniformsA.aja;
				TeamA.rightPlayerA = UniformsA.ajaRight;
				TeamA.leftPlayerA = UniformsA.ajaLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.aja;

			} else if (options[currentOption] == "cit") {
				TeamA.centerPlayerA = UniformsA.cit;
				TeamA.rightPlayerA = UniformsA.citRight;
				TeamA.leftPlayerA = UniformsA.citLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.cit;

			} else if (options[currentOption] == "uni") {
				TeamA.centerPlayerA = UniformsA.uni;
				TeamA.rightPlayerA = UniformsA.uniRight;
				TeamA.leftPlayerA = UniformsA.uniLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.uni;

			} else if (options[currentOption] == "jap") {
				TeamA.centerPlayerA = UniformsA.jap;
				TeamA.rightPlayerA = UniformsA.japRight;
				TeamA.leftPlayerA = UniformsA.japLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.jap;

			} else if (options[currentOption] == "ara") {
				TeamA.centerPlayerA = UniformsA.ara;
				TeamA.rightPlayerA = UniformsA.araRight;
				TeamA.leftPlayerA = UniformsA.araLeft;
				Game.gameState = "SELECIONARTIMEB";
				TeamA.logo = Logos.ara;
			}
		}
	}

	public void render(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(0, 0, 0, 200));
		g2.fillRect(0, 0, Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE);
		g.drawImage(background, 0, 0, Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE, null);

		g2.setColor(new Color(0, 0, 0, 80));
		g2.fillRect(0, 0, Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE);

		g.setColor(new Color(255, 255, 255));
		g.setFont(new Font("Arial", Font.BOLD, 8 * Game.SCALE));
		g.drawString("Selecione o Time A :", 20 * Game.SCALE, 16 * Game.SCALE);
	
		
		g.setColor(Color.green);
		if (options[currentOption] == "gre") {
			g.fillRect(27*Game.SCALE, 20*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "ipa") {
			g.fillRect(27*Game.SCALE, 30*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "pal") {
			g.fillRect(27*Game.SCALE, 40*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "sao") {
			g.fillRect(27*Game.SCALE, 50*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "san") {
			g.fillRect(27*Game.SCALE, 60*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		}else if (options[currentOption] == "cor") {
			g.fillRect(27*Game.SCALE, 70*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "cru") {
			g.fillRect(27*Game.SCALE, 80*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "cam") {
			g.fillRect(27*Game.SCALE, 90*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "ctb") {
			g.fillRect(41*Game.SCALE, 20*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		}else if (options[currentOption] == "cap") {
			g.fillRect(41*Game.SCALE, 30*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "fla") {
			g.fillRect(41*Game.SCALE, 40*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "vas") {
			g.fillRect(41*Game.SCALE, 50*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "bot") {
			g.fillRect(41*Game.SCALE, 60*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		}else if (options[currentOption] == "flu") {
			g.fillRect(41*Game.SCALE, 70*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "bra") {
			g.fillRect(41*Game.SCALE, 80*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "arg") {
			g.fillRect(41*Game.SCALE, 90*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "fra") {
			g.fillRect(55*Game.SCALE, 20*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		}else if (options[currentOption] == "ita") {
			g.fillRect(55*Game.SCALE, 30*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "ale") {
			g.fillRect(55*Game.SCALE, 40*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "ing") {
			g.fillRect(55*Game.SCALE, 50*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "mil") {
			g.fillRect(55*Game.SCALE, 60*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		}else if (options[currentOption] == "imi") {
			g.fillRect(55*Game.SCALE, 70*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "bar") {
			g.fillRect(55*Game.SCALE, 80*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "psg") {
			g.fillRect(69*Game.SCALE, 20*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "mad") {
			g.fillRect(69*Game.SCALE, 30*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		}else if (options[currentOption] == "aja") {
			g.fillRect(69*Game.SCALE, 40*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "cit") {
			g.fillRect(69*Game.SCALE, 50*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "uni") {
			g.fillRect(69*Game.SCALE, 60*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		} else if (options[currentOption] == "jap") {
			g.fillRect(69*Game.SCALE, 70*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		}else if (options[currentOption] == "ara") {
			g.fillRect(69*Game.SCALE, 80*Game.SCALE, 15*Game.SCALE, 11*Game.SCALE);
		}
		
		g.drawImage(Logos.gre, 26 * Game.SCALE, 18 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.ipa, 26 * Game.SCALE, 28 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.pal, 26 * Game.SCALE, 38 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.sao, 26 * Game.SCALE, 48 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.san, 26 * Game.SCALE, 58 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.cor, 26 * Game.SCALE, 68 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.cru, 26 * Game.SCALE, 78 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.cam, 26 * Game.SCALE, 88 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.ctb, 40 * Game.SCALE, 18 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.cap, 40 * Game.SCALE, 28 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.fla, 40 * Game.SCALE, 38 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.vas, 40 * Game.SCALE, 48 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.bot, 40 * Game.SCALE, 58 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.flu, 40 * Game.SCALE, 68 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.bra, 40 * Game.SCALE, 78 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.arg, 40 * Game.SCALE, 88 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.fra, 54 * Game.SCALE, 18 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.ita, 54 * Game.SCALE, 28 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.ale, 54 * Game.SCALE, 38 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.ing, 54 * Game.SCALE, 48 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.mil, 54 * Game.SCALE, 58 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.imi, 54 * Game.SCALE, 68 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.bar, 54 * Game.SCALE, 78 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.psg, 68 * Game.SCALE, 18 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.mad, 68 * Game.SCALE, 28 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.aja, 68 * Game.SCALE, 38 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.cit, 68 * Game.SCALE, 48 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.uni, 68 * Game.SCALE, 58 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.jap, 68 * Game.SCALE, 68 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
		g.drawImage(Logos.ara, 68 * Game.SCALE, 78 * Game.SCALE,16*Game.SCALE,16*Game.SCALE,null);
	}

}
