package Sockets;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.collect.FluentIterable;

import app.client.GameController;
import app.communication.Client;
import app.communication.ClientCommunication;
import app.communication.Player;
import app.communication.ServerAttributes;

public class SocketClient implements Runnable{
	
	private Socket clientSocket;
	private DataOutputStream out;
	private DataInputStream in;
	private int port;
	
	public void setPort(int port) throws UnknownHostException, IOException {
		
		this.port = port;
		
	}
	
	public void timer() throws InterruptedException {
		synchronized(this) {
			Thread.sleep(1000);
			notify();
		}
	}
	
	public void stopConnection() throws IOException {
		
		out.close();
		clientSocket.close();
		
	}

	@Override
	public void run() {
		synchronized (this){
			try {
				ObjectMapper mapper = new ObjectMapper();
				clientSocket = new Socket("192.168.1.116", port);
				out = new DataOutputStream(new BufferedOutputStream(clientSocket.getOutputStream()));;
				in = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
				Thread.sleep(500);
				String str;
				while(true) {
					Thread.sleep(1000);
					
					if(Player.turn) {
						out.writeUTF(ClientCommunication.jsonDataSend());
						out.flush();
					}
					
					Player.switchTurn();
				

					Thread.sleep(500);
					str = in.readUTF();		


					ClientCommunication.client = mapper.readValue(str, Client.class);
					System.out.println(str);
					Player.turn = ClientCommunication.client.turn;
					System.out.println(ClientCommunication.jsonDataSend());

					if (Player.turn) {
					    String linesString = ClientCommunication.client.lines;
						Iterable<String> i = Splitter.on(",").trimResults(CharMatcher.WHITESPACE.or(CharMatcher.anyOf("[]"))).split(linesString);
						ServerAttributes.linesStatic = FluentIterable.from(i).toArray(String.class);
						wait();
					} else {
						GameController.x++;
					}
				}	
			}catch(Exception e) {}
		}
		
	}
}