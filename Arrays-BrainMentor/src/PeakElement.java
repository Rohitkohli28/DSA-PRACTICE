public class PeakElement {

    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid; // Peak is in the left half
            } else {
                left = mid + 1; // Peak is in the right half
            }
        }
        return left; // or right, both are the same at this point
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(findPeakElement(nums)); // Output: 2
    }
}
