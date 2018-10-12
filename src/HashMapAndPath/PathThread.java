package HashMapAndPath;

import app.communication.Game;
import app.communication.ServerCommunication;
import app.server.Main;
import app.server.Player;
import util.Util;

public class PathThread implements Runnable {

	String lookingFor;
	PathList pathList;
	String currentPoint;
	PathList currentPath;
	
	public PathThread(String firstPoint, PathList pathList, String lookingFor, PathList currentPath) {

		this.currentPoint = firstPoint;
		this.pathList = pathList;
		this.lookingFor = lookingFor;
		this.currentPath = currentPath;

	}
	public void startThread() throws InterruptedException {
		/**
		 * Función que crea el hilo para comenzar a buscar el recorrido y detectar si se se creó alguna figura.
		 */

		PathList a = copyPathList(Main.path);
		PathList b = new PathList();
		
		b.addPathList(new ListHashMap(ServerCommunication.temp1.firstNode.getMatrix().firstNode.getPoint1(), 
				ServerCommunication.temp1.firstNode.getMatrix().firstNode.getPoint2()));

		Util.pathThreadOn = true;
		Thread t = new Thread(new PathThread(ServerCommunication.temp1.firstNode.getMatrix().firstNode.getPoint1(), a, ServerCommunication.temp1.firstNode.getMatrix().firstNode.getPoint2(),b));
		t.start();
		Thread.sleep(1000);
	}

	@Override
	public void run() {
		if(Util.pathThreadOn) {			
			NodeLinesPath localCurrent = pathList.firstNode;
			int score = 0;
			while (currentPoint != lookingFor) {
				if (Util.pathThreadOn) {
					while(localCurrent != null) {
						if (localCurrent.getMatrix().firstNode.getPoint1() == currentPoint) {

							PathList a = copyPathList(pathList);						
							PathList b = copyPathList(currentPath);
							b.addPathList(new ListHashMap(localCurrent.getMatrix().firstNode.getPoint1(), localCurrent.getMatrix().firstNode.getPoint2()));
							a.removeNode(localCurrent.getMatrix().firstNode.getPoint1(), localCurrent.getMatrix().firstNode.getPoint2());
							score++;
							Thread t = new Thread(new PathThread(localCurrent.getMatrix().firstNode.getPoint2(),a,lookingFor,b));
							t.setDaemon(false); t.start();
							localCurrent = localCurrent.getNext();

						}else if(localCurrent.getMatrix().firstNode.getPoint2() == currentPoint) {


							PathList a = copyPathList(pathList);
							PathList b = copyPathList(currentPath);
							b.addPathList(new ListHashMap(localCurrent.getMatrix().firstNode.getPoint1(), localCurrent.getMatrix().firstNode.getPoint2()));
							a.removeNode(localCurrent.getMatrix().firstNode.getPoint1(), localCurrent.getMatrix().firstNode.getPoint2());
							score++;
							Thread t = new Thread(new PathThread(localCurrent.getMatrix().firstNode.getPoint1(),a,lookingFor,b));
							t.setDaemon(false); t.start();
							localCurrent = localCurrent.getNext();

						}else {
							localCurrent = localCurrent.getNext();		 
						}
					} return;
				} else {
					return;
				}
			}
			score = util.Util.scoredPoints(currentPath);
			System.out.println(score);
			Player.scoreAdd(score);
			currentPath.display();
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

			pathLocal.addPathList(new ListHashMap(lastEntry.getMatrix().firstNode.getPoint1(),lastEntry.getMatrix().firstNode.getPoint2()));
			lastEntry = lastEntry.getNext();

		}
		return pathLocal;
	}

}
