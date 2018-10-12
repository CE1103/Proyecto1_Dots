package app.communication;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import app.client.*;
import util.Util;
import app.server.*;

public class ServerCommunication {
	
	public static String jsonDataServer;
	
//	public static void jsonDataReceive() throws JsonGenerationException, JsonMappingException, IOException{
//		
//		ObjectMapper mapper = new ObjectMapper();
//		Server server = mapper.readValue(jsonDataServer, Server.class);
//		jsonDataServer = mapper.writeValueAsString(server);
//	}
	
	public static String jsonDataSend() throws JsonGenerationException, JsonMappingException, IOException{
			
			ObjectMapper mapper = new ObjectMapper();
//			String lines = Arrays.toString(Main.linesStatic);
//			lines = Server.linesStatic;
//			System.out.println(lines);
			Server server = new Server();
			String json = mapper.writeValueAsString(server);
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(server));
			return json;
	}
	
	
}
