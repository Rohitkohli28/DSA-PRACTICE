import java.util.Stack;
import java.util.*;

public class removeConsecutiveSubsequences {

    public static int[] remove(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.size() == 0 || st.peek() != arr[i])
                st.push((arr[i]));
            if (arr[i] == st.peek()) {
                //if (arr[i] == arr[i + 1]) {
                if (i == n - 1 || arr[i] != arr[i + 1]) st.pop();
            }
        }
        int[] result = new int[st.size()];
        int m = result.length;
        for (int i = m - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 10, 4, 5, 5, 6};
        int[] result = remove(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

