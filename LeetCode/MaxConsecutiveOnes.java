package LeetCode;// ackage LeetCode;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return Math.max(maxCount, count);
    } 
    public static void main(String[] args) {
        MaxConsecutiveOnes m = new MaxConsecutiveOnes();
        int nums[] = {1,1,0,1,1,1};
        System.out.println(m.findMaxConsecutiveOnes(nums));
    } 
}
