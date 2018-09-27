package app.server;

public class List {
		
	public NodeList firstPoint;
	public static NodeList firstPointFinal;
			
	public boolean firstEmpty() {
		
		return (firstPoint == null);
		
	}
	
	public void addNode(List matriz) {
		
		NodeList newNode = new NodeList(matriz);
		newNode.next = firstPoint;
		firstPoint = newNode;
		firstPointFinal = newNode;
		
	}
	
	public void addPoint(String pointNumber) {
	
		NodeList newPoint = new NodeList(pointNumber);
		newPoint.next = firstPoint;
		firstPoint = newPoint;
	}
	
	public void displayPoint() {
		
		NodeList LN = firstPoint;
		NodeList LN1 = LN.matrix.firstPoint;
		while(LN != null) {
			while(LN1 != null) {
				LN1.display();		
				System.out.println("Next Link "+ LN1.next + "\n\n");

				
				LN1 = LN1.next;
				
			}
			LN = LN.next;
			try {
			LN1 = LN.matrix.firstPoint;
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}
	
	public void display() {
		
		NodeList LN = firstPoint;
		while (LN != null) {
			LN.display();		
			System.out.println("Next Link "+ LN.next + "\n\n");

			
			LN = LN.next;
			
		}		
		
	}
	
	public static List createLinkedList() { // Mover Server
 		int p = 0;
 		int q = 8;
 		List matrix = new List();
 		for(int i = 0; i < 8; i++) {
 			List list = new List();
 			for(int j = 0; j < 8; j++) {
 				list.addPoint("p" + Integer.toString((8*q)-p)); p++;
 			}
 			q--;
			p=0;
			matrix.addNode(list);
		}
		matrix.displayPoint();
		return matrix;
	}
}