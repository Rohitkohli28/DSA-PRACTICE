package Recursion;

// Time Complexity: O(n) where n is the range of numbers to count
// Space Complexity: O(n) due to the recursive call stack, which can go up to n in the worst case


// Main logic is to check if the current number is even or odd and then make a recursive call with the next number until we reach 0. In the first method, we return the count of even numbers, while in the second method, we keep track of both even and odd counts using parameters and print them when we reach the base case.

public class CountEvenAndOdd {
     static int[] countEvenOdd(int range) {
         // Base Case
            if(range == 0) {
                int result[] = new int[2]; // Create an array to store the counts
                // result[0] will store count of even numbers and result[1] will store count of odd numbers
                return result;

            }
         //  Small Problem
         int result[] = countEvenOdd(range - 1);

            // Logic (Stack building)
            if(range % 2 == 0) {
                result[0]++; // Increment count of even numbers
            } else {
                result[1]++; // Increment count of odd numbers
            }
            return result;

     }

    static void countEvenOdd(int range, int even, int odd) {
        // Smallest Problem
        if(range == 0){
            System.out.println("Even: " + even);
            System.out.println("Odd: " + odd);
            return;
        }
        // Logic (Stack building)
        if(range % 2 == 0) {
            even++;
        } else {
            odd++;
        }
        countEvenOdd(range -1, even, odd);
    }

    public static void main(String[] args) {
        countEvenOdd(11, 0, 0);
        int arr[] = countEvenOdd(17);
        System.out.println("Even: " + arr[0]);
        System.out.println("Odd: " + arr[1]);
    }
}
