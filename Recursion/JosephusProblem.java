package Recursion;

public class JosephusProblem {

    static int josephus(int n, int k){
        // Base case
        if(n == 1){ // If there is only one person left, that person is the survivor
            return 0; // Return the index of the survivor (0-based index)
        }
        // Recursive case -- Main logic
        return (josephus(n - 1, k) + k) % n; // The survivor's position in the current circle is the survivor's position in the smaller circle plus k, modulo n to wrap around the circle
    }

    public static void main(String[] args) {
        int n = 5; // Number of people in the circle
        int k = 2; // Step count for elimination
        int survivor = josephus(n, k); // Get the index of the survivor
        System.out.println("The survivor is at position: " + survivor); // Print the position of the survivor (0-based index)
    }
}
