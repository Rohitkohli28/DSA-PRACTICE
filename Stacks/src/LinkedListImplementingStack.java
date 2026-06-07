public class LinkedListImplementingStack {

    public static class Node { // User Defined data type
        int data;
        Node next;

        public Node(int data) { // Constructor to initialize the data and next pointer
            this.data = data;
            this.next = null;
        }
    }

    public static class LLStack { // // User Defined data structure
        Node head = null;
        private int size = 0;

        public void push(int data) {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            size++;
        }

        public int pop() {
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            size--;
            return top;
        }

        int peek() {
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size(){ // Getter method to return the size of the stack
            return size;
        }

        boolean isEmpty(){ // Method to check if the stack is empty
            return size == 0;
        }
    }

    public static void main(String[] args) {
        LLStack stack = new LLStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
