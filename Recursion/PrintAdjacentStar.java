package Recursion;

public class PrintAdjacentStar {

    static String adjustStar(String str) {
        // Base Case
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
                return str.charAt(0) + "*" + adjustStar(str.substring(1));
        } else {
                return str.charAt(0) + adjustStar(str.substring(1));
            }
    }
    public static void main (String[]args){
            String r = adjustStar("aabb");
            System.out.println(r);
        }
    }