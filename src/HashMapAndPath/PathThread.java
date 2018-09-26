package HashMapAndPath;

public class PathThread implements Runnable {

	@Override
	public void run() {
		
		try {
			
			while(noencuentrapath) {
				
				if (encuentrapunto) {
					
					Thread t = new Thread(new PathThread());
					t.setDaemon(true); t.start();
					
				}
				
			}
			
			throw new PathFinishException();
			
		}catch (PathFinishException ex){
			
			System.out.println("path");
			
			
		}

	}

}
