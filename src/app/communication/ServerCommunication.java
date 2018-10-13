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
	public static Queue queue = new Queue();
	
	public static void jsonDataReceive() throws JsonGenerationException, JsonMappingException, IOException{
		/**
		 * Función que maneja los datos obtenidos del json que envían los clientes
		 * 
		 * <p>
		 * Recibe el json del cliente, revisa si se creó una figura y en ese caso se le agregan los puntos al jugador que la creó,
		 * luego modifica el json y lo prepara para el envío.
		 */
		
		ObjectMapper mapper = new ObjectMapper();
		server = mapper.readValue(SocketServer.jsonData, Server.class);
		client = mapper.readValue(SocketServer.jsonData, Client.class);
		if (Game.P1.getScore() < 20 && Game.P2.getScore() < 20) {
			String s = client.lines;
			Iterable<String> i = Splitter.on(",").trimResults(CharMatcher.WHITESPACE.or(CharMatcher.anyOf("[]"))).split(s);
			String[] lines = FluentIterable.from(i).toArray(String.class);
			String RL = client.lines;
			Iterable<String> i2 = Splitter.on(",").trimResults(CharMatcher.WHITESPACE.or(CharMatcher.anyOf("[]"))).split(RL);
			String[] recentLines = FluentIterable.from(i2).toArray(String.class);
			RecentLines = util.Util.CompareList(lines,recentLines);
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
				counter++;
				NodeList current = LN.firstPoint;
				PathList p1 = new PathList();
				while(current != null && current.pointNumber != null) {
					p1.addPathList(Main.m1.get(current.pointNumber));
					current = current.next;
				}
				Main.path = p1;
				PathThread pathTest = new PathThread(null,new PathList(),null,null);
				try {
					pathTest.startThread();
				} catch (InterruptedException e) {}
				
			}catch(NullPointerException e) {}
		} else {
			server.gameOn = false;
			client.gameOn = false;
		}
	}
	
	public static String jsonDataSend() throws JsonGenerationException, JsonMappingException, IOException{
		/**
		 * Función que retorna el json que se quiere enviar a los clientes.
		 */
			
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(server);
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(server));
			return json;
	}
	
	public static String jsonPortSend() throws JsonProcessingException {
		/**
		 * Función que retorna el json que se le quiere enviar a cada nuevo cliente que se une.
		 */
		ObjectMapper mapper = new ObjectMapper();
		JsonQueue jsonQueue = new JsonQueue();
		String json = mapper.writeValueAsString(jsonQueue);
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonQueue));
		queue.showAll();
		return json;
	}
	
	
}
