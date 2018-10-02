package app.communication;

import util.PortList;
import util.PortNode;

public class QueueElements extends Queue{
	
	private PortList p1 = new PortList();
	public static int currentPort = 8099;
	
	public void Elements() {
		
		for(int i = 8100; i < 8107; i++) {
			p1.addPortList(i);
		}
		
	}
	
	
	public void givePort() {
		PortNode currentNode = p1.firstNode;
		if(currentNode.port>currentPort) {
			currentPort = currentNode.port;
		}else if(currentPort == 8106){
			currentPort = 8100;
		}else {
			currentNode = currentNode.next;
		}
	}
}