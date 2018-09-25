package HashMapAndPath;

import app.client.Main;

public class Path {
	
	public void figurerecognition() {
		
		NodeLinesPath lastEntry = Main.path.firstNode;
		String point = lastEntry.matrix.firstNode.point1;
		
		while(point != "") {
			
			point = isInNode(point,lastEntry);
			
			
		}
		
	}
	
	public String isInNode(String lookFor, NodeLinesPath lastEntry) {
		
		if (lastEntry.matrix.firstNode.point1 == lookFor) {
			
			return  lastEntry.matrix.firstNode.point2;
			
		}else if(lastEntry.matrix.firstNode.point2 == lookFor) {
			
			return lastEntry.matrix.firstNode.point1;
			
		}else {
			
			return "";
		 
		}
		
	}

}
