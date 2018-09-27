package app.server;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import app.server.ScoreTracker;
import HashMapAndPath.PathList;
import Sockets.SocketClient;
import Sockets.SocketServer;
import app.client.ScreensController;
import app.communication.ClientCommunication;
import app.communication.Game;
import app.communication.Queue;
import app.communication.QueueElements;
import app.communication.ServerCommunication;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.*;


public class Main{
	
	public static String[] linesStatic = new String[161];
    
    public static String screen1ID = "main";
    public static String screen1File = "Screen1.fxml";
    public static String screen2ID = "screen2";
    public static String screen2File = "Screen2.fxml";
    public static String screen3ID = "screen3";
    public static String screen3File = "Screen3.fxml";
    public static String screen4ID = "screen4";
    public static String screen4File = "Screen4.fxml";
    public static List l1;
    public static HashMap<String, HashMapAndPath.ListHashMap> m1;
    public static PathList path = new PathList();

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException { 
    	
    	l1 = app.server.List.createLinkedList();
        Game.linkedListToArray();
        m1 = util.Util.createHashMap();
        System.out.println(Arrays.toString(linesStatic));
//        System.out.println(ServerCommunication.jsonDataSend());
//        System.out.println(ClientCommunication.jsonDataSend());
        
        
        SocketServer h = new SocketServer();
        
        
        QueueElements queue = new QueueElements();
        queue.Elements();
        queue.showAll();
        System.out.println("");
        queue.dequeue();
        queue.showAll();
        
        
        Thread t1 = new Thread(h);
        
        h.setPort1(8081);
        t1.start();
        
    }
    
}