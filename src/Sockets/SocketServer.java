package Sockets;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
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
	private DataOutputStream out;
	private DataInputStream in;
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
			out = new DataOutputStream(new BufferedOutputStream(clientSocket.getOutputStream()));;
			in = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
			String inputLine;
			while (true) {
				System.out.println("holaserver");
				inputLine = in.readUTF();
				System.out.println("holaserver2");
				System.out.println(inputLine);
				System.out.println("holaserver3");
				out.writeUTF(ServerCommunication.jsonDataSend());
				out.flush();
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
	

}
