import java.util.Arrays;

public class FindTheDifference {

    public char findTheDifference(String s, String t) {

        // Brute force approach: Sort both strings and compare character by character
//        char[] a = s.toCharArray();
//        char[] b = t.toCharArray();
//
//        Arrays.sort(a);
//        Arrays.sort(b);
//
//        for(int i=0; i<a.length; i++){
//            if(a[i] != b[i]){
//                return b[i];
//            }
//        }
//        return b[b.length - 1];
//
        // Optimal approach: Use XOR to find the difference
         char result = 0;
         for(char c : s.toCharArray()){
             result ^= c;
         }
         for(char c : t.toCharArray()){
             result ^= c;
         }
         return result;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        FindTheDifference findTheDifference = new FindTheDifference();
        char result = findTheDifference.findTheDifference(s, t);
        System.out.println("The difference is: " + result);
    }
}
