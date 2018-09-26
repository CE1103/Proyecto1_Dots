package app.queue;

public class Queue {
    
	class Node {
        Object element;
        Node Next;

        public Node(Object object) {
            element = object;
            Next = null;
        }
    }

    Node first;
    Node end;
    int size;

    public Queue() {
        end = null;
        size = 0;
    }

    public void enqueue(Object object) {
        Node new_node = new Node(object);
        if (first == null) {
            first = new_node;
            end = new_node;
        } else {
            end.Next = new_node;
            end = new_node;
        }
        size++;
    }

    public Object dequeue() {
        if (first == null)
            return null;
        Object o = first.element;
        first = first.Next;
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
        Node current= first;
        while(current!=null){
            System.out.println(current.element);
            current=current.Next;
        }
    }
    
    
	

}
