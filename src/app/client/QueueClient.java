package app.client;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.net.Socket;

import com.fasterxml.jackson.databind.ObjectMapper;

import app.communication.JsonQueue;

public class QueueClient implements Runnable{
	
	public static JsonQueue jsonQueue;
	public static int player;

	@Override
	public void run() {
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			Socket clientSocket = new Socket("127.0.0.1", 7000);
			DataInputStream in = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
			String str = in.readUTF();
			jsonQueue = mapper.readValue(str, JsonQueue.class);
			if (jsonQueue.port == 8100) {
				player = 1;
			} else if (jsonQueue.port == 8101) {
				player = 2;								
			} else {
				player = 3;
			}
			clientSocket.close();
			in.close();
			
			
		}catch(Exception e) {
			
		}
		
	}

}
