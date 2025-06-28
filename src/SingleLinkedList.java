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
        System.out.println("Pelanggan " + customer.getNama() + " berhasil ditambahkan ke antrian!");
    }

    //pop method
    public Customer pop() {
        if(isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada pelanggan untuk dilayani.");
            return null;
        }

        Customer customerDilayani = head.getData();
        System.out.println("Pelanggan " + customerDilayani.getNama() + " (No. " + customerDilayani.getNomorAntrian() + ") sedang dilayani!");

        setHead(head.getNext());
        decrementSize();

        if(isEmpty()) {
            setTail(null);
        }

        return customerDilayani;
    }

    //display method
    public void display() {
        System.out.println("\n===== ANTRIAN RESTORAN =====");
        
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Node current = head;
            int posisi = 1;
            while (current != null) {
                Customer customer = current.getData();
                System.out.println("[" + customer.getNomorAntrian() + "] " + customer.getNama() + 
                                 " - Waktu kedatangan: " + customer.getWaktuKedatanganFormatted());
                current = current.getNext();
                posisi++;
            }
        }
        
        System.out.println("=============================");
        System.out.println("Total pelanggan dalam antrian: " + size);
    }
    
}