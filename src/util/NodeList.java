<<<<<<< HEAD
package util;

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

=======
package util;

 public class NodeList {
 	public String pointnumber;
	public List matrix;
	
	public NodeList next;
	
	public NodeList(String pointnumber) {
		
		this.pointnumber = pointnumber;	
		
	}
	
	public NodeList(List matriz) {
		
		this.matrix = matriz;
		
	}
	
	public String getPointNumber() {
		
		return pointnumber;
		
	}
	
	public List getNodonumber() {
		return matrix;
	}
	
	public void display() {
		
		System.out.println(pointnumber + ".");
		System.out.println(matrix + ".");
		
	}
	
	
}
>>>>>>> refs/heads/GUI
