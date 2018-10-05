package HashMapAndPath;

public class NodePathCreated {
	
	private DotsToLinesList matrix;
	NodePathCreated next;
	
	public NodePathCreated(DotsToLinesList matrix) {
		
		this.setMatrix(matrix);
		
	}

	public DotsToLinesList getMatrix() {
		return matrix;
	}

	public void setMatrix(DotsToLinesList matrix) {
		this.matrix = matrix;
	}
}
