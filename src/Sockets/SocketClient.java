package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	
	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;
	
	public void startConnection(int port) throws UnknownHostException, IOException {
		
		clientSocket = new Socket("172.18.58.87",port);
		out = new PrintWriter(clientSocket.getOutputStream());
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
	}
	
	public String sendMessage(String msg) throws IOException {
		
		out.println(msg);
		String resp = in.readLine();
		return resp;
		
	}
	
	public void stopConnection() throws IOException {
		
		in.close();
		out.close();
		clientSocket.close();
		
	}

}
