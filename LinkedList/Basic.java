package LinkedList;

public class Basic {

    public static class Node{
        int data; // Data stored in the node (Value)
        Node next; // Reference to the next node in the list
        Node(int data){ // Constructor to initialize the node with data
            this.data = data; // Set the data for the node
        }
    }
    public static void main(String[] args) {
//      Node x = new Node();
//      System.out.println(x.next); // Output: null, since next is not initialized
        Node a = new Node(5);
        System.out.println(a.next); // Output: null, since next is not initialized for node a
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);

        // 5 -> 10 -> 15 -> 20 -> 25
//        a.next = b; // Link node a to node b
//        System.out.println(a.next); // Output: LinkedList.Basic$Node@5f184fc6
//        b.next = c; // Link node b to node c
//        c.next = d; // Link node c to node d
//        d.next = e; // Link node d to node e

//        a.next = b;
//        System.out.println(a.data); // Output: 5
//        System.out.println(a.next.data); // Output: 10 (B ka data)

        a.next = b; // Link node a to node b
        b.next = c; // Link node b to node c
        c.next = d; // Link node c to node d
        d.next = e; // Link node d to node e
    }
}
