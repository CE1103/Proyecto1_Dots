package app.communication;


public class QueueElements extends Queue{
	
	public static int currentPort = 8099;

	
	public static int givePort() {
		
		if(currentPort == 8106) {
			
			currentPort = 8102;
			return currentPort;
			
		}else {
			
			currentPort += 1;
			return currentPort;
			
		}
	}
}