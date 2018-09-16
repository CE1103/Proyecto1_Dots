package util;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import application.game.Game;

public class Client_com {
	
public static void sendToServer() throws JsonGenerationException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		Client client = new Client(Arrays.toString(Game.lines));
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		String json = mapper.writeValueAsString(client);
		System.out.println(json);
		InetAddress host = InetAddress.getLocalHost();
	}
	
	

}
