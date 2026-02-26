package Recursion;

public class Factorial {

    static void show(int num, int result){
        if (num == 1){
            System.out.println(result);
            return;
        }
        show(num - 1, result * num);
    }

    // 5! = 5 * 4 * 3 * 2 * 1 = 120
    // n! = n-1

    public static void main(String[] args) {
        show(5, 1);
    }
    
}
