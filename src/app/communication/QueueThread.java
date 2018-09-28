package app.communication;

public class QueueThread implements Runnable{
	
	private Thread p1 = new Thread();
	private Thread p2 = new Thread();
	private Thread q = new Thread();

	@Override
	public void run() {
		
		q.start();
		p1.setDaemon(true);
		p2.setDaemon(true);
		p1.start(); 
		p2.start();
		while (true) {
			
			
		}
		
	}
	
	

}
