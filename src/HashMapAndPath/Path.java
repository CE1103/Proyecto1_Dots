package HashMapAndPath;

import app.client.Main;

public class Path {
	
	private PathList pathLocal;
	
	public void figureRecognition() {
		
		NodeLinesPath lastEntry = Main.path.firstNode;
		String point1 = lastEntry.matrix.firstNode.point1;
		String point2 = lastEntry.matrix.firstNode.point2;
		
	    PathList pathLocal = new PathList();
		lastEntry = lastEntry.next;
	    while (lastEntry != null) {
	    	   		
	    	pathLocal.addPathList(new ListHashMap(lastEntry.matrix.firstNode.point1,lastEntry.matrix.firstNode.point2));
	    	lastEntry = lastEntry.next;

	    }
	    NodeLinesPath localCurrent = pathLocal.firstNode;
		while(point1 != "") {

			if (point1 == point2) {
				System.out.println("Path Found");
				break;
			}else if(localCurrent == null) {
				point1="";
			}else {
				point1 = isInNode(point1,pathLocal,localCurrent);
				System.out.println(point1);
				localCurrent = pathLocal.firstNode;
			}
			
		}
		pathLocal = null;
	}
	
	public String isInNode(String lookFor, PathList pathLocal,NodeLinesPath localCurrent) {
		while(localCurrent != null){
			if (localCurrent.matrix.firstNode.point1 == lookFor) {
				lookFor = localCurrent.matrix.firstNode.point2;
				pathLocal.removeNode(localCurrent.matrix.firstNode.point1, lookFor);
				return  lookFor;
			
			
			}else if(localCurrent.matrix.firstNode.point2 == lookFor) {
				lookFor = localCurrent.matrix.firstNode.point1;
				pathLocal.removeNode(lookFor, localCurrent.matrix.firstNode.point2);
				return  lookFor;
			
			}else {
				System.out.println(localCurrent);
				localCurrent = localCurrent.next;		 
			}
		}
		return "";
		
	}

}
