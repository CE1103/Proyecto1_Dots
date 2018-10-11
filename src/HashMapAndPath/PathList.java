package HashMapAndPath;

public class PathList {
	
	public NodeLinesPath firstNode;
	
	public boolean firstEmpty() {
		
		return (firstNode == null);
		
	}
	public void addPathList(ListHashMap matrix) {

		if (firstNode!=null) {
			NodeLinesPath newPLNode = new NodeLinesPath(matrix);
			newPLNode.setNext(firstNode);
			firstNode = newPLNode;
		}else {
			firstNode = new NodeLinesPath(matrix);
		}
	}
	
	public void display() {
		
		NodeLinesPath NLP = firstNode;
		while (NLP != null) {
			NLP.display();
 			
			NLP = NLP.getNext();
			
		}
		
	}
	
	public NodeLinesPath removeNode(String p1, String p2) {
		
		NodeLinesPath current = firstNode;
		NodeLinesPath previous = firstNode;
		

		while(current.getMatrix().firstNode.getPoint1() != p1 || current.getMatrix().firstNode.getPoint2() != p2) {
			
			if(current.getNext() == null) {
				
				return null;
				
			}else {
				
				previous = current;
				current = current.getNext();
				
			}
			
		}
		
		if(current == firstNode) {
			
			firstNode = firstNode.getNext();
			
		}else {
			
			previous.setNext(current.getNext());
			
		}
		return current;
	}

}