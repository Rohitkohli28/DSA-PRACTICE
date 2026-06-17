import java.util.*;

public class basicSTL {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Stack<Integer> st = new Stack<>();
//        Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.size());
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
    }
}
