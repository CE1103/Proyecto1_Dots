package app.server;

import java.io.IOException;

import Sockets.SocketServer;
import app.communication.QueueElements;

public class ClientThreads{
	
	public static int co = 0;
	
	public static void createClientThreads() throws IOException {
		
		 SocketServer h = new SocketServer();
	     Thread t1 = new Thread(h);
	     h.setPort1(8100);
	     t1.start();
	     
	     SocketServer s = new SocketServer();
	     Thread t2 = new Thread(s);
	     s.setPort1(8101);
	     t2.start();
	}

}
