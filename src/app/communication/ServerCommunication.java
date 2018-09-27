package app.communication;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

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
	}
	
	public static String jsonDataSend() throws JsonGenerationException, JsonMappingException, IOException{
			
			ObjectMapper mapper = new ObjectMapper();
			server = mapper.readValue(SocketServer.jsonData, Server.class);
			String json = mapper.writeValueAsString(server);
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(server));
			return json;
	}
	
	
}
