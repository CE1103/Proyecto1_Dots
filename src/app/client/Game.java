package app.client;

import java.util.Arrays;

import app.server.Player;
import app.server.Turn;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import util.List;
import util.NodeList;


public class Game  {
	
	Player p1;
	Player p2;
	Turn b1;
	
	public static String[] lines = new String[24];
	public static String[][] dots = new String[4][4];
	
	
	public Game() {
		
		this.p1	= new Player(1);
		this.p2	= new Player(2);
		this.b1 = new Turn(p1, p2);
	}
	
public static void linkedListToArray(){
		
		NodeList LN = List.firstPointFinal;
		NodeList LN1 = LN.matrix.firstPoint;
		int i = 0;
		int j = 0;
		while(LN != null) {
			while(LN1 != null) {
				dots[j][i] = LN1.getPointNumber();
				i++;
				LN1 = LN1.next;
			};
			LN = LN.next;
			try {
				LN1 = LN.matrix.firstPoint;
			}catch (Exception e) {
				System.out.println(e);
			}
			j++; i = 0;
		}
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
