package app.communication;

import app.client.List;
import app.client.NodeList;
import app.client.Turn;


public class Game {
	
	public static Player P1 = new Player(1);
	public static Player P2 = new Player(2);
	public static Turn b1 = new Turn(P1, P2);

	public static String[][] dots = new String[8][8];
		
	public static void linkedListToArray(){ // Mover Server
		
		NodeList LN = List.firstPointFinal;
		System.out.println(List.firstPointFinal);
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
			}catch (Exception e) {}
			j++; i = 0;
		}
	}



}
