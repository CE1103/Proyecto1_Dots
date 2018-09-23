package util;

public class List {
		
	public NodeList firstPoint;
	public static NodeList firstPointFinal;
			
	public boolean firstEmpty() {
		
		return (firstPoint == null);
		
	}
	
	public void addNode(List matrix) {
		
		NodeList newNode = new NodeList(matrix);
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
}