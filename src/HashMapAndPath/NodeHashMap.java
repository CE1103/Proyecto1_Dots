package HashMapAndPath;

public class NodeHashMap {
	
	String point1;
	String point2;
	
	NodeHashMap next;
	
	public NodeHashMap(String punto1, String punto2) {
		this.point1 = punto1;
		this.point2 = punto2;
	}
	
	public void display() {
		
		System.out.println(point1 + ".");
		System.out.println(point2 + ".");
		
	}

}
