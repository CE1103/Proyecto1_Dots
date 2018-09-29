package app.server;

import app.communication.Game;

public class Player extends Game {
	
	public static int points;
	public boolean turn;
	
	public Player(int P) {
		
		points = 0;
		this.turn = false;
	}
	
	public static void switchTurn(){
		
		if(Game.P1.turn == true){
			Game.P1.turn = false;
			Game.P2.turn = true;
		}
		else {
			Game.P1.turn = true;
			Game.P2.turn = false;
		}
	}
	
	public void setTurn(Boolean turn){
		this.turn = turn;
	}
	
	public boolean getTurn(){
		return this.turn;
	}
	
	public void scorePoints(){
		points += 2;
	}
	
	public static int getScore(){
		return points;
	}

}