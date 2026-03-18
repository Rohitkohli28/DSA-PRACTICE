package Recursion;

public class TreeRecursion {
    static void fun(int num){
        // Base Case
        if(num <= 0){
            return;
        }
        System.out.println("Pre call: " + num);
        fun(num-1); // Recursive Call 1
        System.out.println("In between call: " + num);
        fun(num-2); // Recursive Call 2
        System.out.println("Post call: " + num);
    }
    public static void main(String[] args) {
        fun(3);
    }
}
