package Sockets;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import app.communication.Game;
import app.communication.ServerCommunication;
import app.server.Main;
import app.server.Player;


public class SocketServer implements Runnable {
	
	ServerSocket serverSocket;
	ServerSocket serverSocket2;
	Socket clientSocket;
	Socket clientSocket2;	
	public int port1,port2;
	public static String jsonData;
	DataOutputStream out;
	DataInputStream in;
	DataOutputStream out2;
	DataInputStream in2;
	
	public void setPort1(int port1, int port2) throws IOException {
		
		this.port1 = port1;
		this.port2 = port2;
		
	}
	
	@Override
	public void run() {
		try {
			serverSocket = new ServerSocket(port1);
			serverSocket2 = new ServerSocket(port2);
			clientSocket = serverSocket.accept();
			clientSocket2 = serverSocket2.accept(); 
			out = new DataOutputStream(new BufferedOutputStream(clientSocket.getOutputStream()));;
			in = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
			out2 = new DataOutputStream(new BufferedOutputStream(clientSocket2.getOutputStream()));;
			in2 = new DataInputStream(new BufferedInputStream(clientSocket2.getInputStream()));
			ServerCommunication.queue.dequeue();
			ServerCommunication.queue.showAll();
			ServerCommunication.queue.dequeue();
			ServerCommunication.queue.showAll();
			String inputLine;
			while (true) {
				if(Game.P1.turn) {
					System.out.println("holaserver");
					
					inputLine = in.readUTF();
					System.out.println("holaserver2");
					jsonData = inputLine;
					System.out.println("P1");
					System.out.println("holaserver0.5");
					System.out.println(jsonData);
					ServerCommunication.jsonDataReceive();
					System.out.println("holaserver0.25");
					
				}else if(Game.P2.turn) {
					
					System.out.println("holaserver78");
					inputLine = in2.readUTF();
					System.out.println("holaserver79");
					jsonData = inputLine;
					System.out.println("P2");
					System.out.println(jsonData);
					ServerCommunication.jsonDataReceive();
					
				}
				
				Player.switchTurn();
				System.out.println("holaserver3");
				Main.linesStatic = ServerCommunication.RecentLines;
				ServerCommunication.server.turn = Game.P1.getTurn();
				ServerCommunication.server.scoreP1 = Game.P1.getScore();
				ServerCommunication.server.scoreP2 = Game.P2.getScore();
				System.out.println("P1 = " + Game.P1.getScore());
				System.out.println("P2 = " + Game.P2.getScore());
				System.out.println("holaserver4");
				out.writeUTF(ServerCommunication.jsonDataSend());
				System.out.println("holaserver5");
				ServerCommunication.server.turn = Game.P2.getTurn();
				System.out.println("holaserver6");
				out2.writeUTF(ServerCommunication.jsonDataSend());
				System.out.println("holaserver7");
				out.flush();
				out2.flush();
				System.out.println("holaserver8");
			}
		}catch (Exception e) {
			
		}
		
	}	
	
	
	

}
