package app.client;

import app.communication.ClientCommunication;

public class GameOver {
	
	public static String winnerPlayer;
	public static String loserPlayer;
	
	public static int scoreWinnerPlayer;
	public static int scoreLoserPlayer;
	
	
	public static void checkWinnerPlayer() {
		
		if(!ClientCommunication.client.gameOn) {
			
			if(ClientCommunication.client.scoreP1 > ClientCommunication.client.scoreP2) {
				scoreWinnerPlayer = ClientCommunication.client.scoreP1;
				winnerPlayer = "Jugador1";
				loserPlayer = "Jugador2";
				scoreLoserPlayer = ClientCommunication.client.scoreP2;	
				
			}
			else {
				scoreWinnerPlayer = ClientCommunication.client.scoreP2;
				winnerPlayer = "Jugador2";
				loserPlayer = "Jugador1";
				scoreLoserPlayer = ClientCommunication.client.scoreP1;
			}
			
		}
		
	}

}
