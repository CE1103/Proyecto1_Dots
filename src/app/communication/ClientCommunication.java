package app.communication;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
<<<<<<< HEAD
=======
import com.fasterxml.jackson.databind.SerializationFeature;

import app.client.QueueClient;
>>>>>>> branch '8x8_Merge' of https://github.com/CE1103/Proyecto1_Dots.git

public class ClientCommunication {
	
	public static String jsonDataClient;
	public static Client client;
	
//	public static void jsonDataReceive() throws JsonGenerationException, JsonMappingException, IOException{
//		
//		ObjectMapper mapper = new ObjectMapper();
//		client = mapper.readValue(jsonDataClient, Client.class);
//		
//	}
	
	public static String jsonDataSend() throws JsonGenerationException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		Client c = new Client();
		String json = mapper.writeValueAsString(c);
		return json;
	}
}
