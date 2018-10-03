package HashMapAndPath;

import app.server.Main;
import util.Util;
import app.communication.ServerCommunication;

public class PathThread implements Runnable {

	String lookingFor;
	PathList pathList;
	String currentPoint;
	PathList currentPath;
	
	public PathThread(String firstPoint, PathList pathList, String lookingFor) {

		this.currentPoint = firstPoint;
		this.pathList = pathList;
		this.lookingFor = lookingFor;

	}
	@SuppressWarnings("deprecation")
	public void startThread() {

		PathList a = copyPathList(Main.path);
		System.out.println("f1");
		NodeLinesPath lastEntry = Main.path.firstNode;
		System.out.println("f3");

		Util.pathThreadOn = true;
		System.out.println("f4");
		Thread t = new Thread(new PathThread(ServerCommunication.temp1.firstNode.matrix.firstNode.point1, a, ServerCommunication.temp1.firstNode.matrix.firstNode.point2));
		System.out.println("f5");
		t.start();
		System.out.println("f6");
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
							System.out.println(currentPoint);
							System.out.println(localCurrent.matrix.firstNode.point1);
							System.out.println(localCurrent.matrix.firstNode.point2);
							a.removeNode(localCurrent.matrix.firstNode.point1, localCurrent.matrix.firstNode.point2);
							Thread t = new Thread(new PathThread(localCurrent.matrix.firstNode.point2,a,lookingFor));
							t.setDaemon(false); t.start();
							localCurrent = localCurrent.next;

						}else if(localCurrent.matrix.firstNode.point2 == currentPoint) {


							PathList a = copyPathList(pathList);
							System.out.println("\n\n"+currentPoint+"\n\n");
							System.out.println(localCurrent.matrix.firstNode.point1+"\n\n");
							System.out.println(localCurrent.matrix.firstNode.point2+"\n\n");
							a.display();
							System.out.println("\n\n");
							a.removeNode(localCurrent.matrix.firstNode.point1, localCurrent.matrix.firstNode.point2);
							Thread t = new Thread(new PathThread(localCurrent.matrix.firstNode.point1,a,lookingFor));
							t.setDaemon(false); t.start();
							localCurrent = localCurrent.next;

						}else {
							localCurrent = localCurrent.next;		 
						}
					} System.out.println("fin de thread"); return;
				} else {
					System.out.println("fin");
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
