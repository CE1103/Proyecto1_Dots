package util;

public class PortNode {
	
	public int port;
	public PortNode next;
	
	
	public PortNode(int port) {
		this.port = port;
	}
	
	public void display() {
		
		System.out.println(port + ".");
		
	}


}
