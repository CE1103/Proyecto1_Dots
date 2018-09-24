package app.communication;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import app.client.*;
import util.Util;
import app.server.*;

public class ServerCommunication {
	
public static String jsonData() throws JsonGenerationException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		Server server = new Server(Arrays.toString(Game.lines));
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(server);
		return json;
	}
}
