public class RemoveDuplicate {

    public static int removeDuplicates(int[] nums){
        int i = 0; // pointer to keep track of the position of the last unique element
        for(int j=1; j<nums.length; j++){ // pointer to iterate through the array starting from the second element
            if(nums[j] != nums[i]){ // if the current element is not equal to the last unique element
                i++; // move the pointer to the next position
                nums[i] = nums[j]; // update the position of the last unique element with the current element
            }
        }
        return i+1; // return the number of unique elements in the array, which is the index of the last unique element + 1
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums)); // Output: 5
    }
}
