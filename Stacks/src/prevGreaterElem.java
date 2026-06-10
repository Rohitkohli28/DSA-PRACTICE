import java.util.Stack;

public class prevGreaterElem {

    public int[] previousGreaterElement(int[] arr) {
        int n = arr.length;
        int[] pge = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            pge[i] = st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);
        }

        return pge;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8 };
        prevGreaterElem obj = new prevGreaterElem();
        int[] res = obj.previousGreaterElement(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
