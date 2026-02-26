package Recursion;

public class ArmStrongNumber {

    static int countDigits(int num) {
        if (num == 0) {
            return 0;
        }
        // Small problem: Count the digits of the number by dividing it by 10 until it becomes 0
        int count = countDigits(num / 10);
        return count + 1; // Big problem: Add 1 for the current digit
    }

    /*
    An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits. For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
    1. Digit count: First, we need to determine the number of digits in the given number. This can be done by converting the number to a string and getting its length or by using a loop to count the digits.
    2. Sum of powers: Next, we need to calculate the sum of each digit raised to the power of the number of digits. This can be done by extracting each digit from the number, raising it to the power of the digit count, and adding it to a running total.
    3. Comparison: Finally, we compare the calculated sum with the original number. If they are equal, the number is an Armstrong number; otherwise, it is not.

     */
    static void computeArmStrongNumber(int num, int sum, int copy) {

        // Base case: If the number becomes 0, we can check if the sum is equal to the original number (copy)
        if (num == 0) {
            if(sum == copy) {
                System.out.println(copy + " is an Armstrong number.");
            } else {
                System.out.println(copy + " is not an Armstrong number.");
            }
            return;
        }
        int count = countDigits(num);
        int digit = num % 10; // Get the last digit
        int result = (int) Math.pow(digit, count); // Raise the digit to the power of the count
        sum += result; // Add the result to the sum
        computeArmStrongNumber(num/10, sum, copy); // Recursive call with the remaining number


    }

    public static void main(String[] args) {
        int num = 153; // Example number
        computeArmStrongNumber(num, 0, num); // Start with sum = 0 and copy = num
    }
}


