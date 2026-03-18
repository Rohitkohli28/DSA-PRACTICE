package Recursion;

public class RemoveConsecutiveDuplicates {

    static String removeConsDup(String str) {

        // Base Case
        if(str.length() <= 1) {
            return str;
        }
        if(str.charAt(0) == str.charAt(1)) {
            return removeConsDup(str.substring(1));
        } else {
            return str.charAt(0) + removeConsDup(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String r = removeConsDup("aaabbccdee");
        System.out.println(r);
    }
}
