package HashMapAndPath;

public class NodeHashMap {
	
	private String point1;
	private String point2;
	
	NodeHashMap next;
	
	public NodeHashMap(String punto1, String punto2) {
		this.setPoint1(punto1);
		this.setPoint2(punto2);
	}
	
	public void display() {
		
		System.out.println(getPoint1() + ".");
		System.out.println(getPoint2() + ".");
		
	}

	public String getPoint1() {
		return point1;
	}

	public void setPoint1(String point1) {
		this.point1 = point1;
	}

	public String getPoint2() {
		return point2;
	}

	public void setPoint2(String point2) {
		this.point2 = point2;
	}

}
