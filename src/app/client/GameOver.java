package app.client;

import app.communication.ClientCommunication;
import app.communication.Player;
import app.server.Game;

public class GameOver {
	
	public static String winnerPlayer;
	public static String loserPlayer;
	
	public static int scoreWinnerPlayer;
	public static int scoreLoserPlayer;
	
	
	public static void checkWinnerPlayer() {
		
		if(!ClientCommunication.client.gameOn) {
			
			if(Player.getScore() > Player.getScore()) {
				ClientCommunication.client.scoreP1 = scoreWinnerPlayer;
				winnerPlayer = "Jugador1";
				loserPlayer = "Jugador2";
				ClientCommunication.client.scoreP2 = scoreLoserPlayer;	
				
			}
			else {
				ClientCommunication.client.scoreP2 = scoreWinnerPlayer;
				winnerPlayer = "Jugador2";
				loserPlayer = "Jugador1";
				ClientCommunication.client.scoreP1 = scoreLoserPlayer;
			}
			
		}
		
	}

}
