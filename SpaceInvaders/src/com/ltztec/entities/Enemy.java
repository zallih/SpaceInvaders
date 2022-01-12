package com.ltztec.entities;


import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.ltztec.main.Game;




public class Enemy extends Entity{
	
	
	

	public Enemy(double x, double y, int width, int height, double speed, BufferedImage sprite) {
		super(x, y, width, height, speed, null);
	
	}
	
	public void tick() {
		
		y+=speed;

		
		if(y >= Game.HEIGHT) {
			Game.entities.remove(this);
			return;
		}
		
	}
	
	public void render(Graphics g) {
		g.drawImage(Entity.ENEMY_EN, this.getX(), this.getY(), null);
	}
	
	


}
