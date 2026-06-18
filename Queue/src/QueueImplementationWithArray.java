public class QueueImplementationWithArray {

    public static class queueA{
        int arr[] = new int[5];
        int front = -1; // index of the front element
        int rear = -1; // index of the rear element
        int size = 0; // size of the queue

        public void add(int val){
            if(rear == arr.length - 1){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){ // first element to be added
                front = 0; // set front to 0
                rear = 0; // set rear to 0
                arr[rear] = val; // add element at rear
            } else {
                arr[rear + 1] = val; // add element at rear + 1
                rear++; // move rear to the next position
            }
            size++; // increase size of the queue
        }

        public int remove(){
            if(size == 0){ // queue is empty
                System.out.println("Queue is empty");
                return -1;
            }
            front++; // move front to the next position
            size--; // decrease size of the queue
            return arr[front - 1]; // return the removed element
        }

        public int peek(){
            if (size == 0){ // queue is empty
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front]; // return the front element
        }

        public boolean isEmpty(){
            if(size == 0) {
                return true;
            }
            return false;
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is empty");
                return;
            }
            for(int i=front; i<=rear; i++){ // loop from front to rear
                System.out.print(arr[i] + " "); // print the elements in the queue
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueA q = new queueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println(q.remove());
        System.out.println(q.peek());
        q.display();
    }
}
