// package Recursion;

public class SumOfN {

    static void sumofNum(int num, int sum){
        // Base case
        if(num == 0){
            System.out.println(sum);
            return ;
        }
        sumofNum(num - 1, sum + num);

    }

    static int sumOfNum(int num){
        if(num == 0){
            return 0;
        }
        return num + sumOfNum(num-1);
        //int sum = sumOfN(num - 1);
        // return sum + num;

    }

    public static void main(String[] args) {
        System.out.println(sumOfNum(10));
        sumofNum(10, 0);
    }
    
}
