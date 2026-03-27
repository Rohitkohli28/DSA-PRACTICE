package Recursion;

public class PermutationOfString {

    static void permutation(String str, String result){
        // Base case
        if(str.length() == 0){
            System.out.println(result);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            permutation(str.substring(0, i) + str.substring(i+1), result + str.charAt(i)); // We are taking the character at index i and adding it to the result, and then we are removing that character from the string and calling the function recursively with the new string and the new result
            System.out.println(result + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        permutation("abc", "");
    }
}
