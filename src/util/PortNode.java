package util;

import HashMapAndPath.NodeHashMap;

public class PortNode {
	
	int port;
	PortNode next;
	
	
	public PortNode(int port) {
		this.port = port;
	}
	
	public void display() {
		
		System.out.println(port + ".");
		
	}


}
