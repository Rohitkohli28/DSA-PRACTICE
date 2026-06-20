import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstK {

    public static void reverseFirstK(Queue<Integer>q, int k){
        if(q == null || q.isEmpty() || k <= 0 || k > q.size()){
            return;
        }

        Stack<Integer> st = new Stack<>();

        // Push first k element into stack
        for (int i = 0; i < k; i++){
            st.push(q.remove());
        }

        // Add reverse element back to queue
        while(!st.isEmpty()){
            q.add(st.pop());
        }

        // Move Remaining element to the back
        int remaining = q.size() - k;
        for(int i = 0; i < remaining; i++){
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        int k = 3;

        reverseFirstK(q, k);
        System.out.println(q);
    }
}
