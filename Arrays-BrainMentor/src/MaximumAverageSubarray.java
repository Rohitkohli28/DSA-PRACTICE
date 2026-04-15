public class MaximumAverageSubarray {

    public static double findMaxAverage(int[] nums, int k) {
        double maxAverage = Double.NEGATIVE_INFINITY;
        double currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (i >= k - 1) {
                maxAverage = Math.max(maxAverage, currentSum / k);
                currentSum -= nums[i - k + 1];
            }
        }
        return maxAverage;
    }
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k)); // Output: 12.75
    }
}
