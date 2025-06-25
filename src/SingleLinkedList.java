public class SingleLinkedList {
    private Node head;
    private Node tail;
    private int size;
    
    public SingleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public int getSize() {
        return size;
    }
    
    public Node getHead() {
        return head;
    }
    
    public Node getTail() {
        return tail;
    }
    
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
    
    
    protected void setHead(Node head) {
        this.head = head;
    }
    
    protected void setTail(Node tail) {
        this.tail = tail;
    }
    
    protected void incrementSize() {
        size++;
    }
    
    protected void decrementSize() {
        size--;
    }
    
}