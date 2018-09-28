package HashMapAndPath;

import app.server.NodeList;

public class PathList {
	
	NodeLinesPath firstNode;
	
	public boolean firstEmpty() {
		
		return (firstNode == null);
		
	}
	public void addPathList(ListHashMap matrix) {

		if (firstNode!=null) {
			NodeLinesPath newPLNode = new NodeLinesPath(matrix);
			newPLNode.next = firstNode;
			firstNode = newPLNode;
		}else {
			firstNode = new NodeLinesPath(matrix);
		}
	}
	
	public void display() {
		
		NodeLinesPath NLP = firstNode;
		while (NLP != null) {
			NLP.display();
 			
			NLP = NLP.next;
			
		}
		
	}
	
	public NodeLinesPath removeNode(String p1, String p2) {
		
		NodeLinesPath current = firstNode;
		NodeLinesPath previous = firstNode;
		

		while(current.matrix.firstNode.point1 != p1 || current.matrix.firstNode.point2 != p2) {
			
			if(current.next == null) {
				
				return null;
				
			}else {
				
				previous = current;
				current = current.next;
				
			}
			
		}
		
		if(current == firstNode) {
			
			firstNode = firstNode.next;
			
		}else {
			
			previous.next = current.next;
			
		}
		return current;
	}

}
