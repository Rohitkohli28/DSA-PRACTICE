public class DeleteMiddleElement{
    public static class ListNode {
        int val; // Value stored in the node
        ListNode next;
        ListNode() {}
        ListNode(int val) { // Constructor to initialize the node with a value
            this.val = val; // Set the value for the node
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow.next == null){
            return null;
        }
        slow.next = slow.next.next;
        return head;
    }
}

