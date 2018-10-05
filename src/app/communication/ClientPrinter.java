package app.communication;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class ClientPrinter extends Game {
	
	public static void setScore(javafx.scene.input.MouseEvent event) {
		
		if(ClientCommunication.client.turn){
			((Line)event.getSource()).setStroke(Color.web("#FFAE52"));
			Player.scorePoints();
			System.out.println(Player.points);
			
		}
		else{
			((Line)event.getSource()).setStroke(Color.web("#95F4F1"));
		}
		
	}
}
