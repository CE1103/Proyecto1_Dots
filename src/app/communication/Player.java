package app.communication;

public class Player extends Game {
	
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
	
	public void scorePoints(){
		points += 2;
	}
	
	public static int getScore(){
		return points;
	}

}