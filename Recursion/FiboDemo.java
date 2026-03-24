package Recursion;

public class FiboDemo {


    static int fib(int num){
        // Base Case
        if(num <= 1){
            return num;
        }
        int firstTerm = fib(num - 1);
        int secondTerm = fib(num - 2);
        return firstTerm + secondTerm;
    }

    public static void main(String[] args) {
        int result = fib(8);
        System.out.println(result);
        }
    }
