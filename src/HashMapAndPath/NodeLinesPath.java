package HashMapAndPath;

public class NodeLinesPath {

	ListHashMap matrix;
	NodeLinesPath next;
	
	public NodeLinesPath(ListHashMap matrix) {
		
		this.matrix = matrix;
		
	}
	
	public void display() {
		
		System.out.println(matrix.firstNode.point1);
		System.out.println(matrix.firstNode.point2);
		
	}
	

}