import java.util.Stack;

public class prevSmallerElem {

    public int[] previousSmallerElement(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            pse[i] = st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);
        }

        return pse;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8 };
        prevSmallerElem obj = new prevSmallerElem();
        int[] res = obj.previousSmallerElement(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
