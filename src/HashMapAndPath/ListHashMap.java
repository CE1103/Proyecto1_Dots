package HashMapAndPath;

public class ListHashMap {
	
public NodeHashMap firstNode;
		
public boolean firstEmpty() {
	
	return (firstNode == null);
	
}

public ListHashMap(String point1, String point2) {

	NodeHashMap newHMNode = new NodeHashMap(point1,point2);
	newHMNode.next = firstNode;
	firstNode = newHMNode;
	
}

public void display() {
	
	NodeHashMap HM = firstNode;
	while (HM != null) {
		HM.display();		
		System.out.println("\n");

		
		HM = HM.next;
		
	}		
	
	}
}
