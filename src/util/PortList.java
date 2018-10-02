package util;

public class PortList {
	

	public PortNode firstNode;


	public void addPortList(int port) {

		PortNode newPort = new PortNode(port);
		newPort.next = firstNode;
		firstNode = newPort;

	}

	public void display() {

		PortNode PN = firstNode;
		while (PN != null) {
			PN.display();		
			System.out.println("\n");


			PN = PN.next;

		}		

	}
}