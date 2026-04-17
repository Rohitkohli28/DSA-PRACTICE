public class InsertionSort {

    // Insertion Sort is a simple sorting algorithm that builds the sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. However, it has several advantages, such as simple implementation, efficient for small data sets, and stable (does not change the relative order of equal elements).
    static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i=1; i<n; i++){ // Start from the second element (index 1) and iterate through the array
            int key = arr[i];
            int j = i-1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key; // Place the key in its correct position
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
