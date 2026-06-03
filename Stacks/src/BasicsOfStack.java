// package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class BasicsOfStack {

    public static void main(String[] args) {
        // int[] arr = new int[5];
        // ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        System.out.println("Size of stack: " + st.size());
        System.out.println(st.isEmpty());
        System.out.println(st);
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        System.out.println(st.isEmpty() );

        // peek
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("Size of stack: " + st.size());

        // This is stack problem
        while(st.size() > 1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}
