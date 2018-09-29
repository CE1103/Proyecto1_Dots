package HashMapAndPath;

import app.server.Main;
import util.Util;
import app.communication.ServerCommunication;

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

		PathList a = copyPathList(Main.path);
		NodeLinesPath lastEntry = Main.path.firstNode;

		Util.pathThreadOn = true;
		Thread t = new Thread(new PathThread(ServerCommunication.temp1.firstNode.matrix.firstNode.point1, a, ServerCommunication.temp1.firstNode.matrix.firstNode.point2));
		t.start();
	}

	@Override
	public void run() {
		if(Util.pathThreadOn) {			
			NodeLinesPath localCurrent = pathList.firstNode;
			while (currentPoint != lookingFor) {
				if (Util.pathThreadOn) {
					while(localCurrent != null) {
						if (localCurrent.matrix.firstNode.point1 == currentPoint) {

							PathList a = copyPathList(pathList);
							a.removeNode(localCurrent.matrix.firstNode.point1, localCurrent.matrix.firstNode.point2);
							Thread t = new Thread(new PathThread(localCurrent.matrix.firstNode.point2,a,lookingFor));
							t.setDaemon(false); t.start();
							localCurrent = localCurrent.next;

						}else if(localCurrent.matrix.firstNode.point2 == currentPoint) {


							PathList a = copyPathList(pathList);
							a.removeNode(localCurrent.matrix.firstNode.point1, localCurrent.matrix.firstNode.point2);
							Thread t = new Thread(new PathThread(localCurrent.matrix.firstNode.point1,a,lookingFor));
							t.setDaemon(false); t.start();
							localCurrent = localCurrent.next;

						}else {
							localCurrent = localCurrent.next;		 
						}
					} return;
				} else {
					return;
				}
			}
			System.out.println("score");
			Util.pathThreadOn = false;
			return;
		}else{
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
