package Recursion;

public class PrintTable {

    static void printTable2(int num, int value) {
        if(value > 10) {
            return;
        }
        System.out.println(num + " x " + value + " = " + (num * value));
        printTable2(num, 1) ; // Start printing from 1

    }
    static void printTable(int num, int value) {
        // Base case: If the value exceeds 10, we stop printing
        if (value > 10) {
            return;
        }
        System.out.println(num + " x " + value + " = " + (num * value)); // Print the current multiplication
        printTable(num, value + 1); // Recursive call with the next value
    }
    public static void main(String[] args) {
        int num = 5; // Example number for which we want to print the multiplication table
        printTable(num, 1); // Start printing from 1
    }
}
