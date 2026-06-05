import java.util.Stack;
public class ReverseStack {

    public static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return; // Base case: If the stack is empty, return
        }
        int x = st.pop(); // Pop the top element
        reverseStack(st); // Recursive call to reverse the remaining stack
        insertAtBottom(st, x); // Insert the popped element at the bottom of the stack
    }

    public static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x); // If the stack is empty, push the element at the bottom
            return;
        }
        int top = st.pop(); // Pop the top element
        insertAtBottom(st, x); // Recursively call to insert at the bottom
        st.push(top); // Push the popped element back on top
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original stack: " + st);

        // Approach 1: Using an auxiliary stack
//        Stack<Integer> rt = new Stack<>();
//        while(st.size() > 0){
//            rt.push(st.pop());
//        }
//        System.out.println("Reversed stack: " + rt);
//
//        Stack<Integer> qt = new Stack<>();
//        while(rt.size() > 0){
//            qt.push(rt.pop());
//    }
//        System.out.println("Original stack after reversing back: " + qt);
//
//        while(qt.size() > 0){
//            st.push(qt.pop());
//        }
//        System.out.println("Original stack after reversing back to original: " + st);

        // Approach 2: Using recursion
        reverseStack(st);
        System.out.println("Reversed stack: " + st);

    }
}
