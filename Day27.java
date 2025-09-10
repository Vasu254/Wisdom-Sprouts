import java.util.*;

public class Day27 {
    public static int shortestPath(int V, int[][] edges, int start, int end) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) graph.add(new ArrayList<>());
        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        if (start == end) return 0;

        boolean[] visited = new boolean[V];
        int[] dist = new int[V];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        dist[start] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int nbr : graph.get(node)) {
                if (!visited[nbr]) {
                    visited[nbr] = true;
                    dist[nbr] = dist[node] + 1;
                    q.add(nbr);
                    if (nbr == end) return dist[nbr];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] edges1 = {{0,1},{0,2},{1,3},{2,3},{3,4}};
        System.out.println(shortestPath(5, edges1, 0, 4));
    }
}
