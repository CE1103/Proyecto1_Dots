package util;
 
import java.util.Arrays;
 
 
public class Util {
<<<<<<< HEAD
 	
 	public static List createLinkedList() { // Mover Server
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
=======
>>>>>>> refs/heads/Client_Screens
	
	public static void displayArray(String[][] array) {
		
		for (int i = 0; i < 4; i++) {
			for (int n = 0; n < 4; n++) {
				System.out.println(array[i][n]);
			}
			System.out.println("siguiente array" + "\n\n");
		}
	}
	
	public static void displayArray1(String[][] array) {
		
		for (int i = 0; i < 4; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}

 }
