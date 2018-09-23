package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient implements Runnable{
	
	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;
	private int port;
	
	public void setPort(int port) throws UnknownHostException, IOException {
		
		this.port = port;
		
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

	@Override
	public void run() {
		try {
		clientSocket = new Socket("127.0.0.1",port);
		out = new PrintWriter(clientSocket.getOutputStream());
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		String pedir = "h";
		Thread.sleep(500);
		while(true) {
			System.out.println("holaclient");
			out.println(pedir+"\n");
			System.out.println("holaclient2");
			System.out.println(in.readLine());
			System.out.println("holaclient3");
			System.out.println(pedir);
			break;
		}
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
