package app.communication;

import Sockets.SocketServer;
import util.PortList;

public class QueueElements extends Queue{
	
	PortList p1 = new PortList();
	
	public void Elements() {
		
		for(int i = 8100; i < 8107; i++) {
			p1.addPortList(i);
		}
		
		while (true) {
			
			
		}
		
	}
}
