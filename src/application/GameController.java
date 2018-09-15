package application;


import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

import application.screenControllers.ControlledScreen;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import application.game.*;
import util.*;

public class GameController implements Initializable, ControlledScreen {

    ScreensController myController;
    int i = 0;
    
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
        Game.lines[i] = ((Line)event.getSource()).getId(); System.out.println(Game.lines[i] + i); i++;
        System.out.println(((Line)event.getSource()).getId());
        System.out.println(Arrays.toString(Game.lines));
        util.Util.sendToServer();
    }
}
