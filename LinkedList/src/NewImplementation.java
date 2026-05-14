public class NewImplementation {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;
        public void insertAtEnd(int val){
            Node temp = new Node(val);
//            tail.next = temp; // Link the current tail node to the new node (temp)
//            tail = temp; // Update the tail reference to point to the new node (temp)
            if(head == null){
                head = temp; // If the list is empty, set head to the new node (temp)
               // tail = temp; // If the list is empty, set tail to the new node (temp)
            } else {
                tail.next = temp; // Link the current tail node to the new node (temp)
                // tail = temp; // Update the tail reference to point to the new node (temp)
            }
            tail = temp; // Update the tail reference to point to the new node (temp)
        }

        void display(){
            Node temp = head; // Start from the head of the list
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.display(); // Output: 5 10 15
    }
}
