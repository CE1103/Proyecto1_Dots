package app.server;


public class Turn{

	boolean gameOver = false;
	Player p1;
	Player p2;
	
	public Turn(Player p1, Player p2){
		
		this.p1 = p1;
		this.p2 = p2;
		
		this.p1.setTurn(true);
		this.p2.setTurn(false);
		
	}
}