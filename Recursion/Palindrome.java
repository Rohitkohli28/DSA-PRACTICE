public class Palindrome {
    static int isPalindrome(int num, int rev){ //
        if(num == 0){ // base case
            System.out.println(rev); 
            return rev; 
        }  
        return isPalindrome(num / 10, rev * 10 + num % 10); // recursive call 
    }


    public static void main(String[] args) {
        int num = 154;
        isPalindrome(num, 0);
    } 
}
