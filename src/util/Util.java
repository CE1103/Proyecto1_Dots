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
import javafx.scene.shape.Line;

public class Util {
	
	public static void sendToServer() throws JsonGenerationException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		Client client = new Client(Arrays.toString(Game.lines));
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		String json = mapper.writeValueAsString(client);
		System.out.println(json);
	}
	
	public static List creteLinkedList() {
		int p = 0;
		int q = 4;
		List matrix = new List();
		for(int i = 0; i < 4; i++) {
			List list = new List();
			for(int j = 0; j < 4; j++) {
				list.addPoint("p" + Integer.toString((4*q)-p)); p++;
			}
			q--;
			p=0;
			matrix.addNode(list);
		}
		matrix.displaypoint();
		return matrix;
	}
<<<<<<< HEAD

=======
	
>>>>>>> 1fdd0a6d6cf76b99bf894460a4571fe53d5f12ec
}
