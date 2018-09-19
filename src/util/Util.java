package util;
 
import java.util.Arrays;
 
 
public class Util {
	
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
