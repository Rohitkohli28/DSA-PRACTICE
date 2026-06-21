import java.util.*;

public class FirstNegativeInWindow {

    public static List<Long> firstNegative(long[] arr, int k) {
        List<Long> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        int n = arr.length;

        // Process first window
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                q.offer(i);
            }
        }

        // Store answer for first window
        result.add(q.isEmpty() ? 0 : arr[q.peek()]);

        // Process remaining windows
        for (int i = k; i < n; i++) {

            // Remove elements outside current window
            while (!q.isEmpty() && q.peek() <= i - k) {
                q.poll();
            }

            // Add current negative element
            if (arr[i] < 0) {
                q.offer(i);
            }

            // First negative of current window
            result.add(q.isEmpty() ? 0 : arr[q.peek()]);
        }

        return result;
    }

    public static void main(String[] args) {
        long[] arr = {-8, 2, 3, -6, 10};
        int k = 2;

        List<Long> ans = firstNegative(arr, k);

        for (long x : ans) {
            System.out.print(x + " ");
        }
    }
}