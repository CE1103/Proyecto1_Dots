package app.communication;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
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
	public static int contador = -1;
	public static PathList temp1 = new PathList();
	
	public static void jsonDataReceive() throws JsonGenerationException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		client = mapper.readValue(SocketServer.jsonData, Client.class);
		String s = client.lines;
		Iterable<String> i = Splitter.on(",").trimResults(CharMatcher.WHITESPACE.or(CharMatcher.anyOf("[]"))).split(s);
		String[] lines = FluentIterable.from(i).toArray(String.class);
		try{
			List LN = new List();

			for (int n = (lines.length-1); n >= 0; n--) {
				String str = lines[n];
				if((!str.equals("null")) && contador != n) {
					LN.addPoint(lines[n]);
				}else {
					temp1.addPathList(Main.m1.get(lines[n])); 
				}
				
			}
			contador++;
			NodeList current = LN.firstPoint;
			PathList p1 = new PathList();
			while(current != null && current.pointNumber != null) {
				p1.addPathList(Main.m1.get(current.pointNumber));
				current = current.next;
			}
			Main.path = p1;
			PathThread pathTest = new PathThread(null,new PathList(),null,null);
			pathTest.startThread();
			
		}catch(NullPointerException e) {}
	}
	
	public static String jsonDataSend() throws JsonGenerationException, JsonMappingException, IOException{
			
			ObjectMapper mapper = new ObjectMapper();
			server = mapper.readValue(SocketServer.jsonData, Server.class);
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
