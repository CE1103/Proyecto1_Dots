package app.communication;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.base.*;
import com.google.common.collect.FluentIterable;

import HashMapAndPath.NodeLinesPath;
import HashMapAndPath.Path;
import HashMapAndPath.PathList;
import HashMapAndPath.PathThread;
import Sockets.SocketServer;
import app.client.*;
import util.Util;
import app.server.*;
import app.communication.*;

public class ServerCommunication {
	
	public static Client client;
	public static Server server;
	
	public static void jsonDataReceive() throws JsonGenerationException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		client = mapper.readValue(SocketServer.jsonData, Client.class);
		String s = client.lines;
		Iterable<String> i = Splitter.on(",").trimResults(CharMatcher.WHITESPACE.or(CharMatcher.anyOf("[]"))).split(s);
		String[] lines = FluentIterable.from(i).toArray(String.class);
		System.out.println("\n\n lines \n\n");
		System.out.println(Arrays.toString(lines));
		try{
			List LN = new List();
			for (int n = (lines.length-1); n >= 0; n--) {
				String str = lines[n];
				if(!str.equals("null")) {
					System.out.println(lines[n]);
					LN.addPoint(lines[n]);
				}
				
			}
			NodeList current = LN.firstPoint;
			PathList p1 = new PathList();
			while(current != null) {
				p1.addPathList(Main.m1.get(current.pointNumber));
				Main.m1.get(current.pointNumber).display();
				current = current.next;
			}
		
			Main.path = p1;
			PathThread pathTest = new PathThread(null,null,null);
			pathTest.startThread();
			
		}catch(NullPointerException e) {
			System.out.println(e);
		}
	}
	
	public static String jsonDataSend() throws JsonGenerationException, JsonMappingException, IOException{
			
			ObjectMapper mapper = new ObjectMapper();
			server = mapper.readValue(SocketServer.jsonData, Server.class);
			String json = mapper.writeValueAsString(server);
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(server));
			return json;
	}
	
	
}
