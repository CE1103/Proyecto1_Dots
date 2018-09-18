 package util;
 
 import com.fasterxml.jackson.core.*;
 import com.fasterxml.jackson.core.type.TypeReference;
 
 import java.io.File;
 import java.io.IOException;
 import java.util.Arrays;
 
 import com.fasterxml.jackson.annotation.*;
 import com.fasterxml.jackson.databind.*;
 
 import app.client.Game;
 import app.communication.Client;
 import app.server.*;
 import javafx.scene.shape.Line;
 
 public class Util {
 	
 	public static void sendToServer() throws JsonGenerationException, JsonMappingException, IOException{
 		
 		ObjectMapper mapper = new ObjectMapper();
 		Client client = new Client(Arrays.toString(Game.lines));
 		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
 		String json = mapper.writeValueAsString(client);
 		System.out.println(json);
 	}
 	
 	public static List creteLinkedList() {
 		int p = 0;
 		int q = 4;
 		List matrix = new List();
 		for(int i = 0; i < 4; i++) {
 			List list = new List();
 			for(int j = 0; j < 4; j++) {
 				list.addPoint("p" + Integer.toString((4*q)-p)); p++;
 			}
 			q--;
			p=0;
			matrix.addNode(list);
		}
		matrix.displayPoint();
		return matrix;
	}
	
	public static String[][] linkedListToArray(){
		
		NodeList LN = List.firstPointFinal;
		NodeList LN1 = LN.matrix.firstPoint;
		String[][] arrays = new String[4][4];
		int i = 0;
		int j = 0;
		while(LN != null) {
			while(LN1 != null) {
				arrays[j][i] = LN1.getPointNumber(); i++;
				LN1 = LN1.next;
			}
			LN = LN.next;
			try {
				LN1 = LN.matrix.firstPoint;
			}catch (Exception e) {
				System.out.println(e);
			}
			j++; i = 0;
		}
		return arrays;
	}
	
	public static void displayArray(String[][] array) {
		
		for (int i = 0; i < 4; i++) {
			for (int n = 0; n < 4; n++) {
				System.out.println(array[i][n]);
			}
			System.out.println("siguiente array" + "\n\n");
		}
	}
 }