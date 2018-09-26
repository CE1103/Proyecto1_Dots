package HashMapAndPath;

public class DotsToLinesNode {
	String line;
	
	DotsToLinesNode next;
	
	public DotsToLinesNode(String line) {
		this.line = line;
	}
	
	public void display() {
		
		System.out.println(line + ".");
		
	}
}
