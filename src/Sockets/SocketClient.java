package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

import app.communication.Client;
import app.communication.ClientCommunication;

public class SocketClient implements Runnable{
	
	private Socket clientSocket;
	private PrintStream out;
	private Scanner in;
	private int port;
	
	public void setPort(int port) throws UnknownHostException, IOException {
		
		this.port = port;
		
	}
	
	public String sendMessage(String msg) throws IOException {
		
		out.println(msg);
		String resp = in.nextLine();
		return resp;
		
	}
	
	public void stopConnection() throws IOException {
		
		out.close();
		clientSocket.close();
		
	}

	@Override
	public void run() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			clientSocket = new Socket("127.0.0.1", port);
			out = new PrintStream(clientSocket.getOutputStream());
			in = new Scanner(clientSocket.getInputStream());
//			String pedir = "pedir server";
			Thread.sleep(500);
			String str;
			while(true) {
				System.out.println("holaclient");
				out.println(ClientCommunication.jsonDataSend());
				Thread.sleep(500);
				System.out.println("holaclient2");
				str = in.nextLine();
				Client client = mapper.readValue(str, Client.class);
				System.out.println("holaclient6");
				System.out.println(str);
				System.out.println(ClientCommunication.jsonDataSend());
				System.out.println("holaclient3");
		}
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
