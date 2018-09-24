package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import app.communication.ServerCommunication;
import app.server.*;


public class SocketServer implements Runnable {
	
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private PrintStream out;
	private Scanner in;
	public static int port1, port2, port3, port4, port5, port6;
	
	public void setPort1(int port1) throws IOException {
		this.port1 = port1;
	}

	
	public void stop() throws IOException {
		
		out.close();
		clientSocket.close();
		serverSocket.close();
		
	}

	@Override
	public void run() {
		try {
			serverSocket = new ServerSocket(port1);
			clientSocket = serverSocket.accept();
			out = new PrintStream(clientSocket.getOutputStream());
			in = new Scanner(clientSocket.getInputStream());
			String inputLine;
			while (true) {
				System.out.println("holaserver");
				inputLine = in.nextLine();
				System.out.println("holaserver2");
				System.out.println(inputLine);
				System.out.println("holaserver3");
				out.println(ServerCommunication.jsonDataSend());
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
	

}
