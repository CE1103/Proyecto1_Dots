package HashMapAndPath;

import app.server.Main;;

public class Path {


	public void figureRecognition() {
		
		NodeLinesPath lastEntry = Main.path.firstNode;
		String point1 = lastEntry.matrix.firstNode.point1;
		String point2 = lastEntry.matrix.firstNode.point2;
		PathList pathLocal = new PathList();
		PathList pathCreated = new PathList();
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
				point1 = isInNode(point1,pathLocal,localCurrent,pathCreated);
				localCurrent = pathLocal.firstNode;
			}
			
		}
	}
	
	public String isInNode(String lookFor, PathList pathLocal,NodeLinesPath localCurrent,PathList pathCreated) {
		while(localCurrent != null){
			if (localCurrent.matrix.firstNode.point1 == lookFor) {
				lookFor = localCurrent.matrix.firstNode.point2;
				pathCreated.addPathList(new ListHashMap(localCurrent.matrix.firstNode.point1,lookFor));
				pathLocal.removeNode(localCurrent.matrix.firstNode.point1, lookFor);
				return  lookFor;
			
			}else if(localCurrent.matrix.firstNode.point2 == lookFor) {
				lookFor = localCurrent.matrix.firstNode.point1;
				pathCreated.addPathList(new ListHashMap(lookFor,localCurrent.matrix.firstNode.point2));
				pathLocal.removeNode(lookFor, localCurrent.matrix.firstNode.point2);
				return  lookFor;
			
			}else {
				localCurrent = localCurrent.next;		 
			}
		}
		return "";
		
	}

	public PathList newPathLocal(PathList a) {
		
		PathList pathLocal = new PathList();
		NodeLinesPath lastEntry = a.firstNode;

	    while (lastEntry != null) {
	    	   		
	    	pathLocal.addPathList(new ListHashMap(lastEntry.matrix.firstNode.point1,lastEntry.matrix.firstNode.point2));
	    	lastEntry = lastEntry.next;

	    }
	    return pathLocal;
	}
	
}
