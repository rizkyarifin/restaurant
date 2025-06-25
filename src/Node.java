public class Node {
    Customer data;
    Node next;
    
    public Node(Customer data) {
        this.data = data;
        this.next = null;
    }
    
    public Customer getData() {
        return data;
    }
    
    public void setData(Customer data) {
        this.data = data;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
}