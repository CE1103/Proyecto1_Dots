package app.client;

import java.awt.event.MouseEvent;

import app.server.Player;
import app.server.Turn;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class Game  {
	
	Player p1;
	Player p2;
	Turn b1;
	
	Label scorePlayer1;
	public static String[] lines = new String[24];
	
	public Game() {
		
		this.p1	= new Player(1);
		this.p2	= new Player(2);
		this.b1 = new Turn(p1, p2);
		
	}

	
	public void setPoints(javafx.scene.input.MouseEvent event) {
		
		if(this.p1.getTurn()){
			this.p1.scorePoints();
			((Line)event.getSource()).setStroke(Color.BLUE);
			p1.switchTurn();
		}
		else{
			this.p2.scorePoints();
			((Line)event.getSource()).setStroke(Color.RED);
			p1.switchTurn();
		}
	}
	
}
