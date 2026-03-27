package Recursion;

public class BoardProblem {

    static void boardProblem(int currentValue, int endValue, String result){
        // Base case
        if(currentValue > endValue){ // If we have crossed the end value, we cannot proceed further
            return;
        }
        if(currentValue == endValue){ // If we have reached the end value, we print the result
            System.out.println(result); // We have reached the end value, we print the result and return
            return;
        }

        for(int dice = 1; dice <= 6; dice++){ // 1,2,3,4,5,6
            boardProblem(currentValue + dice, endValue, result + dice);
        }
    }

    // Time complexity: O(6^n) where n is the number of dice rolls needed to reach the end value
    public static void main(String[] args) {
        boardProblem(0, 10, "");
    }
}
