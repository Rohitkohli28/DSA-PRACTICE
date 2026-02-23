package LeetCode;// package LeetCode;

public class EvenNumberOfDigits {

    public static int findNumbers(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(Integer.toString(nums[i]).length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1897, 345, 20, 6, 7989};
        System.out.println(findNumbers(nums));

    }
}
