import java.util.*;

public class minimalBalanced {
    public static int minRemovals(String str) {
        int open = 0;
        int invalidClose = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                open++;
            } else if (ch == ')') {
                if (open > 0) {
                    open--;
                } else {
                    invalidClose++;
                }
            }
        }

        return open + invalidClose;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(minRemovals(str));
    }
}
