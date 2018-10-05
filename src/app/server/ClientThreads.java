package app.server;

import java.io.IOException;

import Sockets.SocketServer;

public class ClientThreads{
	
	public static int co = 0;
	
	public static void createClientThreads() throws IOException {
		
		 SocketServer h = new SocketServer();
	     Thread t1 = new Thread(h);
	     h.setPort1(8100,8101);
	     t1.start();
	     
	}

}
