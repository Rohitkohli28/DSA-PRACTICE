public class ArraySorting {
    public static void main(String[] args) {
        int arr[] = {10, 5, 30, 20, 40};
        // Bubble Sort
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // Print the sorted array
        for(int x : arr) {
            System.out.println(x);
        }
    }
}
