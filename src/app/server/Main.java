package app.server;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import HashMapAndPath.PathList;
import app.client.List;
import app.communication.Game;
import javafx.scene.Scene;


public class Main{
	
	public static String[] linesStatic = new String[161];
    
    public static String screen1ID = "main";
    public static String screen1File = "Screen1.fxml";
    public static String screen3ID = "screen3";
    public static String screen3File = "Screen3.fxml";
    public static String screen4ID = "screen4";
    public static String screen4File = "Screen4.fxml";
    public static String screen5ID = "gameOver";
    public static String screen5File = "GameOverScene.fxml";
    public static String screen6ID = "loadingGame";
    public static String screen6File = "LoadingGame.fxml";
    
    public static List l1;
    public static HashMap<String, HashMapAndPath.ListHashMap> m1;
    public static PathList path = new PathList();

	public static Scene scene4;

	
    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException { 
    	
    	l1 = app.client.List.createLinkedList();
        Game.linkedListToArray();
//        m1 = util.Util.createHashMap();
        System.out.println(Arrays.toString(linesStatic));
//        System.out.println(ServerCommunication.jsonDataSend());
//        System.out.println(ClientCommunication.jsonDataSend());
        
        
//        SocketServer h = new SocketServer();
        
//        Thread t1 = new Thread(h);
//        
//        h.setPort1(8081);
//        t1.start();
        
    }
    
}