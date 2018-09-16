package app.client;


import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

import com.sun.prism.paint.Color;

import app.server.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
import util.*;

public class GameController implements Initializable, ControlledScreen {
	
    @FXML
    private Label labelP1;
    @FXML
    private Label labelP2;
    @FXML
    private Label alert;
    
    ScreensController myController;
    public int i = 0;
    
    Game g1 = new Game();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    public void onMouseClick(MouseEvent event) throws Exception {
    	boolean a = true;
    	for(int c=0;c<24;c++) {
    		
    		if(((Line)event.getSource()).getId()==Game.lines[c]) {
    			a = false;
    		}    		
    	}
    	if(a) {
    		System.out.println("This line id is - " + ((Line)event.getSource()).getId());
    		alert.setText(" ");
    		g1.setPoints(event);
    		labelP1.setText(Integer.toString(g1.p1.getScore()) + " pts");
    		labelP2.setText(Integer.toString(g1.p2.getScore()) + " pts");
    		Game.lines[i] = ((Line)event.getSource()).getId(); System.out.println(Game.lines[i] + i); i++;
    		System.out.println(((Line)event.getSource()).getId());
    		System.out.println(Arrays.toString(Game.lines));
    		util.Util.sendToServer();
    	}else {
    		alert.setText("Linea Presionada");
    		alert.setStyle("-fx-text-fill: #FF0000");
    		System.out.println("Existe");
    	}
    }
}