package com.ltztec.graficos;


import java.awt.Graphics;

import com.ltztec.world.World;



public class UI {
	
	
	public static int seconds = 0;
	public static int minutes = 0;
	public static int frames = 0;
	
	String formatTime = "";
	
	public void tick() {
		frames++;
		if(frames == 60) {
			//Passou 1 segundo.
			frames = 0;
			seconds++;
			if(seconds == 60) {
				seconds = 0;
				minutes++;
				if(UI.minutes % 2 == 0) {
					World.CICLO++;
					if(World.CICLO > World.noite) {
						World.CICLO = 0;
					}
				}
			}
		}
	}

	public void render(Graphics g) {
		
		if(minutes < 10) {
			formatTime+="0"+minutes+":";
		}else {
			formatTime+=minutes+":";
		}
		
		if(seconds < 10) {
			formatTime+="0"+seconds;
		}else {
			formatTime+=seconds;
		}
		
		
	}
	
}
