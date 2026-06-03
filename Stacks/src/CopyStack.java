import java.util.Stack;
import java.util.Scanner;

public class CopyStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
//        int n;
//        System.out.println("Enter the number of elements : ");
//        n = sc.nextInt();
//        System.out.println("Enter the elements: ");
//        for(int i = 0; i < n; i++){
//            int x = sc.nextInt();
//            st.push(x);
//        }
//        System.out.println("Original stack: " + st);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original stack: " + st);

        // Reverse the stack
        Stack<Integer> gt = new Stack<>();
        while(st.size() > 0){ // While the original stack is not empty
            // int x = st.peek(); // Get the top element without removing it
            // rt.push(x); // Push the top element onto the new stack
            // st.pop(); // Remove the top element from the original stack
            gt.push(st.pop()); // Pop the top element from the original stack and push it onto the new stack
        }

        Stack<Integer> rt = new Stack<>();
        while(gt.size() > 0){
            rt.push(gt.pop());
        }
        System.out.println("Copy Stack: " + rt); // The original stack is now empty, and the new stack contains the elements in reverse order
    }
}
