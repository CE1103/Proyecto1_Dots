package app.communication;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class QueueThread implements Runnable{

	@Override
	public void run() {
		/**
		 * Funci�n que ejecuta el thread de la cola de jugadores. Esta siempre est� funcionando y buscando conexiones entrantes.
		 */
		try {
			ServerSocket serverSocketQueue = new ServerSocket(7000);			
			while(true) {
				Socket clientSocketQueue = serverSocketQueue.accept();
				DataOutputStream outqueue = new DataOutputStream(new BufferedOutputStream(clientSocketQueue.getOutputStream()));
				outqueue.writeUTF(ServerCommunication.jsonPortSend());
				outqueue.flush();
				
				clientSocketQueue.close();
			}
		}catch (Exception e) {

		}
	}

}

