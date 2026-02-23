public class MaxArray {

    static void maxInArray(int arr[], int index, int max){
        if (arr.length == index) {
            System.out.println("Max: " + max);
            return;
        }
        if(arr[index] > max){
            max = arr[index];
        }
        maxInArray(arr, index+1, max);
    }

    // static int maxInArray(int arr[], int index){
    //     return -1;
    // }

    public static void main(String[] args) {
        int arr[] = {2,4,8,5,9};
        maxInArray(arr, 0, 0);
    }

}
