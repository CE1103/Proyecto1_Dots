package app.client;


import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList.*;
import java.util.ResourceBundle;

import app.server.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import util.*;

public class GameController implements Initializable, ControlledScreen {
	
	@FXML
    private Label labelP1, labelP2, alert;
    @FXML
    private static Line h1;
	@FXML
	private Line h2;
	@FXML
	private Line h3;
	@FXML
	private Line h4;
	@FXML
	private Line h5;
	@FXML
	private Line h6;
	@FXML
	private Line h7;
	@FXML
	private Line h8;
	@FXML
	private Line h9;
	@FXML
	private Line h10;
	@FXML
	private Line h11;
	@FXML
	private Line h12;
    @FXML
    private Line v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12;
    @FXML
    private static Rectangle s1;
    
    
    ScreensController myController;
    public int i = 0;
    static boolean response = false;
    
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
    		app.communication.Client_com.sendToServer();
    		
    		
    		System.out.println(isInside(Game.lines,((Line)event.getSource())));
    		
    		
    	}
    	else {
    		alert.setText("Linea Anteriormente Presionada");
    		alert.setStyle("-fx-text-fill: #95F4F1");
    		System.out.println("Line pressed");
    	}
    }
	
	public static boolean isInside(String[] lines, Line line) {
		
		for(int a = 0; a < lines.length-1; a++) {
			if(lines[a] == line.getId()) {
				response = true;
				s1.setStroke(Color.web("#95F4F1"));
			}
		}
		return response;
		
		
	}
}