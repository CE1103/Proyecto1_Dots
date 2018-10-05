package HashMapAndPath;

public class ListPathCreated {

	public NodePathCreated firstNode;
	
	public void addListPathCreated(DotsToLinesList matrix) {

		if (firstNode!=null) {
			NodePathCreated newPCNode = new NodePathCreated(matrix);
			newPCNode.next = firstNode;
			firstNode = newPCNode;
		}else {
			firstNode = new NodePathCreated(matrix);
		}
	}
}