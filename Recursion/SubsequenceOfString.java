package Recursion;

public class SubsequenceOfString {

    static void subSequence(String str, String result){
        // Base case
        if(str.length() == 0){ // If the string is empty, we have reached the end of the string, we print the result and return
            System.out.println(result + " "); // We have reached the end of the string, we print the result and return
            return;
        }
        // Not take it
        subSequence(str.substring(1), result + str.charAt(0)); // Include the first character in the result
        subSequence(str.substring(1), result); // Exclude the first character from the result
    }

    // Time complexity: O(2^n) where n is the length of the string, because we have two choices for each character (include or exclude)

    public static void main(String[] args) {
        subSequence("abc", "");
    }
}
