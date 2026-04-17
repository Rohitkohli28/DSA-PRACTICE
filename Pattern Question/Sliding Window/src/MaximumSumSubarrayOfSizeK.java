public class MaximumSumSubarrayOfSizeK {

    public static int MaxSumSubarray(int nums[], int k) {
        int sum = 0;
        for(int i=0; i < k; i++){
            sum += nums[i];
        }

        int maxSum = sum;
        for(int i=k; i < nums.length; i++){
            sum += nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
        public static void main(String[] args) {
        int[] nums = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(MaxSumSubarray(nums, k)); // Output: 39
    }
}
