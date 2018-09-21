package app.client;


import java.net.URL;
import java.util.Arrays;
import java.util.ArrayList.*;
import java.util.ResourceBundle;

import app.server.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import util.*;

public class GameController implements Initializable, ControlledScreen {
	
    @FXML
    private Label labelP1, labelP2, alert;
    @FXML
    private Circle p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16;
    @FXML
    private Line h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11,h12;
    @FXML
    private Line v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12;
    
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
    		labelP1.setText(Integer.toString(g1.P1.getScore()) + " pts");
    		labelP2.setText(Integer.toString(g1.P2.getScore()) + " pts");
        
    		Game.lines[i] = ((Line)event.getSource()).getId(); 
    		//System.out.println(Game.lines[i] + i); 
    		i++;
    		//System.out.println(((Line)event.getSource()).getId());
    		System.out.println(Arrays.toString(Game.lines));
    		System.out.println(Arrays.toString(Game.dots));
    		app.communication.Server_com.sendToClient();
    	}else {
    		alert.setText("Linea Anteriormente Presionada");
    		alert.setStyle("-fx-text-fill: #95F4F1");
    		System.out.println("Line pressed");
    	}
    }
}