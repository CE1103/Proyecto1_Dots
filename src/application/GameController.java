package application;


import java.net.URL;
import java.util.ResourceBundle;

import application.screenControllers.ControlledScreen;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;

public class GameController implements Initializable, ControlledScreen {

    ScreensController myController;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    public void onMouseClick(MouseEvent event) throws Exception {
        System.out.println("This line id is - " + ((Line)event.getSource()).getId());
        ((Line)event.getSource()).setStroke(Color.BLUE);
        
        
    }
}
