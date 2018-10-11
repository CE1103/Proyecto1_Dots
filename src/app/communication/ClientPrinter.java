package app.communication;

import app.client.GameController;
import app.server.Game;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class ClientPrinter extends Game  {
	
	public static void setColor(javafx.scene.input.MouseEvent event) {
			
		
//		System.out.println((Line)event.getSource());
		if(ClientCommunication.client.turn) {
			
			if(Game.P1.getTurn()) {
				((Line)event.getSource()).setStroke(Color.web("#FFAE52"));
			}
			else if(Game.P2.getTurn()) {
				((Line)event.getSource()).setStroke(Color.web("#95F4F1"));
			}
			
//				.setStroke(Color.web("#FFAE52"));
				
			
		}
		
//		else {
//			((Line)event.getSource()).setStroke(Color.web("#95F4F1"));
//		}

	}
	

}
