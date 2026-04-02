import java.util.*;

class graph {
    int v;
    ArrayList<ArrayList<Integer>> arr;

    graph(int v) {
        this.v = v;
        arr = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            arr.add(new ArrayList<>());
        }
    }

    void add(int u, int v) {
        arr.get(u).add(v);
        arr.get(v).add(u);
    }

    void print() {
        for (int i = 0; i < v; i++) {
            System.out.print(i + " ---> ");
            for (int j : arr.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void dfs(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int nei : arr.get(node)) {
            if (!visited[nei]) {
                dfs(nei, visited);
            }
        }
    }
}

public class DFSs {
    public static void main(String[] args) {
        int v = 5;
        graph gr = new graph(v);

        gr.add(1, 3);
        gr.add(2, 4); // fixed
        gr.add(1, 4);
        gr.add(2, 3);
        gr.add(4, 3);

        gr.print();

        boolean[] visited = new boolean[v];
        System.out.print("DFS: ");
        gr.dfs(0, visited);
    }
}