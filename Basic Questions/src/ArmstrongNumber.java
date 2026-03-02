public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 151;
        int copy = num;
        int count = 0;
        int sum = 0;
        // Count digit
        while (copy != 0) {
            count++;
            copy = copy / 10; // Make number small
            System.out.println(count);
            copy = num;
            while (copy != 0) {
                int digit = copy % 10;
                sum = sum + (int) Math.pow(digit, count);
                copy = copy / 10;
            }
            System.out.print(num == sum ? "Armstrong Number" : "Not an Armstrong Number");
        }
    }
}
