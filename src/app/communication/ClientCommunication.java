package app.communication;

import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import app.server.Main;

public class ClientCommunication {
	
	public static String jsonDataClient;
	public static Client client;
	
	public static void jsonDataReceive() throws JsonGenerationException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		client = mapper.readValue(jsonDataClient, Client.class);
		
	}
	
	public static String jsonDataSend() throws JsonGenerationException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		Client c = new Client(client.lines);
		String json = mapper.writeValueAsString(c);
		return json;
	}

}
