// package LeetCode;

// 283 LeetCode
public class MovesZeros {
    public static void movesZeroes(int[] nums){
        int j = 0;

        for(int i=0; i<nums.length; i = i + 1){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        while(j < nums.length){
            nums[j] = 0;
            j++;
        }
    }
    public static void main(String[] args) {
      int nums[] = {0,1,0,3,12};
        movesZeroes(nums);
        for(int i=0; i<nums.length; i = i + 1){
            System.out.print(nums[i] + " ");
        }   
    }
}
