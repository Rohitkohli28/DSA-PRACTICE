import java.util.Stack;

public class ArrayImplementingStack {

    public static class Stack {
        int[] arr = new int[5];
        private int idx = 0; // This variable keeps track of the current index for the top of the stack

        void push(int x){
            if(isFull()){ // Check if the stack is full before adding an element
                System.out.println("Stack is full!");
                return; // Exit the method if the stack is full
            }
            arr[idx] = x; // Add the element to the top of the stack
            idx++; // Increment the index to point to the next empty position
        }

        int peek(){
            if(idx == 0){ // Check if the stack is empty before trying to peek
                System.out.println("Stack is empty!");
                return -1; // Return -1 to indicate an error or empty stack
            }
            return arr[idx-1]; // Return the top element without removing it
        }

        int pop(){
            if(idx == 0){
                System.out.println("Stack is empty!");
                return -1; // Return -1 to indicate an error or empty stack
            }
            int top = arr[idx-1]; // Get the top element
            arr[idx-1] = 0; // Optional: Clear the top element (not necessary for stack functionality)
            idx--; // Decrement the index to point to the top element
            return arr[idx]; // Return the top element and remove it from the stack
        }

        void display(){
            for(int i = 0; i < idx-1; i++){ // Loop through the stack elements from the bottom to the top
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size(){
            return idx; // Return the number of elements in the stack
        }

        boolean isEmpty(){
            if(idx == 0){
                return true; // Return true if the stack is empty
            } else {
                return false; // Return false if the stack is not empty
            }
        }

        boolean isFull(){
            if(idx == arr.length){ // Check if the index has reached the length of the array, indicating the stack is full
                return true; // Return true if the stack is full
            } else {
                return false; // Return false if the stack is not full
            }
        }

        int capacity(){
            return arr.length; // Return the total capacity of the stack
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.display(); // 1
        st.push(2);
        st.display(); // 1 2
        st.push(3);
        st.display(); // 1 2 3
        st.push(4);
        st.display(); // 1 2 3 4
        st.push(5);
        st.display(); //1 2 3 4 5
        System.out.println(st.size()); // 5
        // System.out.println(st.peek()); // 5
       // System.out.println(st.pop()); // 0

        // st.display(); // 1 2 3 4
        st.push(6); // Stack is full!
    }

}
