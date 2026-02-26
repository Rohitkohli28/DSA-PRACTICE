package Recursion;

public class SumOfDigit {

    static int sumOfDigit(int num) {
        if(num == 0) {
            return 0;
        }
        int digit = num % 10;

        return digit + sumOfDigit(num/10);
    }
    static void sumOfDigit(int num, int sum) {
        if(num == 0) {
            System.out.println(sum);
            return;
        }
        int digit = num % 10;

        sum = sum + digit;
        sumOfDigit(num/10, sum);
        }
    public static void main(String[] args) {
        sumOfDigit(123, 0);
        System.out.println("amit");
        System.out.println(sumOfDigit(123));
    }
}
