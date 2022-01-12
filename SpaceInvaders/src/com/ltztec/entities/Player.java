package com.ltztec.entities;



import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.ltztec.main.Game;




public class Player extends Entity{

	
	public boolean right, left;
	public boolean isShooting = false;
	
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
		
		
		if(isShooting == true) {
			isShooting = false;
			
			int xx = this.getX() + 5;
			int yy = this.getY();
			
			Bullet bullet = new Bullet(xx, yy, 3, 3, 4, null);
			Game.entities.add(bullet);
			
		}
		
	}
	
	public void render(Graphics g) {
		super.render(g);
	}

	

	


}
