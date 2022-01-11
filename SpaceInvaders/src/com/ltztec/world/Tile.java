package com.ltztec.world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;



public class Tile {
	

	private BufferedImage sprite;
	protected int x,y;
	
	public boolean solid = false;
	
	public Tile(int x,int y,BufferedImage sprite){
		this.x = x;
		this.y = y;
		this.sprite = sprite;
	}
	
	public void render(Graphics g){
		g.drawImage(sprite, x - Camera.x, y - Camera.y, null);
	}

}
