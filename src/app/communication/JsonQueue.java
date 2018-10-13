package app.communication;

public class JsonQueue {
	
	public int port;
	
	public JsonQueue() {
		
		this.port = QueueElements.givePort();
		ServerCommunication.queue.enqueue(port);
	}
	

}
