package app.server;

import app.communication.Game;

public class Player extends Game {
	
	private static int score;
	public boolean turn;
	
	public Player(int P) {
		
		score = 0;
		this.turn = false;
	}
	
	public static void switchTurn(){
		
		if(Game.P1.turn){
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
	
	public void scorePointsF(int scoreToAdd){
		score += scoreToAdd;
	}
	
	public static void scorePoints(int scoreToAdd) {
		if (Game.P1.getTurn()){
			Game.P1.scorePointsF(scoreToAdd);
		} else if (Game.P2.getTurn()) {
			Game.P2.scorePointsF(scoreToAdd);
		}
	}
	
	public static int getScore(){
		return score;
	}

}