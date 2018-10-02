package app.client;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.net.Socket;

public class QueueClient implements Runnable{

	@Override
	public void run() {
		try {
			
			Socket clientSocket = new Socket("127.0.0.1", 7000);
			DataInputStream in = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
			
			clientSocket.close();
			in.close();
			
			
		}catch(Exception e) {
			
		}
		
	}

}
