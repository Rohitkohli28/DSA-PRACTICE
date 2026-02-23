public class RotateANumber {
    public static void main(String[] args) {
        int num = 12345;
        int rotations = 2;
        int count = 0;
        int pow = (int)Math.pow(10, rotations);
        int lhs = num/pow;
        int rhs = num % pow;
        //System.out.println(lhs);
        //System.out.println(rhs);

//        int temp = lhs;
//        lhs = rhs;
//        rhs = temp;
//        System.out.println(lhs+""+rhs);

        while (num != 0){
            count++;
            num /= 10;
        }
        int pow2 = (int)Math.pow(10, count - rotations);
        int result = rhs * pow2 + lhs;
        System.out.println(result);
    }
}
