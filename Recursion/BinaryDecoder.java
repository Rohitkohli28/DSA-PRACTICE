package Recursion;

public class BinaryDecoder {

    public static long binaryToDecimal(long n){
        // Base case
        if(n == 0){
            return 0;
        }
        // Recursive case
        long lastDigit = n % 10; // Get the last digit of the binary number
        long remainingDigits = n / 10; // Get the remaining digits of the binary number
        return lastDigit + 2 * binaryToDecimal(remainingDigits); // The decimal value
    }

    public static void main(String[] args) {
        String binaryString = "111";
        long binaryNumber = Long.parseLong(binaryString);
        long decimalNumber = binaryToDecimal(binaryNumber);
        System.out.println("Binary: " + binaryString + " -> Decimal: " + decimalNumber);
    }
}
