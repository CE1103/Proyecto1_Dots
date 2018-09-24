package util;

public class ListHashMap {
	
public NodeHashMap firstPoint;
		
public boolean firstEmpty() {
	
	return (firstPoint == null);
	
}

public ListHashMap(String point1, String point2) {

	NodeHashMap newHMNode = new NodeHashMap(point1,point2);
	newHMNode.next = firstPoint;
	firstPoint = newHMNode;
	
}

public void display() {
	
	NodeHashMap HM = firstPoint;
	while (HM != null) {
		HM.display();		
		System.out.println("\n");

		
		HM = HM.next;
		
	}		
	
	}
}
