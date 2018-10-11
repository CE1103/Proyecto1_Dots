package app.client;

import java.net.URL;
import java.util.ResourceBundle;

import app.communication.ClientCommunication;
import app.communication.ServerAttributes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import util.ControlledScreen;

public class GameOverController implements Initializable, ControlledScreen{
	
    @FXML
    private Button playAgain;
    @FXML
    private Label scoreLoserPlayer,scoreWinnerPlayer;
    @FXML
    private Label loserPlayer, winnerPlayer;
    
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
    
    public void setFinalResults() {
    	
    	scoreLoserPlayer.setText(Integer.toString(GameOver.scoreLoserPlayer));
    	scoreWinnerPlayer.setText(Integer.toString(GameOver.scoreWinnerPlayer));
    	
    	loserPlayer.setText(GameOver.loserPlayer);
    	winnerPlayer.setText(GameOver.winnerPlayer);
    	
    }

}
