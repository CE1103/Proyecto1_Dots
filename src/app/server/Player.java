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

	public void scorePoints(int score){
		points += score;
	}

	public int getScore(){
		return points;
	}
	
	public static void scoreAddint(int score) {
		if (Game.P1.getTurn()) {
			Game.P1.scorePoints(score);
		} else if (Game.P2.getTurn()) {
			Game.P2.scorePoints(score);
		}
			
	}


	public static void scoreAdd(int score) {
		if (Game.P1.getTurn()) {
			Game.P1.scorePoints(score);
		} else if (Game.P2.getTurn()) {
			Game.P2.scorePoints(score);
		}
	}
}