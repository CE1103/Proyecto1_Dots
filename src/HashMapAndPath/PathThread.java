package HashMapAndPath;

public class PathThread implements Runnable {
	
	public void search() {
		
		
	}

	@Override
	public void run() {
		
		try {
			
			while(point1 != point2) {
				
				if (encuentrapunto) {
					
					Thread t = new Thread(new PathThread());
					t.setDaemon(true); t.start();
					//recorrido
					
				}
				
			}
			
			throw new PathFinishException();
			
		}catch (PathFinishException ex){
			
			System.out.println("path");
			
			
		}

	}

}
