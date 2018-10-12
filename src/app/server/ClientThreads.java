package app.server;

import java.io.IOException;

import Sockets.SocketServer;

public class ClientThreads{
	
	public static int co = 0;
	
	public static void createClientThreads() throws IOException {
		/**
		 * Función que crea los hilos de los dos clientes que van a entrar al juego.
		 */
		
		 SocketServer h = new SocketServer();
	     Thread t1 = new Thread(h);
	     h.setPort1(8100,8101);
	     t1.start();
	     
	}

}
