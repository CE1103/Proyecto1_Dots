package app.server;

import app.communication.Game;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class ClientPrinter extends Game {
	
	public static void setScore(javafx.scene.input.MouseEvent event) {
		
		if(P1.getTurn()){
			P1.scorePoints();
			//System.out.println(getScore());
			((Line)event.getSource()).setStroke(Color.web("#FFAE52"));
			P1.switchTurn();
		}
		else{
			P2.scorePoints();
			P1.switchTurn();
		}
	}
	
}
