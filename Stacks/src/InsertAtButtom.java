import java.util.Stack;
public class InsertAtButtom {

//    public static void insertAtBottom(Stack<Integer> st, int x) {
//        if (st.isEmpty()) {
//            st.push(x); // If the stack is empty, push the element at the bottom
//            return;
//        }
//        int top = st.pop(); // Pop the top element
//        insertAtBottom(st, x); // Recursively call to insert at the bottom
//        st.push(top); // Push the popped element back on top
//    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original stack: " + st);
//
//        insertAtBottom(st, 0); // Insert 0 at the bottom of the stack
//        System.out.println("Stack after inserting at bottom: " + st);

        int idx = 2;
        int x = 7;
        Stack<Integer> temp = new Stack<>();
        while(st.size() > idx){ // Pop elements until we reach the desired index
            temp.push(st.pop()); // Pop the top element and push it onto the temporary stack
        }
        st.push(x);
        while (temp.size() > 0){
            st.push(temp.pop());
        }
        System.out.println("Stack after inserting at index " + idx + ": " + st);
    }
}
