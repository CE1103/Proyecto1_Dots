package HashMapAndPath;

import app.server.Main;

public class RemoveInside {
	
	public void removeInside(PathList pathCreated) {
		
		ListPathCreated LPC = new ListPathCreated();
		NodeLinesPath pathCreatedCurrent = pathCreated.firstNode;
		
		while(pathCreatedCurrent != null) {
			
			LPC.addListPathCreated(Main.m2.get(pathCreatedCurrent.getMatrix().firstNode.getPoint1() + " " + 
			pathCreatedCurrent.getMatrix().firstNode.getPoint2()));
			
			
			
		}
		NodePathCreated CurrentNodeLPC = LPC.firstNode;
		while(CurrentNodeLPC != null) {
			
			String s = CurrentNodeLPC.getMatrix().firstNode.line;
			int i = CurrentNodeLPC.getMatrix().firstNode.lineValue;
			
			
			
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