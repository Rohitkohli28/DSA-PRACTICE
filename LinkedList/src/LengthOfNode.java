public class LengthOfNode {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int length(Node head){  // Method to calculate the length of the linked list
        int count = 0; // Initialize count to 0
        while(head != null){ // Traverse the linked list until the end
            count++; // Increment count for each node encountered
            head = head.next; // Move to the next node
        }
        return count; // Return the total count of nodes in the linked list
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(length(a)); // Output: 6
    }
}
