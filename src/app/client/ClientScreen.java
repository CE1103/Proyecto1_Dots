package app.client;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.HashMap;

import app.communication.ServerAttributes;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
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
	
	public static HashMap<String, Line> createHashMap(){
		HashMap<String, Line> m1 = new HashMap<>();
		
		m1.put("h1", GameController.h1);
		m1.put("h2", GameController.h2);
		m1.put("h3", GameController.h3);
		m1.put("h4", GameController.h4);
		m1.put("h5", GameController.h5);
		m1.put("h6", GameController.h6);
		m1.put("h7", GameController.h7);
		m1.put("h8", GameController.h8);
		m1.put("h9", GameController.h9);
		m1.put("h10", GameController.h10);
		m1.put("h11", GameController.h11);
		m1.put("h12", GameController.h12);		
		m1.put("h13", GameController.h13);
		m1.put("h14", GameController.h14);
		m1.put("h15", GameController.h15);
		m1.put("h16", GameController.h16);
		m1.put("h17", GameController.h17);
		m1.put("h18", GameController.h18);
		m1.put("h19", GameController.h19);
		m1.put("h20", GameController.h20);
		m1.put("h21", GameController.h21);
		m1.put("h22", GameController.h22);
		m1.put("h23", GameController.h23);
		m1.put("h24", GameController.h24);
		m1.put("h25", GameController.h25);
		m1.put("h26", GameController.h26);
		m1.put("h27", GameController.h27);
		m1.put("h28", GameController.h28);
		m1.put("h29", GameController.h29);
		m1.put("h30", GameController.h30);
		m1.put("h31", GameController.h31);
		m1.put("h32", GameController.h32);
		m1.put("h33", GameController.h33);
		m1.put("h34", GameController.h34);
		m1.put("h35", GameController.h35);
		m1.put("h36", GameController.h36);		
		m1.put("h37", GameController.h37);
		m1.put("h38", GameController.h38);
		m1.put("h39", GameController.h39);
		m1.put("h40", GameController.h40);
		m1.put("h41", GameController.h41);
		m1.put("h42", GameController.h42);
		m1.put("h43", GameController.h43);
		m1.put("h44", GameController.h44);
		m1.put("h45", GameController.h45);
		m1.put("h46", GameController.h46);
		m1.put("h47", GameController.h47);
		m1.put("h48", GameController.h48);
		m1.put("h49", GameController.h49);
		m1.put("h50", GameController.h50);
		m1.put("h51", GameController.h51);
		m1.put("h52", GameController.h52);
		m1.put("h53", GameController.h53);
		m1.put("h54", GameController.h54);
		m1.put("h55", GameController.h55);
		m1.put("h56", GameController.h56);
		
		
		m1.put("v1", GameController.v1);
		m1.put("v2", GameController.v2);
		m1.put("v3", GameController.v3);
		m1.put("v4", GameController.v4);
		m1.put("v5", GameController.v5);
		m1.put("v6", GameController.v6);
		m1.put("v7", GameController.v7);
		m1.put("v8", GameController.v8);
		m1.put("v9", GameController.v9);
		m1.put("v10", GameController.v10);
		m1.put("v11", GameController.v11);
		m1.put("v12", GameController.v12);
		m1.put("v13", GameController.v13);
		m1.put("v14", GameController.v14);
		m1.put("v15", GameController.v15);
		m1.put("v16", GameController.v16);
		m1.put("v17", GameController.v17);
		m1.put("v18", GameController.v18);
		m1.put("v19", GameController.v19);
		m1.put("v20", GameController.v20);
		m1.put("v21", GameController.v21);
		m1.put("v22", GameController.v22);
		m1.put("v23", GameController.v23);
		m1.put("v24", GameController.v24);
		m1.put("v25", GameController.v25);
		m1.put("v26", GameController.v26);
		m1.put("v27", GameController.v27);
		m1.put("v28", GameController.v28);
		m1.put("v29", GameController.v29);
		m1.put("v30", GameController.v30);
		m1.put("v31", GameController.v31);
		m1.put("v32", GameController.v32);
		m1.put("v33", GameController.v33);
		m1.put("v34", GameController.v34);
		m1.put("v35", GameController.v35);
		m1.put("v36", GameController.v36);
		m1.put("v37", GameController.v37);
		m1.put("v38", GameController.v38);
		m1.put("v39", GameController.v39);
		m1.put("v40", GameController.v40);
		m1.put("v41", GameController.v41);
		m1.put("v42", GameController.v42);
		m1.put("v43", GameController.v43);
		m1.put("v44", GameController.v44);
		m1.put("v45", GameController.v45);
		m1.put("v46", GameController.v46);
		m1.put("v47", GameController.v47);
		m1.put("v48", GameController.v48);
		m1.put("v49", GameController.v49);
		m1.put("v50", GameController.v50);
		m1.put("v51", GameController.v51);
		m1.put("v52", GameController.v52);
		m1.put("v53", GameController.v53);
		m1.put("v54", GameController.v54);
		m1.put("v55", GameController.v55);
		m1.put("v56", GameController.v56);
		
		
		m1.put("d1", GameController.d1);
		m1.put("d2", GameController.d2);
		m1.put("d3", GameController.d3);
		m1.put("d4", GameController.d4);
		m1.put("d5", GameController.d5);
		m1.put("d6", GameController.d6);
		m1.put("d7", GameController.d7);
		m1.put("d8", GameController.d8);
		m1.put("d9", GameController.d9);
		m1.put("d10", GameController.d10);
		m1.put("d11", GameController.d11);
		m1.put("d12", GameController.d12);
		m1.put("d13", GameController.d13);
		m1.put("d14", GameController.d14);
		m1.put("d15", GameController.d15);
		m1.put("d16", GameController.d16);
		m1.put("d17", GameController.d17);
		m1.put("d18", GameController.d18);
		m1.put("d19", GameController.d19);
		m1.put("d20", GameController.d20);
		m1.put("d21", GameController.d21);
		m1.put("d22", GameController.d22);
		m1.put("d23", GameController.d23);
		m1.put("d24", GameController.d24);
		m1.put("d25", GameController.d25);
		m1.put("d26", GameController.d26);
		m1.put("d27", GameController.d27);
		m1.put("d28", GameController.d28);
		m1.put("d29", GameController.d29);
		m1.put("d30", GameController.d30);
		m1.put("d31", GameController.d31);
		m1.put("d32", GameController.d32);
		m1.put("d33", GameController.d33);
		m1.put("d34", GameController.d34);
		m1.put("d35", GameController.d35);
		m1.put("d36", GameController.d36);
		m1.put("d37", GameController.d37);
		m1.put("d38", GameController.d38);
		m1.put("d39", GameController.d39);
		m1.put("d40", GameController.d40);
		m1.put("d41", GameController.d41);
		m1.put("d42", GameController.d42);
		m1.put("d43", GameController.d43);
		m1.put("d44", GameController.d44);
		m1.put("d45", GameController.d45);
		m1.put("d46", GameController.d46);
		m1.put("d47", GameController.d47);
		m1.put("d48", GameController.d48);
		m1.put("d49", GameController.d49);

		return m1;
	}

}
