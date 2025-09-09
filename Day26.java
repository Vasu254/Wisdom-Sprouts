import java.util.*;
public class Day26 {
    public static boolean detectCycle(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, visited, adj)) {
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean dfs(int node, int parent, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, node, visited, adj)) return true;
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V1 = 5;
        int[][] edges1 = {{0,1},{1,2},{2,3},{3,4},{4,0}};
        System.out.println(detectCycle(V1, edges1));
    }
}
