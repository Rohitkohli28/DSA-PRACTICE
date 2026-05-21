public class nthNodeFromEnd {
    public static Node nthNode(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int m = size - n + 1; // Calculate the position of the nth node from the end
        // mth node from start = (size - n + 1)th node from the start
        temp = head; // Start from the head of the list
        for(int i=1; i<=m-1; i++){
            temp = temp.next; // Move to the next node until we reach the mth node from the start
        }
        return temp; // Return the mth node from the start, which is the nth node from the end
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node q = nthNode(a, 2); // Find the 3rd node from the end
        System.out.println(q.data); // Output: 5 (Data of the 3rd
    }
}
