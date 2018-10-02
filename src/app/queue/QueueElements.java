package app.queue;

import Sockets.SocketServer;
import app.queue.Queue;

public class QueueElements extends Queue{
	
	public void GamePorts() {
		enqueue(SocketServer.port1);
		enqueue(SocketServer.port2);
	}
	
	public void Elements() {
		
		enqueue(SocketServer.port3);
		enqueue(SocketServer.port4);
		enqueue(SocketServer.port5);
		enqueue(SocketServer.port6);
		
	}
}
