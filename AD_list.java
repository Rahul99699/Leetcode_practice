import java.util.ArrayList;

class Arra {
    int v;
    ArrayList<ArrayList<Integer>> arr;

    // constructor
    Arra(int v) {
        this.v = v;
        arr = new ArrayList<>();
    }

    // create adjacency list
    void create_g() {
        for (int i = 0; i < v; i++) {
            arr.add(new ArrayList<>());
        }
    }

    // add edge
    void edge(int u, int v) {
        arr.get(u).add(v);
        arr.get(v).add(u); // for undirected graph
    }

    // print graph
    void print() {
        for (int i = 0; i < v; i++) {
            System.out.print(i + " -> ");
            for (int j : arr.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

public class AD_list {
    public static void main(String[] args) {

        Arra g = new Arra(4);

        g.create_g();

        g.edge(0, 1);
        g.edge(0, 2);
        g.edge(1, 3);
        g.edge(2, 3);

        g.print();
    }
}