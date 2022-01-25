package com.ltztec.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.ltztec.main.Game;

public class Enemy extends Entity {

	int life = 3;

	public Enemy(double x, double y, int width, int height, double speed, BufferedImage sprite) {
		super(x, y, width, height, speed, null);

	}

	public void tick() {

		y += speed;

		if (y >= Game.HEIGHT) {
			Game.player.life--;
			Game.entities.remove(this);
			return;
		}

		for (int i = 0; i < Game.entities.size(); i++) {
			Entity e = Game.entities.get(i);
			if (e instanceof Bullet) {

				if (Entity.isColidding(this, e)) {
					Game.entities.remove(e);
					life--;
					if (life <= 0) {
						Game.entities.remove(this);
						Game.score++;
						return;
					}
					
					break;
				}

			}
		}

	}

	public void render(Graphics g) {
		g.drawImage(Entity.ENEMY_EN, this.getX(), this.getY(), null);
	}

}
