package Recursion;

public class PowerOfANumber {

    static int computePower(int num, int pow) {
        // Base Case
        if (pow == 0) {
            return 1;
        }
        // Small Problem
        return num * computePower(num, pow - 1);
    }
    static void computePower(int num, int pow, int result){
        // Base Case
        if (pow == 0) {
            System.out.println(result);
            return;
        }
        // Small Problem
        computePower(num, pow - 1, result * num);
    }

    public static void main(String[] args) {
        //computePower(2, 3, 1);
        System.out.println(computePower(2, 5));
    }
}
