public class RangeSumQuery {


    private int[] prefix;
    public RangeSumQuery(int[] nums) {
        prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }
    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        RangeSumQuery rsq = new RangeSumQuery(nums);
        System.out.println(rsq.sumRange(0, 2)); // Output: 6
        System.out.println(rsq.sumRange(1, 3)); // Output: 9
    }
}
