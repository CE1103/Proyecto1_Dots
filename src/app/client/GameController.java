package app.client;


import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ResourceBundle;
import util.Util;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import util.*;
import HashMapAndPath.*;

public class GameController implements Initializable, ControlledScreen {
	
    @FXML
    private Label labelP1, labelP2, alert;
    @FXML
    private Circle p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50, p51, p52, p53, p54, p55, p56, p57, p58, p59, p60, p61, p62, p63, p64;
    @FXML
    private Line h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11, h12, h13, h14, h15, h16, h17, h18, h19, h20, h21, h22, h23, h24, h25, h26, h27, h28, h29, h30, h31, h32, h33, h34, h35, h36, h37, h38, h39, h40, h41, h42, h43, h44, h45, h46, h47, h48, h49, h50, h51, h52, h53, h54, h55, h56;
    @FXML
    private Line v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, v29, v30, v31, v32, v33, v34, v35, v36, v37, v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, v49, v50, v51, v52, v53, v54, v55, v56;
    @FXML
    private Line d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31, d32, d33, d34, d35, d36, d37, d38, d39, d40, d41, d42, d43, d44, d45, d46, d47, d48, d49;
    @FXML
    private Polyline c1a, c2a, c3a, c4a, c5a, c6a, c7a, c8a, c9a, c10a, c11a, c12a, c13a, c14a, c15a, c16a, c17a, c18a, c19a, c20a, c21a, c22a, c23a, c24a, c25a, c26a, c27a, c28a, c29a, c30a, c31a, c32a, c33a, c34a, c35a, c36a, c37a, c38a, c39a, c40a, c41a, c42a, c43a, c44a, c45a, c46a, c47a, c48a, c49a;
    @FXML
    private Polyline c1b, c2b, c3b, c4b, c5b, c6b, c7b, c8b, c9b, c10b, c11b, c12b, c13b, c14b, c15b, c16b, c17b, c18b, c19b, c20b, c21b, c22b, c23b, c24b, c25b, c26b, c27b, c28b, c29b, c30b, c31b, c32b, c33b, c34b, c35b, c36b, c37b, c38b, c39b, c40b, c41b, c42b, c43b, c44b, c45b, c46b, c47b, c48b, c49b;
    
    
    ScreensController myController;
    public int i = 0;
    static boolean response = false;
    
    Game g1 = new Game();
    Path pathTest = new Path();
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    public void onMouseClick(MouseEvent event) throws Exception {
    	boolean a = true;
    	for(int c=0;c<161;c++) {
    		
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
    		
    		Main.path.addPathList(Main.m1.get(((Line)event.getSource()).getId()));
    		Main.path.display();
    		pathTest.figurerecognition();
    		
    		
    	}else {
    		alert.setText("Linea Anteriormente Presionada");
    		alert.setStyle("-fx-text-fill: #95F4F1");
    		System.out.println("Line pressed");
    	}
    }
    
}