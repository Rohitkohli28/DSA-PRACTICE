import java.util.Stack;

public class DisplayStack {

    public static void displayRec(Stack<Integer> st) {
        if (st.isEmpty()) {
            return; // Base case: If the stack is empty, return
        }
        int x = st.pop(); // Pop the top element
        System.out.print(x + " "); // Display the popped element
        displayRec(st); // Recursive call to display the remaining stack
        st.push(x); // Push the popped element back onto the stack
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original stack: " + st);
        System.out.println("Stack elements: ");
        displayRec(st); // Display the stack elements using recursion
        System.out.println("\nOriginal stack after displaying: " + st); // The original stack

//        Stack<Integer> rt = new Stack<>();
//        while(st.size() > 0){
//            rt.push(st.pop());
//        }
//        while(rt.size() > 0){
//            int x = rt.pop();
//            System.out.print(x + " ");
//            st.push(x);
//        }
//         System.out.println("\nOriginal stack after displaying: " + st);

//        int n = st.size();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = st.pop();
//        }
//        for(int i = n - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//            st.push(arr[i]);
//        }
    }
}
