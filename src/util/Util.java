package util;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;

import app.client.Game;
import app.communication.Client;
import app.server.*;

public class Util {
	
	public static void sendToServer() throws JsonGenerationException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		Client client = new Client(Arrays.toString(Game.lines));
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		String json = mapper.writeValueAsString(client);
		System.out.println(json);
	}

}
