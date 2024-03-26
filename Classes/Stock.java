// Stock.java
public class Stock {
    private String name;
    private int quantity;

    // Constructor
    public Stock(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }
}


// Node.java
public class Node {
    public Stock data;
    public Node next;

    // Constructor
    public Node(Stock data) {
        this.data = data;
        this.next = null;
    }
}


// LinkedList.java
public class LinkedList {
    private Node head;

    // Constructor
    public LinkedList() {
        this.head = null;
    }

    // Method to insert a stock at the beginning of the list
    public void insert(Stock stock) {
        Node newNode = new Node(stock);
        newNode.next = head;
        head = newNode;
    }

      // Method to display the contents of the list
     public void display() {
        Node current = head;
        while (current != null) {
            System.out.println("Stock Name: " + current.data.getName() + ", Quantity: " + current.data.getPrice());
            current = current.next;
        }
    }

}
