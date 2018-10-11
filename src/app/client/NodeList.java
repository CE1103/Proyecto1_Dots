package app.client;

public class NodeList {

	public String pointNumber;
	public List matrix;
	
	public NodeList next;
	
	public NodeList(String pointNumber) {
		
		this.pointNumber = pointNumber;	
		
	}
	
	public NodeList(List matriz) {
		this.matrix = matriz;
		
	}
	
	public String getPointNumber() {
		
		return pointNumber;
		
	}
	
	public List getNodeNumber() {
		return matrix;
	}
	
	public void display() {
		
		System.out.println(pointNumber + ".");
		System.out.println(matrix + ".");
		
	}
	
	
}