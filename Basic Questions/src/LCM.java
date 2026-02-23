public class LCM {
    public static void main(String[] args) {
        int a = 12;
        int b = 16;
        int aCopy = a;
        int bCopy = b;

        while(a%b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        int lcm = (aCopy*bCopy) / b;
        System.out.println(lcm);
    }
}
