package HashMapAndPath;

public class PathThread implements Runnable {
	
	@SuppressWarnings("deprecation")
	public void startThread() {
		
		Thread t = new Thread(new PathThread());
		t.start();
		while (t.isAlive()) {}
		System.out.println("path");
	}

	@Override
	public void run() {
			while (point1 != point2) {
				
				if (buscarPunto) {
					
					Thread t = new Thread(new PathThread());
					t.setDaemon(true); t.start();
					//recorrido
					
				}
				
				
				
			}
			
			return;

	}

}
