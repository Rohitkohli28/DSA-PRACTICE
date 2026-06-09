import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement2 {

    public int[] nextGreaterElement(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];

        Arrays.fill(nge, -1);

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                int idx = st.pop();
                nge[idx] = arr[i];
            }
            st.push(i);
        }
        return nge;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        nextGreaterElement2 obj = new nextGreaterElement2();
        int[] res = obj.nextGreaterElement(arr);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
