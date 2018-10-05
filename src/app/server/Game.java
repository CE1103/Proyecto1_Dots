package app.server;

import app.client.data.SharedData;
import app.communication.Player;
import javafx.beans.value.ObservableValue;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class Game {
	
	public static Player P1 = new Player(1);
	public static Player P2 = new Player(2);
	public static Turn b1 = new Turn(P1, P2);

	public static String[][] dots = new String[8][8];
	
	SharedData data;
		
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
			}catch (Exception e) {
				System.out.println(e);
			}
			j++; i = 0;
		}
	}

	public void setData(SharedData data) {
		this.data = data;
		
		data.getStringLineProp()
	      .addListener((ObservableValue<? extends String> observable,
	                String oldValue, String newValue) -> {
	      String array[] = newValue.split("-");
	      Color color = Integer.parseInt(array[1]) == 0 ? Color.web("#FFAE52") : Color.web("#95F4F1");
	      
	      Line line = (Line) Main.scene4.lookup("#" + array[0]);
	      line.setStroke(color);
  });
		
	}

}
