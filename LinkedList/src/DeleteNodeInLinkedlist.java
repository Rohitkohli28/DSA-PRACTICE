public class DeleteNodeInLinkedlist {

    public static class ListNode {
        int val; // Value stored in the node
        ListNode next; // Reference to the next node in the list

        ListNode(int val) { // Constructor to initialize the node with a value
            this.val = val; // Set the value for the node
            this.next = null; // Initialize next to null
        }
    }

    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return; // Cannot delete the node if it's null or the last node
        }
        node.val = node.next.val; // Copy the value of the next node to the current node
        node.next = node.next.next; // Link the current node to the node after the next node, effectively removing the next node from the list
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        DeleteNodeInLinkedlist solution = new DeleteNodeInLinkedlist();
        solution.deleteNode(head.next); // Deleting the node with value 5

        // Print the modified linked list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " "); // Output: 4 1 9
            current = current.next;
        }
    }
}
