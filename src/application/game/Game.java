package application.game;

import java.awt.event.MouseEvent;

import application.GameController;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class Game extends GameController {
	
	Player p1;
	Player p2;
	Turn b1;
	Label scorePlayer1;
	
	int[] h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11,h12,v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12;
	
	public Game() {
		
		this.p1	= new Player(1);
		this.p2	= new Player(2);
		this.b1 = new Turn(p1, p2);
		
		
	}
	
	public void setPoints() {
		
		if(this.p1.getTurn()){
			this.p1.scorePoints();
			//((Line)event.getSource()).setStroke(Color.BLUE);
		}
		else{
			this.p2.scorePoints();
		}
	}
	
}
