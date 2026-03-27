package Recursion;

public class SafeBinaryGenerator {

    static void safeBinaryGenerator(int n, String current) {
        // Base case
        if (current.length() == n) {
            System.out.println(current);
            return;
        }

        // Always add '0'
        safeBinaryGenerator(n, current + "0");

        // Add '1' only if last char is not '1'
        if (current.length() == 0 || current.charAt(current.length() - 1) != '1') {
            safeBinaryGenerator(n, current + "1");
        }
    }

    public static void main(String[] args) {
        safeBinaryGenerator(3, "");
    }
}
