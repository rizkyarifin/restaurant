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

    //push method
    public void push(Customer customer) {
        Node newNode = new Node(customer);

        if (isEmpty()) {
            setHead(newNode);
            setTail(newNode);
        } else {
            tail.setNext(newNode);
            setTail(newNode);
        }
        incrementSize();
        System.out.println(customer.getNama() + "Masuk ke antrian");
        traverse();
    }

    //pop method
    public void pop() {
        if(isEmpty()) {
            System.out.println("Antrian kosong tidak ada pelanggan untuk di layani");
            return;
        }

        Customer customerDilayani = head.getData();
        System.out.println("Melayani pelanggan");
        System.out.println(customerDilayani);

        setHead(head.getNext());
        decrementSize();

        if(isEmpty()) {
            setTail(null);
        }

        traverse();
    }
    
}