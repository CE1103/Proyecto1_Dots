package app.client;

import java.net.URL;
import java.util.ResourceBundle;

import app.server.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import util.ControlledScreen;

public class InfoController implements Initializable, ControlledScreen {

    @FXML
    private Button backToPrincipal;
    
    ScreensController myController;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @FXML
    private void goToScreen1(ActionEvent event){
       myController.setScreen(Main.screen1ID);
    }
}
