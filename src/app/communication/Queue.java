package app.communication;

public class Queue {


    QueueNode first;
    QueueNode end;
    int size;

    public Queue() {
        end = null;
        size = 0;
    }

    public void enqueue(int port) {
    	QueueNode new_node = new QueueNode(port);
        if (first == null) {
            this.first = new_node;
            this.end = new_node;
        } else {
            this.end.next = new_node;
            this.end = new_node;
        }
        size++;
    }

    public Object dequeue() {
    	if (this.first == null) 
    		return null; 
    	
    	QueueNode queue = this.first; 
    	this.first = this.first.next; 
    	
    	if (this.first == null) 
    	this.end = null; 
    	return queue; 
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (first == null)
            return null;
        else
            System.out.println(first.port);
        return first.port;
    }
    public void showAll(){
        QueueNode current= first;
        while(current!=null){
            System.out.println(current.port);
            current=current.next;
        }
    }
    
}
