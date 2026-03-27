public class ThirdLargest {

    public static int thirdLargest(int arr[]) {
        int first = -1;
        int second = -1;
        int third = -1;

        for(int x : arr){
            if(x > first){
                third = second;
                second = first;
                first = x;
            } else if (x < first && x > second) {
                third = second;
                second = x;
            } else if (x < second && x > third) {
                third = x;
            }
        }
        return third;
    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println(thirdLargest(arr));
    }
}
