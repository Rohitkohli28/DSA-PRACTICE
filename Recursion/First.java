// package Recursion;

/*
what is recursion?
Recursion is a programming technique where a method calls itself in order to solve a problem. It typically involves a base case to terminate the recursive calls and a recursive case that breaks the problem down into smaller subproblems.
// 
 */

public class First {

    public static void show(int num){

        // Basecase -- to stop the recursion
        if (num == 0) {
            return;
        }
        System.out.println("amit");
        show(num - 1); // Function calling itself(form infinite loop/ recursion)
    }

    public static void main(String[] args) {
        show(5);
    }
    
}
