import java.util.Stack;
public class ValidParanthesis {

    public static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.size() == 0) {
                    return false;
                }
                char top = st.peek();
                if ((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.size() == 0;
    }


    public static void main(String[] args) {
            String str = "({[]})";
            String str2 = "({)}";
            System.out.println(isValid(str));
            System.out.println(isValid(str2));
    }
}
