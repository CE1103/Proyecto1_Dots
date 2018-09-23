package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import app.communication.ServerCommunication;
import app.server.*;


public class SocketServer implements Runnable {
	
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;
	public static int port1, port2, port3, port4, port5, port6;
	
	public void setPort1(int port1) throws IOException {
		this.port1 = port1;
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
				out.println(ServerCommunication.jsonData());
				break;
				
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
	

}
