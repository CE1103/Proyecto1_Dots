package app.client;

import java.io.IOException;
import java.net.UnknownHostException;

import Sockets.SocketClient;
import app.server.Main;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientScreen extends Application {
	
	@Override
    public void start(Stage primaryStage) {

        ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(Main.screen1ID, Main.screen1File);
        mainContainer.loadScreen(Main.screen3ID, Main.screen3File);
        mainContainer.loadScreen(Main.screen4ID, Main.screen4File);
        mainContainer.loadScreen(Main.screen5ID, Main.screen5File);
        mainContainer.loadScreen(Main.screen6ID, Main.screen6File);
        
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
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
        Thread t = new Thread(new QueueClient());
        t.start();
        launch(args);
	}

}
