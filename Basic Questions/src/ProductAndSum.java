import java.util.Scanner;

public class ProductAndSum {

    // Method to subtract product and sum of digits
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int result = subtractProductAndSum(n);

        System.out.println("Output: " + result);

        sc.close();
    }
}