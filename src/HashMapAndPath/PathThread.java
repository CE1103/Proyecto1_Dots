package HashMapAndPath;

import app.server.Main;

public class PathThread implements Runnable {

	String lookingFor;
	PathList pathList;
	String currentPoint;
	
	public PathThread(String firstPoint, PathList pathList, String lookingFor) {
		
		this.currentPoint = firstPoint;
		this.pathList = pathList;
		this.lookingFor = lookingFor;
		
	}

	@SuppressWarnings("deprecation")
	public void startThread() {
		Main.path.display();
		PathList a = copyPathList(Main.path);
		NodeLinesPath lastEntry = Main.path.firstNode;
		String point1 = lastEntry.matrix.firstNode.point1;
		String point2 = lastEntry.matrix.firstNode.point2;
		
//		Thread t = new Thread(new PathThread(point1, a, point2));
//		t.start();
//		while (t.isAlive()) {}
//		System.out.println("path");
	}

	@Override
	public void run() {
		try {			
			NodeLinesPath localCurrent = pathList.firstNode;
			while (currentPoint != lookingFor) {
				while(localCurrent != null) {
					if (localCurrent.matrix.firstNode.point1 == currentPoint) {

						PathList a = copyPathList(pathList);
						a.removeNode(localCurrent.matrix.firstNode.point1, localCurrent.matrix.firstNode.point2);
						Thread t = new Thread(new PathThread(localCurrent.matrix.firstNode.point1,a,lookingFor));
						t.setDaemon(true); t.start();

					}else if(localCurrent.matrix.firstNode.point2 == currentPoint) {


						PathList a = copyPathList(pathList);
						a.removeNode(localCurrent.matrix.firstNode.point1, localCurrent.matrix.firstNode.point2);
						Thread t = new Thread(new PathThread(localCurrent.matrix.firstNode.point2,a,lookingFor));
						t.setDaemon(true); t.start();

					}else {
						localCurrent = localCurrent.next;		 
					}
				}
			}
			
			throw new PathFinishException();
			
		}catch (PathFinishException ex){
			
			System.out.println(ex);
			return;
			
		}

	}

	public PathList copyPathList(PathList a) {
		
		PathList pathLocal = new PathList();
		NodeLinesPath lastEntry = a.firstNode;

	    while (lastEntry != null) {
	    	   		
	    	pathLocal.addPathList(new ListHashMap(lastEntry.matrix.firstNode.point1,lastEntry.matrix.firstNode.point2));
	    	lastEntry = lastEntry.next;

	    }
	    return pathLocal;
	}
	
}
