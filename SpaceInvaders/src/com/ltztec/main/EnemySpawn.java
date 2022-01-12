package com.ltztec.main;

import com.ltztec.entities.Enemy;
import com.ltztec.entities.Entity;


public class EnemySpawn {


	public int interval = 60*5;
	public int curTime = 0;
	
	public void tick() {
	
		curTime++;
		if(curTime == interval) {
			curTime= 0;
			
			
			int yy = 0;
			int xx = Entity.rand.nextInt(Game.WIDTH - 16);
			
			
			Enemy enemy = new Enemy(xx, yy, 16, 16, 1, Entity.ENEMY_EN);

			Game.entities.add(enemy);
			//System.out.println("Inimigo adicionado");
		} 
		
	}
	
	
}
