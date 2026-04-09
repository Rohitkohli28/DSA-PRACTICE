public class FirstPivotElement {

    public static int findPivotIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (leftSum == totalSum - leftSum - arr[i]) {
                return i; // Pivot index found
            }
            leftSum += arr[i];
        }
        return -1; // No pivot index found
    }
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int pivotIndex = findPivotIndex(arr);
        System.out.println("Pivot Index: " + pivotIndex); // Output: Pivot Index: 3
    }
}
