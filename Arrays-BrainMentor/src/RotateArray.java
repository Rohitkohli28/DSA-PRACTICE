public class RotateArray {

    public static void rotateArray(int[] arr, int k) {
        k = k % arr.length; // Handle cases where k is greater than array length
        reverse(arr, 0, arr.length - 1); // Reverse the entire array
        reverse(arr, 0, k - 1); // Reverse the first k elements
        reverse(arr, k, arr.length - 1); // Reverse the remaining elements
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
