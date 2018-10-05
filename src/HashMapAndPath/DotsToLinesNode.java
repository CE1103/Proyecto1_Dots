package HashMapAndPath;

public class DotsToLinesNode {
	
	String line;
	int lineValue;
	
	DotsToLinesNode next;
	
	public DotsToLinesNode(String line, int lineValue) {
		this.line = line;
		this.lineValue = lineValue;
	}
	
	public String getLine() {
		return line;
	}
	
	public void display() {
		
		System.out.println(line + ".");
		
	}
}
