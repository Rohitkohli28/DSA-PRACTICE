import java.util.Stack;
public class RemoveFromBottom {

    public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);
            System.out.println("Original stack: " + st);

            Stack<Integer> temp = new Stack<>();
            while(st.size() > 1){ // Pop elements until we reach the bottom element
                temp.push(st.pop()); // Pop the top element and push it onto the temporary stack
            }
            int removedElement = st.pop(); // Remove the bottom element
            System.out.println("Removed element from bottom: " + removedElement);
            while (temp.size() > 0){
                st.push(temp.pop()); // Push the elements back onto the original stack
            }
            System.out.println("Stack after removing from bottom: " + st);
    }
}
