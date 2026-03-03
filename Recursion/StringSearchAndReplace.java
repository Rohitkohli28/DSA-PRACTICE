package Recursion;

public class StringSearchAndReplace {

    static String searchAndReplace(String str, char search, char replace) {
        // Base Case
        if (str.isEmpty()) {
            return "";
        }
        // Small Problem
        String r = searchAndReplace(str.substring(1), search, replace);
        if (str.charAt(0) == search) {
            return replace + r;
        } else {
            return str.charAt(0) + r;
        }
    }
    public static void main(String[] args) {
        String r = searchAndReplace("hello", 'o', 'x');
        System.out.println(r);
    }
}
