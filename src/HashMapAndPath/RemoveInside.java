package HashMapAndPath;

import app.communication.ServerCommunication;
import app.server.Main;

public class RemoveInside {
	
	public void removeInside(PathList pathCreated) {
		
		int c = ServerCommunication.server.counter;		
		ListPathCreated LPC = new ListPathCreated();
		NodeLinesPath pathCreatedCurrent = pathCreated.firstNode;
		
		while(pathCreatedCurrent != null) {
			
			LPC.addListPathCreated(Main.m2.get(pathCreatedCurrent.matrix.firstNode.point1 + " " + 
			pathCreatedCurrent.matrix.firstNode.point2));
			
			
			
		}
		NodePathCreated CurrentNode = LPC.firstNode;
		Main.linesStatic[c] = "d";
		while(LPC != null) {
			
			while() {
				
				if() {
					
				}else if() {
					
				}else if() {
					
				}else {
					
				}
				
				
			}
			
			
			
		}
	}
		
	

	public void removeUp() {
		
		
		
	}
	
	public void removeDown() {
		
		
		
	}
	
	public void removeLeft() {
		
		
		
	}
	
	
	public void removeRight() {
		
		
		
	}
}
