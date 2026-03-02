package Recursion;

public class MinMaxDemo {
    static int[] getMinMax(int arr[], int index){
        // Base case
        if(arr.length == index){ // if index is out of bound, then return default value of min and max
            int r[] = new int[2]; // r[0] = min, r[1] = max
            r[0] = Integer.MAX_VALUE; // initialize min to maximum value of int
            r[1] = Integer.MIN_VALUE; // initialize max to minimum value of int
            return r; // default value of int is 0, so r[0] = 0 and r[1] = 0
        }
        // Small problem
        int result[] = getMinMax(arr, index+1); // get the min and max of the rest of the array

        // Min element
        if(result[0] > arr[index]){ // if the min element of the rest of the array is greater than the current element, then update the min element
             result[0] = arr[index];
        }

        // Max element
        else if(result[1] < arr[index]){ // if the max element of the rest of the array is less than the current element, then update the max element
            result[1] = arr[index];
        }
        return result; // return the min and max of the array
    }

    public static void main(String[] args) {
        int arr[]  = {10,90,20,80,30,70,40,60,50};
        int result[] = getMinMax(arr, 0);
        System.out.println("Min: "+result[0] + " Max: "+result[1]);
    }
}
