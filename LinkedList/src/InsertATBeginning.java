public class InsertATBeginning {

     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0; // Initialize size to 0
        void insertAtEnd(int val) {
            Node temp = new Node(val); // Create a new node with the given data
            if(head == null){
                head = temp; // If the list is empty, set head to the new node
                tail = temp; // If the list is empty, set tail to the new node
            } else {
                tail.next = temp; // Link the current tail node to the new node (temp)
                tail = temp; // Update the tail reference to point to the new node (temp)
                size++; // Increment size for each new node added at the end
            }
        }
        void insertAtBeginning(int val) {
            Node temp = new Node(val); // Create a new node with the given data
            if(head == null){
                // head = temp = tail; // If the list is empty, set both head and tail to the new node
                insertAtEnd(val); // If the list is empty, we can simply call insertAtEnd to add the new node
            } else {
                temp.next = head; // Link the new node to the current head of the list
                head = temp; // Update the head reference to point to the new node
                size++; // Increment size for each new node added at the beginning
            }
        }
        void insertAt(int idx, int val){
            Node t = new Node(val); // Create a new node with the given data
            Node temp = head; // Start from the head of the list
            if(idx == size){ // If the index is equal to the size of the list, we can simply call insertAtEnd to add the new node at the end
                insertAtEnd(val);
                return; // Exit the function after inserting at the end
            } else if (idx == 0){ // If the index is 0, we can simply call insertAtBeginning to add the new node at the beginning
                insertAtBeginning(val);
                return; // Exit the function after inserting at the beginning
            } else if(idx < 0 || idx > size){ // Check if the index is out of bounds (negative or greater than the size of the list)
                System.out.println("Invalid index"); // Print an error message for invalid index
                return; // Exit the function for invalid index
            }
            for(int i=1; i<=idx-1; i++){ // Traverse the list until we reach the node just before the desired index
                temp = temp.next; // Move to the next node until we reach the desired index
            }
            t.next = temp.next; // Link the new node to the next node of the current node (temp)
            temp.next = t; // Link the current node (temp) to the new node (t)
            size++; // Increment size for each new node added at the specified index
        }

        int getAt(int idx){
            Node temp = head; // Start from the head of the list
            if(idx < 0 || idx >= size){ // Check if the index is out of bounds (negative or greater than or equal to the size of the list)
                System.out.println("Invalid index"); // Print an error message for invalid index
                return -1; // Return -1 for invalid index
            }
            for(int i=1; i<=idx; i++){ // Traverse the list until we reach the desired index
                temp = temp.next; // Move to the next node until we reach the desired index
            }
            return temp.data; // Return the data of the node at the desired index
        }

//        int size(){ // 0(n) time complexity, since we need to traverse the entire list to count the number of nodes
////            Node temp = head; // Start from the head of the list
////            int count = 0; // Initialize count to 0
////            while(temp != null){
////                count++; // Increment count for each node encountered
////                temp = temp.next; // Move to the next node
////            }
////            return count; // Return the total count of nodes in the linked list
//            return size; // Return the size of the linked list, which is maintained as nodes are added or removed
//        }

        void display() {
            Node temp = head; // Start from the head of the list
            while (temp != null) {
                System.out.print(temp.data + " "); // Print the data of each node followed by an arrow
                temp = temp.next; // Move to the next node
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.display(); // Output: 30 -> 20 -> 10 -> null
        System.out.println(); // Print a new line for better readability
       // list.insertAt(4, 25); // Insert 25 at index 2 (0-based index)
        list.display(); // Output: 30 -> 20 -> 25 -> 10 -> null
        System.out.println(); // Print a new line for better readability
        // System.out.println(list.tail.data); // Output: 25 (Data of the node at index 2)
        //list.insertAt(0, 5); // Insert 5 at index 0 (0-based index)
        list.display(); // Output: 5 -> 30 -> 20 -> 25 -> 10 -> null
        System.out.println(list.getAt(3)); // Output: 25 (Data of the node at index 3)
        System.out.println(list.size); // Output: 5 (Size of the linked list)
    }
}
