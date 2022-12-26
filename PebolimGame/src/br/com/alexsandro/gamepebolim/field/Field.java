package br.com.alexsandro.gamepebolim.field;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Field {

	public static Tile[] tiles;
	public static int WIDTH, HEIGHT;
	public static final int TILE_SIZE = 16;

	public Field(String path) {

		try {
			BufferedImage map = ImageIO.read(getClass().getResource(path));
			int[] pixels = new int[map.getWidth() * map.getHeight()];
			WIDTH = map.getWidth();
			HEIGHT = map.getHeight();
			tiles = new Tile[map.getWidth() * map.getHeight()];
			map.getRGB(0, 0, map.getWidth(), map.getHeight(), pixels, 0, map.getWidth());
			for (int xx = 0; xx < map.getWidth(); xx++) {
				for (int yy = 0; yy < map.getWidth(); yy++) {
					int pixelAtual = pixels[xx + (yy * map.getWidth())];

					if (pixelAtual == 0xFF7C3E78) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P1);
					} else if (pixelAtual == 0xFF606060) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P2);
					} else if (pixelAtual == 0xFF303030) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P3);
					} else if (pixelAtual == 0xFFA0A0A0) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P4);
					} else if (pixelAtual == 0xFFC0C0C0) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P5);
					} else if (pixelAtual == 0xFFA1A1A1) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P6);

					} else if (pixelAtual == 0xFFFF7F7F) {
						tiles[xx + (yy * WIDTH)] = new TileColision(xx * 16, yy * 16, Tile.P7);
					} else if (pixelAtual == 0xFFFFB27F) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P8);
					} else if (pixelAtual == 0xFFFFB97F) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P9);
					} else if (pixelAtual == 0xFFFFE87F) {
						tiles[xx + (yy * WIDTH)] = new TileColision(xx * 16, yy * 16, Tile.P10);
					} else if (pixelAtual == 0xFFDAFF7F) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P11);
					} else if (pixelAtual == 0xFFA5FF7F) {
						tiles[xx + (yy * WIDTH)] = new TileColision(xx * 16, yy * 16, Tile.P12);

					} else if (pixelAtual == 0xFFFF0022) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P13);
					} else if (pixelAtual == 0xFFFF0033) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P36);
					} else if (pixelAtual == 0xFFFF0044) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P39);
					} else if (pixelAtual == 0xFFFF0055) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P39);
					} else if (pixelAtual == 0xFFFF0066) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P38);
					} else if (pixelAtual == 0xFFFF0077) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P12);
					} else if (pixelAtual == 0xFFFF0088) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P19);
					} else if (pixelAtual == 0xFFFF0099) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P24);

					} else if (pixelAtual == 0xFF7FFF8E) {
						tiles[xx + (yy * WIDTH)] = new TileColision(xx * 16, yy * 16, Tile.P13);
					} else if (pixelAtual == 0xFF7FFFC5) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P14);
					} else if (pixelAtual == 0xFF7C7643) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P15);
					} else if (pixelAtual == 0xFF7C4D47) {
						tiles[xx + (yy * WIDTH)] = new TileColision(xx * 16, yy * 16, Tile.P16);
					} else if (pixelAtual == 0xFF4CFF00) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P17);
					} else if (pixelAtual == 0xFF7C435D) {
						tiles[xx + (yy * WIDTH)] = new TileColision(xx * 16, yy * 16, Tile.P18);

					} else if (pixelAtual == 0xFF4CFF22) {
						tiles[xx + (yy * WIDTH)] = new TileColision(xx * 16, yy * 16, Tile.P19);
					} else if (pixelAtual == 0xFF76477C) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P20);
					} else if (pixelAtual == 0xFF3F297C) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P21);
					} else if (pixelAtual == 0xFF26537C) {
						tiles[xx + (yy * WIDTH)] = new TileColision(xx * 16, yy * 16, Tile.P22);
					} else if (pixelAtual == 0xFF3D7C73) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P23);
					} else if (pixelAtual == 0xFF4CFF44) {
						tiles[xx + (yy * WIDTH)] = new TileColision(xx * 16, yy * 16, Tile.P24);

					} else if (pixelAtual == 0xFF627C4C) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P25);
					} else if (pixelAtual == 0xFF4CFF66) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P26);
					} else if (pixelAtual == 0xFF7C4947) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P27);
					} else if (pixelAtual == 0xFF747A76) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P28);
					} else if (pixelAtual == 0xFF7F3F3F) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P29);
					} else if (pixelAtual == 0xFF7F593F) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P30);

					} else if (pixelAtual == 0xFF00FFFF) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P36);
					} else if (pixelAtual == 0xFF0094FF) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P37);
					} else if (pixelAtual == 0xFF0026FF) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P38);
					} else if (pixelAtual == 0xFF4800FF) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P39);
					} else if (pixelAtual == 0xFFB200FF) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P37);
					} else if (pixelAtual == 0xFF0000DC) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P38);

					} else if (pixelAtual == 0xFFB6FF20) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P40);
					} else if (pixelAtual == 0xFFB6FF22) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P41);
					} else if (pixelAtual == 0xFFB6FF28) {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P42);

					} else {
						tiles[xx + (yy * WIDTH)] = new Tile(xx * 16, yy * 16, Tile.P39);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void render(Graphics g) {

		for (int xx = 0; xx < WIDTH; xx++) {
			for (int yy = 0; yy < HEIGHT; yy++) {
				Tile tile = tiles[xx + (yy * WIDTH)];
				tile.render(g);
			}
		}

	}

}
