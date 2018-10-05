package app.communication;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Player {
	
	public static int points;
	public static boolean turn;
	
	public Player(int P) {
		
		points = 0;
		this.turn = false;
	}
	
	public static void switchTurn(){
		if(turn){
			turn = false;
		}
		else {
			turn = true;
		}
	}
	
	public void setTurn(Boolean turn){
		this.turn = turn;
	}
	
	public boolean getTurn(){
		return this.turn;
	}
	
	public static void scorePoints(){
		points += 2;
	}
	
	public static int getScore(){
		return points;
	}

}