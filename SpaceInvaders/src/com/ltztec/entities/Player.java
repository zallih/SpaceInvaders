package com.ltztec.entities;



import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.ltztec.main.Game;




public class Player extends Entity{

	
	public boolean right, left;
	
	public Player(int x, int y, int width, int height,double speed,BufferedImage sprite) {
		super(x, y, width, height,speed,sprite);
	}
	
	public void tick(){
		if(right) {
			x+=speed;
		}else if(left) {
			x-=speed;
		}
		
		if(x >= Game.WIDTH) {
			x = -16;
		}else if(x+16 < 0) {
			x = Game.WIDTH;
		}
		
	}
	
	public void render(Graphics g) {
		super.render(g);
	}

	

	


}
