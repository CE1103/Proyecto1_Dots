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
	public int port1;
	public static String jsonData;
	
	public void setPort1(int port1) throws IOException {
		this.port1 = port1;
	}
	
	public void stop() throws IOException {
		
		out.close();
		in.close();
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
				if (port1 == 8100) {
					if ((ClientThreads.co % 2) == 0) {
						inputLine = in.readUTF();
						jsonData = inputLine;
						ServerCommunication.jsonDataReceive();						
					}
				} else if (port1 == 8101) {
					if ((ClientThreads.co % 2) != 0) {
						inputLine = in.readUTF();
						jsonData = inputLine;
						ServerCommunication.jsonDataReceive();	
					}
				}
				System.out.println("holaserver");
				
				System.out.println(ServerCommunication.jsonDataSend());
				out.writeUTF(ServerCommunication.jsonDataSend());
				out.flush();
				ClientThreads.co++;
			}
		}catch (Exception e) {}
		
	}	

}
