public class QueueImplementationWithLinkedList {

    public static class Node {  // User defined data type
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class queueLL{
        Node head = null; // index of the front element
        Node tail = null; // index of the rear element
        int size = 0; // size of the queue

        public void add(int val){
            Node temp = new Node(val); // create a new node with the given value
            if(size == 0){ // if the queue is empty
                head = temp; // set head to the new node
                tail = temp; // set tail to the new node
            } else {
                tail.next = temp; // set the next of the current tail to the new node
                tail = temp; // set tail to the new node
            }
            size++; // increase size of the queue
        }

        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            int val = head.data; // get the value of the front element
            head = head.next; // move head to the next node
            size--; // decrease size of the queue
            return val; // return the removed element
        }

        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data; // return the value of the front element
        }

        public boolean isEmpty(){
            if(size == 0){
                return true;
            }
            return false;
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head; // start from the head
            while(temp != null){ // loop until the end of the queue
                System.out.print(temp.data + " "); // print the value of the current node
                temp = temp.next; // move to the next node
            }
            System.out.println();
        } 
    }

    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.peek()); // 1
        System.out.println(q.remove()); // 1
        System.out.println(q.peek()); // 2
    }
}
