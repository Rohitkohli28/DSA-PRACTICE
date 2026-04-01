public class MoveZeroes {

    public static void moveZeroes(int[] nums){
        int i = 0; // Pointer for the position of the next non-zero element
        for(int j=0; j< nums.length; j++){ // Pointer for iterating through the array
            if(nums[j] != 0){ // If the current element is non-zero, swap it with the element at index i
                int temp = nums[i]; // Swap the current element with the next non-zero element
                nums[i] = nums[j];
                nums[j] = temp;
                i++; // Move the pointer to the next position for non-zero element
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
