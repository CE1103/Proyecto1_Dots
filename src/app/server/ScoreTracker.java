package app.server;

public class ScoreTracker {
	
	public static int i = 0;
	
	public ScoreTracker() {
		
	}
	
	public static void Search(javafx.scene.input.MouseEvent event) {
		while(true) {
			if(Main.linesStatic[i] != null) {
				i ++;
			}
		}
	}

}
