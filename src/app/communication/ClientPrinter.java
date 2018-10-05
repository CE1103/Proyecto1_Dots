package app.communication;

import app.client.data.DataUpdater;
import app.client.data.SharedData;
import app.server.Game;
import app.server.Main;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class ClientPrinter extends Game implements DataUpdater {
	
	static SharedData data;
	
	public static void setScore(javafx.scene.input.MouseEvent event) {
		
		if(ClientCommunication.client.turn){
			
			if(Game.P1.getTurn()) {
				//((Line)event.getSource()).setStroke(Color.web("#FFAE52"));
				Player.scorePoints();
				System.out.println(Player.points);
			}
			else if(Game.P2.getTurn()) {
				//((Line)event.getSource()).setStroke(Color.web("#95F4F1"));
				Player.scorePoints();
				System.out.println(Player.points);
			}
		}
		
	}
	
	public static void updateLineColor(String line) {
			
		data.getStringLineProp().set(line);
		
	}
	

}
