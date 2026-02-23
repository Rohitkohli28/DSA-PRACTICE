public class Palindrome {

        public boolean isPalindrome(int x) {

            // negative numbers are not palindrome
            if (x < 0) {
                return false;
            }

            int original = x;
            long reverse = 0;   //  change int → long

            while (x > 0) {
                int digit = x % 10;
                reverse = reverse * 10 + digit;
                x = x / 10;
            }

            return original == reverse;
        }

    public static void main(String[] args) {
        int x = 121;
        Palindrome sol = new Palindrome();
        System.out.println(sol.isPalindrome(x));
    }
    }

