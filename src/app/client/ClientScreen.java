package app.client;

import java.io.IOException;
import java.net.UnknownHostException;

import Sockets.SocketClient;
import app.communication.ServerAttributes;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientScreen extends Application {
	
	@Override
    public void start(Stage primaryStage) {

        ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(ServerAttributes.screen1ID, ServerAttributes.screen1File);
        mainContainer.loadScreen(ServerAttributes.screen3ID, ServerAttributes.screen3File);
        mainContainer.loadScreen(ServerAttributes.screen4ID, ServerAttributes.screen4File);
        mainContainer.loadScreen(ServerAttributes.screen5ID, ServerAttributes.screen5File);
        mainContainer.loadScreen(ServerAttributes.screen6ID, ServerAttributes.screen6File);
        
        mainContainer.setScreen(ServerAttributes.screen1ID);
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
