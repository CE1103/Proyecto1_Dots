package app.communication;


public class QueueElements extends Queue{
	
	public static int currentPort = 8099;

	
	public static int givePort() {
		/**
		 * Función que retorna el puerto siguiente en la cola para enviar al cliente que se conecte.
		 */
		
		if(currentPort == 8106) {
			
			currentPort = 8102;
			return currentPort;
			
		}else {
			
			currentPort += 1;
			return currentPort;
			
		}
	}
}