package HashMapAndPath;

public class NodeLinesPath {

	private ListHashMap matrix;
	private NodeLinesPath next;
	
	public NodeLinesPath(ListHashMap matrix) {
		
		this.setMatrix(matrix);
		
	}
	
	public void display() {
		
		System.out.println(getMatrix().firstNode.getPoint1());
		System.out.println(getMatrix().firstNode.getPoint2());
		
	}

	public ListHashMap getMatrix() {
		return matrix;
	}

	public void setMatrix(ListHashMap matrix) {
		this.matrix = matrix;
	}

	public NodeLinesPath getNext() {
		return next;
	}

	public void setNext(NodeLinesPath next) {
		this.next = next;
	}
	

}