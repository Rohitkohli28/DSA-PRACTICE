package Recursion;

public class ReverseString {

    static String reverse(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        String ans = reverse(str.substring(1));
        return ans + ch;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverse(str));
    }
}
