package Recursion;

public class Fib {
  public static int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int a = fib(n-1);
        int b = fib(n-2);
        int c = a + b;
        return c;
    }
    public static void main(String[] args){
   
        System.out.println(fib(5));
        }
    }

    