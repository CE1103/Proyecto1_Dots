package util;

public class NodeHashMap {
	
	String punto1;
	String punto2;
	
	NodeHashMap next;
	
	public NodeHashMap(String punto1, String punto2) {
		this.punto1 = punto1;
		this.punto2 = punto2;
	}
	
	public void display() {
		
		System.out.println(punto1 + ".");
		System.out.println(punto2 + ".");
		
	}

}
