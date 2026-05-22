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

    public static Node nthNode2(Node head, int n){
        Node slow = head; // Initialize the slow pointer to the head of the list
        Node fast = head; // Initialize the fast pointer to the head of the list
        for(int i=1; i<=n; i++){
            fast = fast.next; // Move the fast pointer n steps ahead
        }
        while(fast != null){ // Traverse the list until the fast pointer reaches the end
            slow = slow.next; // Move the slow pointer one step at a time
            fast = fast.next; // Move the fast pointer one step at a time
        }
        return slow; // When the fast pointer reaches the end, the slow pointer will be at the nth node from the end
    }

    public static Node deleteNthFromEnd(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next; // Move the fast pointer n steps ahead
        }
        if(fast == null){ // If the fast pointer is null after moving n steps, it means we need to delete the head node
            head = head.next; // Update the head to the next node, effectively removing the original head from the list
            return head; // Exit the function after deleting the head node
        }
        while(fast.next != null){ // Traverse the list until the fast pointer reaches the second last node
            slow = slow.next; // Move the slow pointer one step at a time
            fast = fast.next; // Move the fast pointer one step at a time
        }
        slow.next = slow.next.next; // Remove the nth node from the end by linking the slow pointer to the node after the next node
        return head; // Return the head of the modified linked list after deletion
    }

    public static void display(Node head){
        Node temp = head; // Start from the head of the list
        while(temp != null){
            System.out.print(temp.data + " "); // Output: 5 10 15 20 25
            temp = temp.next; // Move to the next node
        }
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
        System.out.println(q.data); // Output: 5 (Data of the 3rd node from the end)
        Node r = nthNode2(a, 2); // Find the 3rd node from the end using the two-pointer approach
        System.out.println(r.data); // Output: 5 (Data of the 3rd node from the end)
        // deleteNthFromEnd(a, 2); // Delete the 3rd node from the end
        // display(a); // Output: 100 13 4 12 10 (The modified linked list after deleting the 3rd node from the end)
        a = deleteNthFromEnd(a, 6); // Delete the 6th node from the end (which is the head node in this case)
        display(a); // Output: 13 4 12 10 (The modified linked list after deleting the head node)
    }
}
