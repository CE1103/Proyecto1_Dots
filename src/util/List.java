package util;

 public class List {
	
	public NodeList firstpoint;
			
	public boolean firstEmpty() {
		
		return (firstpoint == null);
		
	}
	
	public void addNode(List matriz) {
		
		NodeList newNode = new NodeList(matriz);
		newNode.next = firstpoint;
		firstpoint = newNode;
		
	}
	
	public void addPoint(String pointnumber) {
	
		NodeList newPoint = new NodeList(pointnumber);
		newPoint.next = firstpoint;
		firstpoint = newPoint;
		
	}
	
	public void displaypoint() {
		
		NodeList LN = firstpoint;
		NodeList LN1 = LN.matriz.firstpoint;
		while(LN != null) {
			while(LN1 != null) {
				LN1.display();		
				System.out.println("Next Link "+ LN1.next + "\n\n");
 				
				LN1 = LN1.next;
				
			}
			LN = LN.next;
			try {
			LN1 = LN.matriz.firstpoint;
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}
	
	public void display() {
		
		NodeList LN = firstpoint;
		while (LN != null) {
			LN.display();		
			System.out.println("Next Link "+ LN.next + "\n\n");
 			
			LN = LN.next;
			
		}
		
	}
}