package app.communication;

public class Queue {
	
    QueueNode first;
    QueueNode end;
    int size;

    public Queue() {
        end = null;
        size = 0;
    }

    public void enqueue(int object) {
    	QueueNode new_node = new QueueNode(object);
        if (first == null) {
            first = new_node;
            end = new_node;
        } else {
            end.next = new_node;
            end = new_node;
        }
        size++;
    }

    public Object dequeue() {
        if (first == null)
            return null;
        Object o = first.element;
        first = first.next;
        size--;
        return o;
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
            System.out.println(first.element);
        return first.element;
    }
    public void showAll(){
        QueueNode current= first;
        while(current!=null){
            System.out.println(current.element);
            current=current.next;
        }
    }
    
    
	

}