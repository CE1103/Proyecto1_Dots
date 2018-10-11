package util;
 
import java.util.Arrays;
import java.util.HashMap;

import HashMapAndPath.ListPathCreated;
import HashMapAndPath.NodeLinesPath;
import HashMapAndPath.PathList;
import app.server.List;
import app.server.Main;
import app.server.NodeList;
 
 public class Util {
	 
	 public static boolean pathThreadOn = false;
	
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
	
	public static List arrayToNode(String[] array) {
		List NL = new List();
		System.out.println(Arrays.toString(array));
		for (int n = (array.length-1); n >= 0; n--) {
			String str = array[array.length-1];
			if(str != array[n]) {
				System.out.println(array[n]);
				NL.addPoint(array[n]);
			}
			
		}
		return NL;
	}
	
	
	public static void displayMatrixArray(String[][] array) {
		
		for (int i = 0; i < 4; i++) {
			for (int n = 0; n < 4; n++) {
				System.out.println(array[i][n]);
			}
			System.out.println("siguiente array" + "\n\n");
		}
	}
	
	
	public static HashMap<String, HashMapAndPath.ListHashMap> createHashMap(){
		HashMap<String, HashMapAndPath.ListHashMap> m1 = new HashMap<>();
		
		m1.put("h1", new HashMapAndPath.ListHashMap("p1","p2"));
		m1.put("h2", new HashMapAndPath.ListHashMap("p2","p3"));
		m1.put("h3", new HashMapAndPath.ListHashMap("p3","p4"));
		m1.put("h4", new HashMapAndPath.ListHashMap("p4","p5"));
		m1.put("h5", new HashMapAndPath.ListHashMap("p5","p6"));
		m1.put("h6", new HashMapAndPath.ListHashMap("p6","p7"));
		m1.put("h7", new HashMapAndPath.ListHashMap("p7","p8"));
		m1.put("h8", new HashMapAndPath.ListHashMap("p9","p10"));
		m1.put("h9", new HashMapAndPath.ListHashMap("p10","p11"));
		m1.put("h10", new HashMapAndPath.ListHashMap("p11","p12"));
		m1.put("h11", new HashMapAndPath.ListHashMap("p12","p13"));
		m1.put("h12", new HashMapAndPath.ListHashMap("p13","p14"));
		m1.put("h13", new HashMapAndPath.ListHashMap("p14","p15"));
		m1.put("h14", new HashMapAndPath.ListHashMap("p15","p16"));
		m1.put("h15", new HashMapAndPath.ListHashMap("p17","p18"));
		m1.put("h16", new HashMapAndPath.ListHashMap("p18","p19"));
		m1.put("h17", new HashMapAndPath.ListHashMap("p19","p20"));
		m1.put("h18", new HashMapAndPath.ListHashMap("p20","p21"));
		m1.put("h19", new HashMapAndPath.ListHashMap("p21","p22"));
		m1.put("h20", new HashMapAndPath.ListHashMap("p22","p23"));
		m1.put("h21", new HashMapAndPath.ListHashMap("p23","p24"));
		m1.put("h22", new HashMapAndPath.ListHashMap("p25","p26"));
		m1.put("h23", new HashMapAndPath.ListHashMap("p26","p27"));
		m1.put("h24", new HashMapAndPath.ListHashMap("p27","p28"));
		m1.put("h25", new HashMapAndPath.ListHashMap("p28","p29"));
		m1.put("h26", new HashMapAndPath.ListHashMap("p29","p30"));
		m1.put("h27", new HashMapAndPath.ListHashMap("p30","p31"));
		m1.put("h28", new HashMapAndPath.ListHashMap("p31","p32"));
		m1.put("h29", new HashMapAndPath.ListHashMap("p33","p34"));
		m1.put("h30", new HashMapAndPath.ListHashMap("p34","p35"));
		m1.put("h31", new HashMapAndPath.ListHashMap("p35","p36"));
		m1.put("h32", new HashMapAndPath.ListHashMap("p36","p37"));
		m1.put("h33", new HashMapAndPath.ListHashMap("p37","p38"));
		m1.put("h34", new HashMapAndPath.ListHashMap("p38","p39"));
		m1.put("h35", new HashMapAndPath.ListHashMap("p39","p40"));
		m1.put("h36", new HashMapAndPath.ListHashMap("p41","p42"));
		m1.put("h37", new HashMapAndPath.ListHashMap("p42","p43"));
		m1.put("h38", new HashMapAndPath.ListHashMap("p43","p44"));
		m1.put("h39", new HashMapAndPath.ListHashMap("p44","p45"));
		m1.put("h40", new HashMapAndPath.ListHashMap("p45","p46"));
		m1.put("h41", new HashMapAndPath.ListHashMap("p46","p47"));
		m1.put("h42", new HashMapAndPath.ListHashMap("p47","p48"));
		m1.put("h43", new HashMapAndPath.ListHashMap("p49","p50"));
		m1.put("h44", new HashMapAndPath.ListHashMap("p50","p51"));
		m1.put("h45", new HashMapAndPath.ListHashMap("p51","p52"));
		m1.put("h46", new HashMapAndPath.ListHashMap("p52","p53"));
		m1.put("h47", new HashMapAndPath.ListHashMap("p53","p54"));
		m1.put("h48", new HashMapAndPath.ListHashMap("p54","p55"));
		m1.put("h49", new HashMapAndPath.ListHashMap("p55","p56"));
		m1.put("h50", new HashMapAndPath.ListHashMap("p57","p58"));
		m1.put("h51", new HashMapAndPath.ListHashMap("p58","p59"));
		m1.put("h52", new HashMapAndPath.ListHashMap("p59","p60"));
		m1.put("h53", new HashMapAndPath.ListHashMap("p60","p61"));
		m1.put("h54", new HashMapAndPath.ListHashMap("p61","p62"));
		m1.put("h55", new HashMapAndPath.ListHashMap("p62","p63"));
		m1.put("h56", new HashMapAndPath.ListHashMap("p63","p64"));
		
		m1.put("v1", new HashMapAndPath.ListHashMap("p1","p9"));
		m1.put("v2", new HashMapAndPath.ListHashMap("p2","p10"));
		m1.put("v3", new HashMapAndPath.ListHashMap("p3","p11"));
		m1.put("v4", new HashMapAndPath.ListHashMap("p4","p12"));
		m1.put("v5", new HashMapAndPath.ListHashMap("p5","p13"));
		m1.put("v6", new HashMapAndPath.ListHashMap("p6","p14"));
		m1.put("v7", new HashMapAndPath.ListHashMap("p7","p15"));
		m1.put("v8", new HashMapAndPath.ListHashMap("p8","p16"));
		m1.put("v9", new HashMapAndPath.ListHashMap("p9","p17"));
		m1.put("v10", new HashMapAndPath.ListHashMap("p10","p18"));
		m1.put("v11", new HashMapAndPath.ListHashMap("p11","p19"));
		m1.put("v12", new HashMapAndPath.ListHashMap("p12","p20"));
		m1.put("v13", new HashMapAndPath.ListHashMap("p13","p21"));
		m1.put("v14", new HashMapAndPath.ListHashMap("p14","p22"));
		m1.put("v15", new HashMapAndPath.ListHashMap("p15","p23"));
		m1.put("v16", new HashMapAndPath.ListHashMap("p16","p24"));
		m1.put("v17", new HashMapAndPath.ListHashMap("p17","p25"));
		m1.put("v18", new HashMapAndPath.ListHashMap("p18","p26"));
		m1.put("v19", new HashMapAndPath.ListHashMap("p19","p27"));
		m1.put("v20", new HashMapAndPath.ListHashMap("p20","p28"));
		m1.put("v21", new HashMapAndPath.ListHashMap("p21","p29"));
		m1.put("v22", new HashMapAndPath.ListHashMap("p22","p30"));
		m1.put("v23", new HashMapAndPath.ListHashMap("p23","p31"));
		m1.put("v24", new HashMapAndPath.ListHashMap("p24","p32"));
		m1.put("v25", new HashMapAndPath.ListHashMap("p25","p33"));
		m1.put("v26", new HashMapAndPath.ListHashMap("p26","p34"));
		m1.put("v27", new HashMapAndPath.ListHashMap("p27","p35"));
		m1.put("v28", new HashMapAndPath.ListHashMap("p28","p36"));
		m1.put("v29", new HashMapAndPath.ListHashMap("p29","p37"));
		m1.put("v30", new HashMapAndPath.ListHashMap("p30","p38"));
		m1.put("v31", new HashMapAndPath.ListHashMap("p31","p39"));
		m1.put("v32", new HashMapAndPath.ListHashMap("p32","p40"));
		m1.put("v33", new HashMapAndPath.ListHashMap("p33","p41"));
		m1.put("v34", new HashMapAndPath.ListHashMap("p34","p42"));
		m1.put("v35", new HashMapAndPath.ListHashMap("p35","p43"));
		m1.put("v36", new HashMapAndPath.ListHashMap("p36","p44"));
		m1.put("v37", new HashMapAndPath.ListHashMap("p37","p45"));
		m1.put("v38", new HashMapAndPath.ListHashMap("p38","p46"));
		m1.put("v39", new HashMapAndPath.ListHashMap("p39","p47"));
		m1.put("v40", new HashMapAndPath.ListHashMap("p40","p48"));
		m1.put("v41", new HashMapAndPath.ListHashMap("p41","p49"));
		m1.put("v42", new HashMapAndPath.ListHashMap("p42","p50"));
		m1.put("v43", new HashMapAndPath.ListHashMap("p43","p51"));
		m1.put("v44", new HashMapAndPath.ListHashMap("p44","p52"));
		m1.put("v45", new HashMapAndPath.ListHashMap("p45","p53"));
		m1.put("v46", new HashMapAndPath.ListHashMap("p46","p54"));
		m1.put("v47", new HashMapAndPath.ListHashMap("p47","p55"));
		m1.put("v48", new HashMapAndPath.ListHashMap("p48","p56"));
		m1.put("v49", new HashMapAndPath.ListHashMap("p49","p57"));
		m1.put("v50", new HashMapAndPath.ListHashMap("p50","p58"));
		m1.put("v51", new HashMapAndPath.ListHashMap("p51","p59"));
		m1.put("v52", new HashMapAndPath.ListHashMap("p52","p60"));
		m1.put("v53", new HashMapAndPath.ListHashMap("p53","p61"));
		m1.put("v54", new HashMapAndPath.ListHashMap("p54","p62"));
		m1.put("v55", new HashMapAndPath.ListHashMap("p55","p63"));
		m1.put("v56", new HashMapAndPath.ListHashMap("p56","p64"));	

		
		m1.put("d1", new HashMapAndPath.ListHashMap("p1","p10"));
		m1.put("d2", new HashMapAndPath.ListHashMap("p2","p11"));
		m1.put("d3", new HashMapAndPath.ListHashMap("p3","p12"));
		m1.put("d4", new HashMapAndPath.ListHashMap("p4","p13"));
		m1.put("d5", new HashMapAndPath.ListHashMap("p5","p14"));
		m1.put("d6", new HashMapAndPath.ListHashMap("p6","p15"));
		m1.put("d7", new HashMapAndPath.ListHashMap("p7","p16"));
		m1.put("d8", new HashMapAndPath.ListHashMap("p9","p18"));
		m1.put("d9", new HashMapAndPath.ListHashMap("p10","p19"));
		m1.put("d10", new HashMapAndPath.ListHashMap("p11","p20"));
		m1.put("d11", new HashMapAndPath.ListHashMap("p12","p21"));
		m1.put("d12", new HashMapAndPath.ListHashMap("p13","p22"));
		m1.put("d13", new HashMapAndPath.ListHashMap("p14","p23"));
		m1.put("d14", new HashMapAndPath.ListHashMap("p15","p24"));
		m1.put("d15", new HashMapAndPath.ListHashMap("p17","p26"));
		m1.put("d16", new HashMapAndPath.ListHashMap("p18","p27"));
		m1.put("d17", new HashMapAndPath.ListHashMap("p19","p28"));
		m1.put("d18", new HashMapAndPath.ListHashMap("p20","p29"));
		m1.put("d19", new HashMapAndPath.ListHashMap("p21","p30"));
		m1.put("d20", new HashMapAndPath.ListHashMap("p22","p31"));
		m1.put("d21", new HashMapAndPath.ListHashMap("p23","p32"));
		m1.put("d22", new HashMapAndPath.ListHashMap("p25","p34"));
		m1.put("d23", new HashMapAndPath.ListHashMap("p26","p35"));
		m1.put("d24", new HashMapAndPath.ListHashMap("p27","p36"));
		m1.put("d25", new HashMapAndPath.ListHashMap("p28","p37"));
		m1.put("d26", new HashMapAndPath.ListHashMap("p29","p38"));
		m1.put("d27", new HashMapAndPath.ListHashMap("p30","p39"));
		m1.put("d28", new HashMapAndPath.ListHashMap("p31","p40"));
		m1.put("d29", new HashMapAndPath.ListHashMap("p33","p42"));
		m1.put("d30", new HashMapAndPath.ListHashMap("p34","p43"));
		m1.put("d31", new HashMapAndPath.ListHashMap("p35","p44"));
		m1.put("d32", new HashMapAndPath.ListHashMap("p36","p45"));
		m1.put("d33", new HashMapAndPath.ListHashMap("p37","p46"));
		m1.put("d34", new HashMapAndPath.ListHashMap("p38","p47"));
		m1.put("d35", new HashMapAndPath.ListHashMap("p39","p48"));
		m1.put("d36", new HashMapAndPath.ListHashMap("p41","p50"));
		m1.put("d37", new HashMapAndPath.ListHashMap("p42","p51"));
		m1.put("d38", new HashMapAndPath.ListHashMap("p43","p52"));
		m1.put("d39", new HashMapAndPath.ListHashMap("p44","p53"));
		m1.put("d40", new HashMapAndPath.ListHashMap("p45","p54"));
		m1.put("d41", new HashMapAndPath.ListHashMap("p46","p55"));
		m1.put("d42", new HashMapAndPath.ListHashMap("p47","p56"));
		m1.put("d43", new HashMapAndPath.ListHashMap("p49","p58"));
		m1.put("d44", new HashMapAndPath.ListHashMap("p50","p59"));
		m1.put("d45", new HashMapAndPath.ListHashMap("p51","p60"));
		m1.put("d46", new HashMapAndPath.ListHashMap("p52","p61"));
		m1.put("d47", new HashMapAndPath.ListHashMap("p53","p62"));
		m1.put("d48", new HashMapAndPath.ListHashMap("p54","p63"));
		m1.put("d49", new HashMapAndPath.ListHashMap("p55","p64"));		
		
		return m1;
	}
	
	public static HashMap<String, HashMapAndPath.DotsToLinesList> createDotsToLineHM(){
		HashMap<String, HashMapAndPath.DotsToLinesList> m1 = new HashMap<>();
		
		m1.put("p1 p2", new HashMapAndPath.DotsToLinesList("h",1));
		m1.put("p2 p3", new HashMapAndPath.DotsToLinesList("h",2));
		m1.put("p3 p4", new HashMapAndPath.DotsToLinesList("h",3));
		m1.put("p4 p5", new HashMapAndPath.DotsToLinesList("h",4));
		m1.put("p5 p6", new HashMapAndPath.DotsToLinesList("h",5));
		m1.put("p6 p7", new HashMapAndPath.DotsToLinesList("h",6));
		m1.put("p7 p8", new HashMapAndPath.DotsToLinesList("h",7));
		m1.put("p9 p10", new HashMapAndPath.DotsToLinesList("h",8));
		m1.put("p10 p11", new HashMapAndPath.DotsToLinesList("h",9));
		m1.put("p11 p12", new HashMapAndPath.DotsToLinesList("h",10));
		m1.put("p12 p13", new HashMapAndPath.DotsToLinesList("h",11));
		m1.put("p13 p14", new HashMapAndPath.DotsToLinesList("h",12));
		m1.put("p14 p15", new HashMapAndPath.DotsToLinesList("h",13));
		m1.put("p15 p16", new HashMapAndPath.DotsToLinesList("h",14));
		m1.put("p17 p18", new HashMapAndPath.DotsToLinesList("h",15));
		m1.put("p18 p19", new HashMapAndPath.DotsToLinesList("h",16));
		m1.put("p19 p20", new HashMapAndPath.DotsToLinesList("h",17));
		m1.put("p20 p21", new HashMapAndPath.DotsToLinesList("h",18));
		m1.put("p21 p22", new HashMapAndPath.DotsToLinesList("h",19));
		m1.put("p22 p23", new HashMapAndPath.DotsToLinesList("h",20));
		m1.put("p23 p24", new HashMapAndPath.DotsToLinesList("h",21));
		m1.put("p25 p26", new HashMapAndPath.DotsToLinesList("h",22));
		m1.put("p26 p27", new HashMapAndPath.DotsToLinesList("h",23));
		m1.put("p27 p28", new HashMapAndPath.DotsToLinesList("h",24));
		m1.put("p28 p29", new HashMapAndPath.DotsToLinesList("h",25));
		m1.put("p29 p30", new HashMapAndPath.DotsToLinesList("h",26));
		m1.put("p30 p31", new HashMapAndPath.DotsToLinesList("h",27));
		m1.put("p31 p32", new HashMapAndPath.DotsToLinesList("h",28));
		m1.put("p33 p34", new HashMapAndPath.DotsToLinesList("h",29));
		m1.put("p34 p35", new HashMapAndPath.DotsToLinesList("h",30));
		m1.put("p35 p36", new HashMapAndPath.DotsToLinesList("h",31));
		m1.put("p36 p37", new HashMapAndPath.DotsToLinesList("h",32));
		m1.put("p37 p38", new HashMapAndPath.DotsToLinesList("h",33));
		m1.put("p38 p39", new HashMapAndPath.DotsToLinesList("h",34));
		m1.put("p39 p40", new HashMapAndPath.DotsToLinesList("h",35));
		m1.put("p41 p42", new HashMapAndPath.DotsToLinesList("h",36));
		m1.put("p42 p43", new HashMapAndPath.DotsToLinesList("h",37));
		m1.put("p43 p44", new HashMapAndPath.DotsToLinesList("h",38));
		m1.put("p44 p45", new HashMapAndPath.DotsToLinesList("h",39));
		m1.put("p45 p46", new HashMapAndPath.DotsToLinesList("h",40));
		m1.put("p46 p47", new HashMapAndPath.DotsToLinesList("h",41));
		m1.put("p47 p48", new HashMapAndPath.DotsToLinesList("h",42));
		m1.put("p49 p50", new HashMapAndPath.DotsToLinesList("h",43));
		m1.put("p50 p51", new HashMapAndPath.DotsToLinesList("h",44));
		m1.put("p51 p52", new HashMapAndPath.DotsToLinesList("h",45));
		m1.put("p52 p53", new HashMapAndPath.DotsToLinesList("h",46));
		m1.put("p53 p54", new HashMapAndPath.DotsToLinesList("h",47));
		m1.put("p54 p55", new HashMapAndPath.DotsToLinesList("h",48));
		m1.put("p55 p56", new HashMapAndPath.DotsToLinesList("h",49));
		m1.put("p57 p58", new HashMapAndPath.DotsToLinesList("h",50));
		m1.put("p58 p59", new HashMapAndPath.DotsToLinesList("h",51));
		m1.put("p59 p60", new HashMapAndPath.DotsToLinesList("h",52));
		m1.put("p60 p61", new HashMapAndPath.DotsToLinesList("h",53));
		m1.put("p61 p62", new HashMapAndPath.DotsToLinesList("h",54));
		m1.put("p62 p63", new HashMapAndPath.DotsToLinesList("h",55));
		m1.put("p63 p64", new HashMapAndPath.DotsToLinesList("h",56));
		
		m1.put("p1 p9", new HashMapAndPath.DotsToLinesList("v",1));
		m1.put("p2 p10", new HashMapAndPath.DotsToLinesList("v",2));
		m1.put("p3 p11", new HashMapAndPath.DotsToLinesList("v",3));
		m1.put("p4 p12", new HashMapAndPath.DotsToLinesList("v",4));
		m1.put("p5 p13", new HashMapAndPath.DotsToLinesList("v",5));
		m1.put("p6 p14", new HashMapAndPath.DotsToLinesList("v",6));
		m1.put("p7 p15", new HashMapAndPath.DotsToLinesList("v",7));
		m1.put("p8 p16", new HashMapAndPath.DotsToLinesList("v",8));
		m1.put("p9 p17", new HashMapAndPath.DotsToLinesList("v",9));
		m1.put("p10 p18", new HashMapAndPath.DotsToLinesList("v",10));
		m1.put("p11 p19", new HashMapAndPath.DotsToLinesList("v",11));
		m1.put("p12 p20", new HashMapAndPath.DotsToLinesList("v",12));
		m1.put("p13 p21", new HashMapAndPath.DotsToLinesList("v",13));
		m1.put("p14 p22", new HashMapAndPath.DotsToLinesList("v",14));
		m1.put("p15 p23", new HashMapAndPath.DotsToLinesList("v",15));
		m1.put("p16 p24", new HashMapAndPath.DotsToLinesList("v",16));
		m1.put("p17 p25", new HashMapAndPath.DotsToLinesList("v",17));
		m1.put("p18 p26", new HashMapAndPath.DotsToLinesList("v",18));
		m1.put("p19 p27", new HashMapAndPath.DotsToLinesList("v",19));
		m1.put("p20 p28", new HashMapAndPath.DotsToLinesList("v",20));
		m1.put("p21 p29", new HashMapAndPath.DotsToLinesList("v",21));
		m1.put("p22 p30", new HashMapAndPath.DotsToLinesList("v",22));
		m1.put("p23 p31", new HashMapAndPath.DotsToLinesList("v",23));
		m1.put("p24 p32", new HashMapAndPath.DotsToLinesList("v",24));
		m1.put("p25 p33", new HashMapAndPath.DotsToLinesList("v",25));
		m1.put("p26 p34", new HashMapAndPath.DotsToLinesList("v",26));
		m1.put("p27 p35", new HashMapAndPath.DotsToLinesList("v",27));
		m1.put("p28 p36", new HashMapAndPath.DotsToLinesList("v",28));
		m1.put("p29 p37", new HashMapAndPath.DotsToLinesList("v",29));
		m1.put("p30 p38", new HashMapAndPath.DotsToLinesList("v",30));
		m1.put("p31 p39", new HashMapAndPath.DotsToLinesList("v",31));
		m1.put("p32 p40", new HashMapAndPath.DotsToLinesList("v",32));
		m1.put("p33 p41", new HashMapAndPath.DotsToLinesList("v",33));
		m1.put("p34 p42", new HashMapAndPath.DotsToLinesList("v",34));
		m1.put("p35 p43", new HashMapAndPath.DotsToLinesList("v",35));
		m1.put("p36 p44", new HashMapAndPath.DotsToLinesList("v",36));
		m1.put("p37 p45", new HashMapAndPath.DotsToLinesList("v",37));
		m1.put("p38 p46", new HashMapAndPath.DotsToLinesList("v",38));
		m1.put("p39 p47", new HashMapAndPath.DotsToLinesList("v",39));
		m1.put("p40 p48", new HashMapAndPath.DotsToLinesList("v",40));
		m1.put("p41 p49", new HashMapAndPath.DotsToLinesList("v",41));
		m1.put("p42 p50", new HashMapAndPath.DotsToLinesList("v",42));
		m1.put("p43 p51", new HashMapAndPath.DotsToLinesList("v",43));
		m1.put("p44 p52", new HashMapAndPath.DotsToLinesList("v",44));
		m1.put("p45 p53", new HashMapAndPath.DotsToLinesList("v",45));
		m1.put("p46 p54", new HashMapAndPath.DotsToLinesList("v",46));
		m1.put("p47 p55", new HashMapAndPath.DotsToLinesList("v",47));
		m1.put("p48 p56", new HashMapAndPath.DotsToLinesList("v",48));
		m1.put("p49 p57", new HashMapAndPath.DotsToLinesList("v",49));
		m1.put("p50 p58", new HashMapAndPath.DotsToLinesList("v",50));
		m1.put("p51 p59", new HashMapAndPath.DotsToLinesList("v2",51));
		m1.put("p52 p60", new HashMapAndPath.DotsToLinesList("v",52));
		m1.put("p53 p61", new HashMapAndPath.DotsToLinesList("v",53));
		m1.put("p54 p62", new HashMapAndPath.DotsToLinesList("v",54));
		m1.put("p55 p63", new HashMapAndPath.DotsToLinesList("v",55));
		m1.put("p56 p64", new HashMapAndPath.DotsToLinesList("v",56));
		
		m1.put("p1 p10", new HashMapAndPath.DotsToLinesList("d",1));
		m1.put("p2 p11", new HashMapAndPath.DotsToLinesList("d",2));
		m1.put("p3 p12", new HashMapAndPath.DotsToLinesList("d",3));
		m1.put("p4 p13", new HashMapAndPath.DotsToLinesList("d",4));
		m1.put("p5 p14", new HashMapAndPath.DotsToLinesList("d",5));
		m1.put("p6 p15", new HashMapAndPath.DotsToLinesList("d",6));
		m1.put("p7 p16", new HashMapAndPath.DotsToLinesList("d",7));
		m1.put("p9 p18", new HashMapAndPath.DotsToLinesList("d",8));
		m1.put("p10 p19", new HashMapAndPath.DotsToLinesList("d",9));
		m1.put("p11 p20", new HashMapAndPath.DotsToLinesList("d",10));
		m1.put("p12 p21", new HashMapAndPath.DotsToLinesList("d",11));
		m1.put("p13 p22", new HashMapAndPath.DotsToLinesList("d",12));
		m1.put("p14 p23", new HashMapAndPath.DotsToLinesList("d",13));
		m1.put("p15 p24", new HashMapAndPath.DotsToLinesList("d",14));
		m1.put("p17 p26", new HashMapAndPath.DotsToLinesList("d",15));
		m1.put("p18 p27", new HashMapAndPath.DotsToLinesList("d",16));
		m1.put("p19 p28", new HashMapAndPath.DotsToLinesList("d",17));
		m1.put("p20 p29", new HashMapAndPath.DotsToLinesList("d",18));
		m1.put("p21 p30", new HashMapAndPath.DotsToLinesList("d",19));
		m1.put("p22 p31", new HashMapAndPath.DotsToLinesList("d",20));
		m1.put("p23 p32", new HashMapAndPath.DotsToLinesList("d",21));
		m1.put("p25 p34", new HashMapAndPath.DotsToLinesList("d",22));
		m1.put("p26 p35", new HashMapAndPath.DotsToLinesList("d",23));
		m1.put("p27 p36", new HashMapAndPath.DotsToLinesList("d",24));
		m1.put("p28 p37", new HashMapAndPath.DotsToLinesList("d",25));
		m1.put("p29 p38", new HashMapAndPath.DotsToLinesList("d",26));
		m1.put("p30 p39", new HashMapAndPath.DotsToLinesList("d",27));
		m1.put("p31 p40", new HashMapAndPath.DotsToLinesList("d",28));
		m1.put("p33 p42", new HashMapAndPath.DotsToLinesList("d",29));
		m1.put("p34 p43", new HashMapAndPath.DotsToLinesList("d",30));
		m1.put("p35 p44", new HashMapAndPath.DotsToLinesList("d",31));
		m1.put("p36 p45", new HashMapAndPath.DotsToLinesList("d",32));
		m1.put("p37 p46", new HashMapAndPath.DotsToLinesList("d",33));
		m1.put("p38 p47", new HashMapAndPath.DotsToLinesList("d",34));
		m1.put("p39 p48", new HashMapAndPath.DotsToLinesList("d",35));
		m1.put("p41 p50", new HashMapAndPath.DotsToLinesList("d",36));
		m1.put("p42 p51", new HashMapAndPath.DotsToLinesList("d",37));
		m1.put("p43 p52", new HashMapAndPath.DotsToLinesList("d",38));
		m1.put("p44 p53", new HashMapAndPath.DotsToLinesList("d",39));
		m1.put("p45 p54", new HashMapAndPath.DotsToLinesList("d",40));
		m1.put("p46 p55", new HashMapAndPath.DotsToLinesList("d",41));
		m1.put("p47 p56", new HashMapAndPath.DotsToLinesList("d",42));
		m1.put("p49 p58", new HashMapAndPath.DotsToLinesList("d",43));
		m1.put("p50 p59", new HashMapAndPath.DotsToLinesList("d",44));
		m1.put("p51 p60", new HashMapAndPath.DotsToLinesList("d",45));
		m1.put("p52 p61", new HashMapAndPath.DotsToLinesList("d",46));
		m1.put("p53 p62", new HashMapAndPath.DotsToLinesList("d",47));
		m1.put("p54 p63", new HashMapAndPath.DotsToLinesList("d",48));
		m1.put("p55 p64", new HashMapAndPath.DotsToLinesList("d",49));		
		
		return m1;
	}
	
	public static void displayArray1(String[][] array) {
		
		for (int i = 0; i < 4; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}
	
	public static String[] CompareList(String[] lines, String[] recentList) {
		System.out.println("error 1.75");
		
		int c = 0;
		int d = 0;
		
		System.out.println(Arrays.toString(lines));
		System.out.println(lines[c].equals("null"));
		System.out.println(lines[c].equals(null));
		
		while(!lines[c].equals("null")) {
			System.out.println("in");
			 if(recentList[d].equals(lines[c])) {
				
				c += 1;
				d = 0;
				
			}else if(recentList[d].equals("null")) {
				
				recentList[d] = lines[c];
				c += 1;
				d = 0;
				
			}else {
				
			}
			
			d += 1;
			
		}
		
		return recentList;
		
	}

 
	public static int scoredPoints(PathList pathCreated) {

		ListPathCreated LPC = new ListPathCreated();
		NodeLinesPath pathCreatedCurrent = pathCreated.firstNode;
		
		int score = 0;
		while(pathCreatedCurrent != null) {
			
			LPC.addListPathCreated(Main.m2.get(pathCreatedCurrent.getMatrix().firstNode.getPoint1() + " " + 
					pathCreatedCurrent.getMatrix().firstNode.getPoint2()));

			if(LPC.firstNode.getMatrix().firstNode.getLine() == "v" || LPC.firstNode.getMatrix().firstNode.getLine() == "h") {
				score += 2;
				pathCreatedCurrent = pathCreatedCurrent.getNext();
			}else if(LPC.firstNode.getMatrix().firstNode.getLine() == "d") {
				score +=1;
				pathCreatedCurrent = pathCreatedCurrent.getNext();
			}



		}
		
		return score;
	}

}
