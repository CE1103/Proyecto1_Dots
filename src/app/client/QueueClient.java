package app.client;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.net.Socket;

import com.fasterxml.jackson.databind.ObjectMapper;

import app.communication.ClientCommunication;
import app.communication.JsonQueue;
import app.communication.Player;
import app.communication.Queue;
import app.communication.ServerAttributes;
import app.server.Game;

public class QueueClient implements Runnable{
	
	public static JsonQueue jsonQueue;
	public static int player;
	public static String linesCl;
	
	ScreensController myController;

	@Override
	public void run() {
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			System.out.println("hola");
			Socket clientSocket = new Socket("192.168.43.55", 7000);
			System.out.println("3");
			DataInputStream in = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
			System.out.println("2");
			String str = in.readUTF();
			System.out.println("1");
			jsonQueue = mapper.readValue(str, JsonQueue.class);
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(str));
//			
			if (jsonQueue.port == 8100) {
				player = 1;
				
				Player.turn = true;
			} else if (jsonQueue.port == 8101) {
				player = 2;	
				
				Player.turn = false;
			} else {
				player = 3;
				
				while(jsonQueue.port > 8101) {
					
					
					Queue q = new Queue();
					q.enqueue(jsonQueue.port);
					
					
//					q.showAll();
					break;
				}
			}
			
			linesCl = jsonQueue.linesJson;
			clientSocket.close();
			in.close();
			
			
		}catch(Exception e) {
			
		}
		
	}

}
