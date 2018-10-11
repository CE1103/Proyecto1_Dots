package app.communication;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.collect.FluentIterable;

import HashMapAndPath.PathList;
import HashMapAndPath.PathThread;
import Sockets.SocketServer;
import app.server.List;
import app.server.Main;
import app.server.NodeList;

public class ServerCommunication {
	
	public static Client client;
	public static Server server;
	public static int counter = -1;
	public static PathList temp1 = new PathList();
	public static String[] RecentLines = new String[161];
	
	public static void jsonDataReceive() throws JsonGenerationException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("error0.5");
		server = mapper.readValue(SocketServer.jsonData, Server.class);
		System.out.println("error1");
		client = mapper.readValue(SocketServer.jsonData, Client.class);
		System.out.println("error1.5");
		System.out.println("error2");
		if (Game.P1.getScore() < 50 && Game.P2.getScore() < 50) {
			String s = client.lines;
			Iterable<String> i = Splitter.on(",").trimResults(CharMatcher.WHITESPACE.or(CharMatcher.anyOf("[]"))).split(s);
			String[] lines = FluentIterable.from(i).toArray(String.class);
			String RL = client.lines;
			Iterable<String> i2 = Splitter.on(",").trimResults(CharMatcher.WHITESPACE.or(CharMatcher.anyOf("[]"))).split(RL);
			String[] recentLines = FluentIterable.from(i2).toArray(String.class);
			RecentLines = util.Util.CompareList(lines,recentLines);
			System.out.println("error3");
			try{
				List LN = new List();
	
				for (int n = (lines.length-1); n >= 0; n--) {
					String str = lines[n];
					if((!str.equals("null")) && counter != n) {
						LN.addPoint(lines[n]);
					}else {
						temp1.addPathList(Main.m1.get(lines[n])); 
					}
					
				}
				System.out.println("error4");
				counter++;
				NodeList current = LN.firstPoint;
				PathList p1 = new PathList();
				while(current != null && current.pointNumber != null) {
					p1.addPathList(Main.m1.get(current.pointNumber));
					current = current.next;
				}
				System.out.println("error5");
				Main.path = p1;
				PathThread pathTest = new PathThread(null,new PathList(),null,null);
				pathTest.startThread();
				
			}catch(NullPointerException e) {}
		} else {
			server.gameOn = false;
			client.gameOn = false;
		}
	}
	
	public static String jsonDataSend() throws JsonGenerationException, JsonMappingException, IOException{
			
			ObjectMapper mapper = new ObjectMapper();
//			server = mapper.readValue(SocketServer.jsonData, Server.class);
			String json = mapper.writeValueAsString(server);
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(server));
			return json;
	}
	
	public static String jsonPortSend() throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		JsonQueue jsonQueue = new JsonQueue();
		String json = mapper.writeValueAsString(jsonQueue);
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonQueue));
		return json;
	}
	
	
}
