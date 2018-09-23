package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
<<<<<<< HEAD
import java.util.Scanner;

import app.communication.Server_com;
=======
import app.server.*;
>>>>>>> refs/heads/Client_Screens


public class SocketServer implements Runnable {
	
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;
	public static int port1, port2, port3, port4, port5, port6;
	
	
<<<<<<< HEAD
	public void setPort1(int port1) throws IOException {
		this.port1 = port1;
=======
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
>>>>>>> refs/heads/Client_Screens
		
	}
	
	public void stop() throws IOException {
		
		in.close();
		out.close();
		clientSocket.close();
		serverSocket.close();
		
	}

	@Override
	public void run() {
		try {
		serverSocket = new ServerSocket(port1);
		clientSocket = serverSocket.accept();
		out = new PrintWriter(clientSocket.getOutputStream());
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		InputStream inputLine;
		while (true) {
			System.out.println("holaserver");
			inputLine = clientSocket.getInputStream();
			System.out.println("holaserver2");
			System.out.println();
			System.out.println("holaserver3");
			out.println(Server_com.sendToClient());
			break;
			
		}
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
	

}
