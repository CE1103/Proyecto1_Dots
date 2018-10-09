package app.server;


public class Turn{
	
	Player P1;
	Player P2;
	
	public Turn(Player p1, Player p2){
		
		this.P1 = p1;
		this.P2 = p2;
		
		this.P1.setTurn(true);
		this.P2.setTurn(false);
		
	}
	
}