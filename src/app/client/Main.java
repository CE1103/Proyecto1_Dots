package app.client;

import java.util.HashMap;

import HashMapAndPath.PathList;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.List;
import util.Util;
import util.List;
import util.Util;


public class Main extends Application {
    
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
    public static PathList p1 = new PathList();
    
    @Override
    public void start(Stage primaryStage) {
        ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(Main.screen1ID, Main.screen1File);
        mainContainer.loadScreen(Main.screen2ID, Main.screen2File);
        mainContainer.loadScreen(Main.screen3ID, Main.screen3File);
        mainContainer.loadScreen(Main.screen4ID, Main.screen4File);
        
        mainContainer.setScreen(Main.screen1ID);
        String css = this.getClass().getResource("application.css").toExternalForm(); 
        mainContainer.getStylesheets().add(css);
        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        //primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
        l1 = util.Util.creteLinkedList();
        String [][] linkedListArray = Util.linkedListToArray();
        m1 = util.Util.createHashMap();
        System.out.println();
        p1.addPathList(m1.get("h1"));
        p1.addPathList(m1.get("v1"));
        p1.display();
        
    }
}