package HashMapAndPath;

import app.client.Main;

public class Path {
	
	public void figurerecognition() {
		
		NodeLinesPath lastEntry = Main.path.firstNode;
		String point1 = lastEntry.matrix.firstNode.point1;
		String point2 = lastEntry.matrix.firstNode.point1;
		
	    PathList pathLocal = new PathList();
	    
	    while (lastEntry != null) {
	    	
	    	if (lastEntry.matrix.firstNode.point1 == point1 & lastEntry.matrix.firstNode.point2 == point2) {
	    		
	    	}else {
	    		
	    		pathLocal.addPathList(new ListHashMap(lastEntry.matrix.firstNode.point1,lastEntry.matrix.firstNode.point2));
	    	}
	    }
		
	    NodeLinesPath localCurrent = pathLocal.firstNode;
	    
		while(point1 != "") {
			
			point1 = isInNode(localCurrent.matrix.firstNode.point1,localCurrent);
			
			
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
