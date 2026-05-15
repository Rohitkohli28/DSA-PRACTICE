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

        void deleteAt(int idx){
            Node temp = head;
            if(idx == size()){
                System.out.println("Invalid index"); // Print an error message for invalid index
                return; // Exit the function for invalid index
            } else if (idx == 0){
                head = head.next; // Update the head reference to point to the next node, effectively removing the current head from the list
            } else if(idx < 0 || idx > size()){
                System.out.println("Invalid index"); // Print an error message for invalid index
                return; // Exit the function for invalid index
            }
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next; // Link the current node (temp) to the node after the next node, effectively removing the next node from the list
        }

        void display(){
            Node temp = head; // Start from the head of the list
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size(){
            Node temp = head;
            int count = 0; // Initialize count to 0
            while(temp != null){
                count++; // Increment count for each node encountered
                temp = temp.next; // Move to the next node
            }
            return count; // Return the total count of nodes in the linked list
        }
    }
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.display(); // Output: 5 10 15
        System.out.println(); // Print a new line for better readability
        System.out.println(list.size()); // Output: 3
        list.insertAtEnd(20);
        list.display(); // Output: 5 10 15 20
        list.deleteAt(2); // Delete the node at index 2 (0-based index)
        System.out.println(); // Print a new line for better readability
        list.display(); // Output: 5 10 20
    }
}
