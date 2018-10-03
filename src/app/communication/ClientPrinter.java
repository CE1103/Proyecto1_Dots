package app.communication;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class ClientPrinter extends Game {
	
	public static void setScore(javafx.scene.input.MouseEvent event) {
		
		if(P1.getTurn()){
			((Line)event.getSource()).setStroke(Color.web("#FFAE52"));
			
		}
		else if(P2.getTurn()) {
				((Line)event.getSource()).setStroke(Color.web("#95F4F1"));
		}
		
	}
}
