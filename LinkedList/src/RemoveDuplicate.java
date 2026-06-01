public class RemoveDuplicate {

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static Node removeDuplicate(Node head){
        Node current = head;

        while(current != null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
    }
}
