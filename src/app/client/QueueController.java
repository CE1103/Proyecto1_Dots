package app.client;

import java.net.URL;
import java.util.ResourceBundle;

import app.communication.ServerAttributes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import util.ControlledScreen;

public class QueueController implements Initializable, ControlledScreen{
	
    @FXML
    private Button backToPrincipal;
    
    ScreensController myController;

	@Override
	public void setScreenParent(ScreensController screenPage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
    @FXML
    private void goToScreen1(ActionEvent event){
       myController.setScreen(ServerAttributes.screen1ID);
    }

}
