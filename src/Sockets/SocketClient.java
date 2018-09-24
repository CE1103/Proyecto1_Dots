package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient implements Runnable{
	
	private Socket clientSocket;
	private PrintStream out;
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
		
		out.close();
		clientSocket.close();
		
	}

	@Override
	public void run() {
		try {
		clientSocket = new Socket("127.0.0.1",port);
		out = new PrintStream(clientSocket.getOutputStream());
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		String pedir = "pedir server";
		Thread.sleep(500);
		while(true) {
			System.out.println("holaclient");
			out.println(pedir);
			System.out.println("holaclient2");
			System.out.println(in.readLine());
			System.out.println("holaclient3");
		}
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
