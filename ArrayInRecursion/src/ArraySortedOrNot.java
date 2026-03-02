public class ArraySortedOrNot {

    // Time Complexity: O(n)
    // Space Complexity: O(n) -> due to recursive stack space

    public static boolean isSorted(int[] arr, int index){
        // Base Case
        if(index == arr.length-1) {
            return true;
        }
        if(arr[index] > arr[index+1]) {
            return false;
        }
        // Smallest Problem
        return isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(isSorted(arr, 0) ? "Sorted" : "Not Sorted");
    }
}
