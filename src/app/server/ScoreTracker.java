package app.server;

import HashMapAndPath.ListPathCreated;
import HashMapAndPath.NodeLinesPath;
import HashMapAndPath.PathList;

public class ScoreTracker {
	
	public static int scoredPoints(PathList pathCreated) {

		ListPathCreated LPC = new ListPathCreated();
		NodeLinesPath pathCreatedCurrent = pathCreated.firstNode;
		int score = 0;
		while(pathCreatedCurrent != null) {

			LPC.addListPathCreated(Main.m2.get(pathCreatedCurrent.getMatrix().firstNode.getPoint1() + " " + 
					pathCreatedCurrent.getMatrix().firstNode.getPoint2()));

			if(LPC.firstNode.getMatrix().firstNode.getLine() == "v" || LPC.firstNode.getMatrix().firstNode.getLine() == "h") {
				score += 2;
			}else {
				score +=1;
			}

		}
		
		return score;
	}
 

}
