import java.util.Arrays;
import java.util.Stack;

public class nextSmallerElem {

    public int[] nextSmallerElement(int[] arr){
        int n = arr.length;
        int[] nse = new int[n];

        Arrays.fill(nse, -1); // Fill the result array with -1 by default

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                int idx = st.pop();
                nse[idx] = arr[i];
            }
            st.push(i);
        }
        return nse;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        nextSmallerElem obj = new nextSmallerElem();
        int[] res = obj.nextSmallerElement(arr);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
