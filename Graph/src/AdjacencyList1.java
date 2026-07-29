import java.util.ArrayList;

public class AdjacencyList1 {

    public static void main(String[] args) {
        int V = 4;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i< V; i++){
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(1).add(3);
        adj.get(3).add(1);

        for(int i=0; i<V; i++) {
            System.out.print(i + "->");

            for (int neighbour : adj.get(i)) {
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
    }
}
