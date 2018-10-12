package app.communication;

import app.client.ClientScreen;
import app.client.GameController;
import app.server.Game;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class ClientPrinter extends Game  {
	
	public static void setColor() {
			
		
		if(ClientCommunication.client.turn) {
			
			ClientScreen.m1.get(ServerAttributes.linesStatic[GameController.x-1]).setStroke(Color.web("#95F4F1"));
			
			
		}

	}
	
	public static void setColorPlayer(javafx.scene.input.MouseEvent event) {
		
		((Line)event.getSource()).setStroke(Color.web("#FFAE52"));

		
	}
	

}
