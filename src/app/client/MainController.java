package app.client;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Sockets.SocketClient;
import app.communication.ServerAttributes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import util.ControlledScreen;

public class MainController implements Initializable, ControlledScreen {

    @FXML
    private Button Jugar;
    @FXML
    private Button infoButton;
    @FXML
    private ImageView mainLogo;
    
    ScreensController myController;
    
    static Thread thread;
    SocketClient g;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @FXML
    private void goToScreen2(ActionEvent event) throws IOException, InterruptedException{      

    	if(QueueClient.jsonQueue.port > 8101) {
			myController.setScreen(ServerAttributes.screen6ID);
		}
    	
    	else {
    		myController.setScreen(ServerAttributes.screen4ID);
    		g = new SocketClient();
    		Thread t2 = new Thread(g);
    		g.setPort(QueueClient.jsonQueue.port);
    		
    		Thread threadReset = new Thread(new Runnable() {			

    		@Override
    		public void run() {
    			try {
    				resetThread();
    			} catch (InterruptedException e) {
    				e.printStackTrace();
    			}
    		}});
    		threadReset.start();
    		t2.start();
    	}
    	
		
		
    }
    
    public void resetThread() throws InterruptedException {
    	while(true) {
    		thread = new Thread(new Runnable(){
    			@Override
    			public void run() {
    				try {
    					g.timer();
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
    			}
    		});
    		Thread.sleep(500);
    	}
    }
    
    @FXML
    private void goToScreen3(ActionEvent event){
    	myController.setScreen(ServerAttributes.screen3ID);
    }
}
