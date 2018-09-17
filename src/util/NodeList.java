package util;

 public class NodeList {
 	public String pointnumber;
	public List matriz;
	
	public NodeList next;
	
	public NodeList(String pointnumber) {
		
		this.pointnumber = pointnumber;	
		
	}
	
	public NodeList(List matriz) {
		this.matriz = matriz;
		
	}
	
	public String getpointnumber() {
		
		return pointnumber;
		
	}
	
	public List getNodonumber() {
		return matriz;
	}
	
	public void display() {
		
		System.out.println(pointnumber + ".");
		System.out.println(matriz + ".");
		
	}
	
	
}