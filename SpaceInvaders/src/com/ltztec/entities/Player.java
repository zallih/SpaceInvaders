package com.ltztec.entities;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;




public class Player extends Entity{

	
	
	
	public Player(int x, int y, int width, int height,double speed,BufferedImage sprite) {
		super(x, y, width, height,speed,sprite);
	}
	
	public void tick(){
		
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(0, 0, 16, 16);
	}

	

	


}
