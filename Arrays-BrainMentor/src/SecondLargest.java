public class SecondLargest {

    public static int getSecondLargest(int[] arr){
         int firstLargest = -1; // Initialize first largest to -1
            int secondLargest = -1; // Initialize second largest to -1

        for(int i : arr){
            if(i > firstLargest){ // If the current element is greater than the first largest, then update both first and second largest
                secondLargest = firstLargest; // If the current element is greater than the first largest, then update the second largest to be the first largest
                firstLargest = i;
            } else if(i != firstLargest && i > secondLargest) { // If the current element is less than the first largest and greater than the second largest, then update the second largest
                secondLargest = i; // If the current element is less than the first largest and greater than the second largest, then update the second largest to be the current element
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
}
