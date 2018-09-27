package app.server;

import app.communication.Game;

public class Player extends Game {
	
	public static int points;
	public boolean turn;
	
	public Player(int P) {
		
		points = 0;
		this.turn = false;
	}
	
	public void switchTurn(){
		
		if(this.turn){
			this.turn = false;
		}
		else {
			this.turn = true;
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