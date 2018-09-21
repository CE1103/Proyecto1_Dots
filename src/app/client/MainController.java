package app.client;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import util.ControlledScreen;
import Sockets.SocketClient;
import Sockets.SocketServer;

public class MainController implements Initializable, ControlledScreen {

    @FXML
    private Button Jugar;
    @FXML
    private Button infoButton;
    @FXML
    private ImageView mainLogo;
    
    ScreensController myController;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @FXML
    private void goToScreen2(ActionEvent event) throws IOException{
       SocketServer h = new SocketServer();
       SocketClient g = new SocketClient();
       Thread t1 = new Thread(h);
       Thread t2 = new Thread(g);
       h.setPort1(8081);
       g.setPort(8081);
       t1.start();
       t2.start();
       
       
       myController.setScreen(Main.screen2ID);
    }
    @FXML
    private void goToScreen3(ActionEvent event){
       myController.setScreen(Main.screen3ID);
    }
}
