package HashMapAndPath;

import app.server.Main;;

public class Path {


	public void figureRecognition() {
		
		NodeLinesPath lastEntry = Main.path.firstNode;
		String point1 = lastEntry.getMatrix().firstNode.getPoint1();
		String point2 = lastEntry.getMatrix().firstNode.getPoint2();
		PathList pathLocal = new PathList();
		PathList pathCreated = new PathList();
		lastEntry = lastEntry.getNext();

	    while (lastEntry != null) {
	    	   		
	    	pathLocal.addPathList(new ListHashMap(lastEntry.getMatrix().firstNode.getPoint1(),lastEntry.getMatrix().firstNode.getPoint2()));
	    	lastEntry = lastEntry.getNext();

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
			if (localCurrent.getMatrix().firstNode.getPoint1() == lookFor) {
				lookFor = localCurrent.getMatrix().firstNode.getPoint2();
				pathCreated.addPathList(new ListHashMap(localCurrent.getMatrix().firstNode.getPoint1(),lookFor));
				pathLocal.removeNode(localCurrent.getMatrix().firstNode.getPoint1(), lookFor);
				return  lookFor;
			
			}else if(localCurrent.getMatrix().firstNode.getPoint2() == lookFor) {
				lookFor = localCurrent.getMatrix().firstNode.getPoint1();
				pathCreated.addPathList(new ListHashMap(lookFor,localCurrent.getMatrix().firstNode.getPoint2()));
				pathLocal.removeNode(lookFor, localCurrent.getMatrix().firstNode.getPoint2());
				return  lookFor;
			
			}else {
				localCurrent = localCurrent.getNext();		 
			}
		}
		return "";
		
	}

	public PathList newPathLocal(PathList a) {
		
		PathList pathLocal = new PathList();
		NodeLinesPath lastEntry = a.firstNode;

	    while (lastEntry != null) {
	    	   		
	    	pathLocal.addPathList(new ListHashMap(lastEntry.getMatrix().firstNode.getPoint1(),lastEntry.getMatrix().firstNode.getPoint2()));
	    	lastEntry = lastEntry.getNext();

	    }
	    return pathLocal;
	}
	
}
