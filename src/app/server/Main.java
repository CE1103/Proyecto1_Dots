package app.server;

import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import app.client.ScreensController;
import app.communication.ServerCommunication;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.*;


public class Main{
    
    public static String screen1ID = "main";
    public static String screen1File = "Screen1.fxml";
    public static String screen2ID = "screen2";
    public static String screen2File = "Screen2.fxml";
    public static String screen3ID = "screen3";
    public static String screen3File = "Screen3.fxml";
    public static List l1;

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException { 

    	l1 = app.server.List.createLinkedList();
        Game.linkedListToArray();
        System.out.println(ServerCommunication.jsonData());
        
    }
}