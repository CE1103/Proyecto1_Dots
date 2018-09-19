package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import app.server.*;


public class SocketServer {
	
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;
	private static int port1, port2, port3, port4, port5, port6;
	
	
	public void start(int port) throws IOException {
		
		serverSocket = new ServerSocket(port);
		clientSocket = serverSocket.accept();
		out = new PrintWriter(clientSocket.getOutputStream());
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			if (Game.lines[-1] != null) {
				stop();
				break;
			}
			out.println(app.communication.ServerCommunication.jsonData());
			break;
			
		}
		
	}
	
	public void stop() throws IOException {
		
		in.close();
		out.close();
		clientSocket.close();
		serverSocket.close();
		
	}
	

}
