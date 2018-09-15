package util;

import com.fasterxml.jackson.core.*;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import application.game.*;

public class Util {
	
	public static void sendToServer() throws JsonGenerationException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		Client client = new Client(Game.lines.toString());
		String jsonInString = mapper.writeValueAsString(client);
		System.out.println(jsonInString);
	}

}
