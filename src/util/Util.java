 package util;
 
 import com.fasterxml.jackson.core.*;
 import com.fasterxml.jackson.core.type.TypeReference;
 
 import java.io.File;
 import java.io.IOException;
 import java.util.Arrays;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.*;
 import com.fasterxml.jackson.databind.*;

import Test.ListHashMap;
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
	
	public static HashMap<String, ListHashMap> createHashMap(){
		HashMap<String, ListHashMap> m1 = new HashMap<>();
		
		m1.put("h1", new ListHashMap("p1","p2"));
		m1.put("h2", new ListHashMap("p2","p3"));
		m1.put("h3", new ListHashMap("p3","p4"));
		m1.put("h4", new ListHashMap("p4","p5"));
		m1.put("h5", new ListHashMap("p5","p6"));
		m1.put("h6", new ListHashMap("p6","p7"));
		m1.put("h7", new ListHashMap("p7","p8"));
		m1.put("h8", new ListHashMap("p9","p10"));
		m1.put("h9", new ListHashMap("p10","p11"));
		m1.put("h10", new ListHashMap("p11","p12"));
		m1.put("h11", new ListHashMap("p12","p13"));
		m1.put("h12", new ListHashMap("p13","p14"));
		m1.put("h13", new ListHashMap("p14","p15"));
		m1.put("h14", new ListHashMap("p15","p16"));
		m1.put("h15", new ListHashMap("p17","p18"));
		m1.put("h16", new ListHashMap("p18","p19"));
		m1.put("h17", new ListHashMap("p19","p20"));
		m1.put("h18", new ListHashMap("p20","p21"));
		m1.put("h19", new ListHashMap("p21","p22"));
		m1.put("h20", new ListHashMap("p22","p23"));
		m1.put("h21", new ListHashMap("p23","p24"));
		m1.put("h22", new ListHashMap("p25","p26"));
		m1.put("h23", new ListHashMap("p26","p27"));
		m1.put("h24", new ListHashMap("p27","p28"));
		m1.put("h25", new ListHashMap("p28","p29"));
		m1.put("h26", new ListHashMap("p29","p30"));
		m1.put("h27", new ListHashMap("p30","p31"));
		m1.put("h28", new ListHashMap("p31","p32"));
		m1.put("h29", new ListHashMap("p33","p34"));
		m1.put("h30", new ListHashMap("p34","p35"));
		m1.put("h31", new ListHashMap("p35","p36"));
		m1.put("h32", new ListHashMap("p36","p37"));
		m1.put("h33", new ListHashMap("p37","p38"));
		m1.put("h34", new ListHashMap("p38","p39"));
		m1.put("h35", new ListHashMap("p39","p40"));
		m1.put("h36", new ListHashMap("p41","p42"));
		m1.put("h37", new ListHashMap("p42","p43"));
		m1.put("h38", new ListHashMap("p43","p44"));
		m1.put("h39", new ListHashMap("p44","p45"));
		m1.put("h40", new ListHashMap("p45","p46"));
		m1.put("h41", new ListHashMap("p46","p47"));
		m1.put("h42", new ListHashMap("p47","p48"));
		m1.put("h43", new ListHashMap("p49","p50"));
		m1.put("h44", new ListHashMap("p50","p51"));
		m1.put("h45", new ListHashMap("p51","p52"));
		m1.put("h46", new ListHashMap("p52","p53"));
		m1.put("h47", new ListHashMap("p53","p54"));
		m1.put("h48", new ListHashMap("p54","p55"));
		m1.put("h49", new ListHashMap("p55","p56"));
		m1.put("h50", new ListHashMap("p57","p58"));
		m1.put("h51", new ListHashMap("p58","p59"));
		m1.put("h52", new ListHashMap("p59","p60"));
		m1.put("h53", new ListHashMap("p60","p61"));
		m1.put("h54", new ListHashMap("p61","p62"));
		m1.put("h55", new ListHashMap("p62","p63"));
		m1.put("h56", new ListHashMap("p63","p64"));
		
		m1.put("v1", new ListHashMap("p1","p9"));
		m1.put("v2", new ListHashMap("p2","p10"));
		m1.put("v3", new ListHashMap("p3","p11"));
		m1.put("v4", new ListHashMap("p4","p12"));
		m1.put("v5", new ListHashMap("p5","p13"));
		m1.put("v6", new ListHashMap("p6","p14"));
		m1.put("v7", new ListHashMap("p7","p15"));
		m1.put("v8", new ListHashMap("p8","p16"));
		m1.put("v9", new ListHashMap("p9","p17"));
		m1.put("v10", new ListHashMap("p10","p18"));
		m1.put("v11", new ListHashMap("p11","p19"));
		m1.put("v12", new ListHashMap("p12","p20"));
		m1.put("v13", new ListHashMap("p13","p21"));
		m1.put("v14", new ListHashMap("p14","p22"));
		m1.put("v15", new ListHashMap("p15","p23"));
		m1.put("v16", new ListHashMap("p16","p24"));
		m1.put("v17", new ListHashMap("p17","p25"));
		m1.put("v18", new ListHashMap("p18","p26"));
		m1.put("v19", new ListHashMap("p19","p27"));
		m1.put("v20", new ListHashMap("p20","p28"));
		m1.put("v21", new ListHashMap("p21","p29"));
		m1.put("v22", new ListHashMap("p22","p30"));
		m1.put("v23", new ListHashMap("p23","p31"));
		m1.put("v24", new ListHashMap("p24","p32"));
		m1.put("v25", new ListHashMap("p25","p33"));
		m1.put("v26", new ListHashMap("p26","p34"));
		m1.put("v27", new ListHashMap("p27","p35"));
		m1.put("v28", new ListHashMap("p28","p36"));
		m1.put("v29", new ListHashMap("p29","p37"));
		m1.put("v30", new ListHashMap("p30","p38"));
		m1.put("v31", new ListHashMap("p31","p39"));
		m1.put("v32", new ListHashMap("p32","p40"));
		m1.put("v33", new ListHashMap("p33","p41"));
		m1.put("v34", new ListHashMap("p34","p42"));
		m1.put("v35", new ListHashMap("p35","p43"));
		m1.put("v36", new ListHashMap("p36","p44"));
		m1.put("v37", new ListHashMap("p37","p45"));
		m1.put("v38", new ListHashMap("p38","p46"));
		m1.put("v39", new ListHashMap("p39","p47"));
		m1.put("v40", new ListHashMap("p40","p48"));
		m1.put("v41", new ListHashMap("p41","p49"));
		m1.put("v42", new ListHashMap("p42","p50"));
		m1.put("v43", new ListHashMap("p43","p51"));
		m1.put("v44", new ListHashMap("p44","p52"));
		m1.put("v45", new ListHashMap("p45","p53"));
		m1.put("v46", new ListHashMap("p46","p54"));
		m1.put("v47", new ListHashMap("p47","p55"));
		m1.put("v48", new ListHashMap("p48","p56"));
		m1.put("v49", new ListHashMap("p49","p57"));
		m1.put("v50", new ListHashMap("p50","p58"));
		m1.put("v51", new ListHashMap("p51","p59"));
		m1.put("v52", new ListHashMap("p52","p60"));
		m1.put("v53", new ListHashMap("p53","p61"));
		m1.put("v54", new ListHashMap("p54","p62"));
		m1.put("v55", new ListHashMap("p55","p63"));
		m1.put("v56", new ListHashMap("p56","p64"));	
		
		return m1;
	}
 }