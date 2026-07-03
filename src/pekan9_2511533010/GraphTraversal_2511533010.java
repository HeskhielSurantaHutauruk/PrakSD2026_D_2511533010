package pekan9_2511533010;

import pekan8_2511533010.Utils.Utils;
import pekan9_2511533010.helper.StringUtils;

import java.util.*;

public class GraphTraversal_2511533010 {
    private final Map<String, List<String>> graph_3010 = new HashMap<>();

    // menambahkab edge (graf tak berarah)
    public void addEdge_2511533010(String node1_3010, String node2_3010) {
        graph_3010.putIfAbsent(node1_3010, new ArrayList<>());
        graph_3010.putIfAbsent(node2_3010, new ArrayList<>());
        graph_3010.get(node1_3010).add(node2_3010);
        graph_3010.get(node2_3010).add(node1_3010);
    }

    // menampilkan graf awal
    public void printGraph_2511533010() {
        Utils.printLineStatement("Graf awal (Adjacency List: ");
        for (String node_3010 : graph_3010.keySet()) {
            Utils.printStatement(node_3010 + " -> ");
            List<String> neighbors_3010 = graph_3010.get(node_3010);
            Utils.printLineStatement(String.join(", ", neighbors_3010));
        }
        Utils.printLineStatement();
    }

    // DFS rekursif
    public void dfs_2511533010(String start_3010) {
        Set<String> visited_3010 = new HashSet<>();
        Utils.printStatement("Penelusuran DFS: ");
        dfsHelper_2511533010(start_3010, visited_3010);
        Utils.printLineStatement();
    }

    private void dfsHelper_2511533010(String current_3010, Set<String> visited_3010) {
        if (visited_3010.contains(current_3010)) return;
        visited_3010.add(current_3010);

        Utils.printStatement(current_3010 + StringUtils.empty());
        for (String neighbor : graph_3010.getOrDefault(current_3010, new ArrayList<>())) {
            dfsHelper_2511533010(neighbor, visited_3010);
        }
    }

    public void bfs_2511533010(String start_3010) {
        Set<String> visited_3010 = new HashSet<>();
        Queue<String> queue_3010 = new LinkedList<>();

        queue_3010.add(start_3010);
        visited_3010.add(start_3010);

        Utils.printStatement("Penelusuran BFS: ");
        while (!queue_3010.isEmpty()) {
            String current_3010 = queue_3010.poll();
            Utils.printStatement(current_3010 + StringUtils.empty());
            for (String neighbor : graph_3010.getOrDefault(current_3010, new ArrayList<>())) {
                if (!visited_3010.contains(neighbor)) {
                    queue_3010.add(neighbor);
                    visited_3010.add(neighbor);
                }
            }
        }
        Utils.printLineStatement();
    }

    public static void main(String[] args) {
        GraphTraversal_2511533010 graph_3010 = new GraphTraversal_2511533010();

        // contoh graf: A-B, A-C, B-D, B-E
        graph_3010.addEdge_2511533010("A", "B");
        graph_3010.addEdge_2511533010("A", "C");
        graph_3010.addEdge_2511533010("B", "D");
        graph_3010.addEdge_2511533010("B", "E");

        Utils.printLineStatement("Graf awal adalah: ");
        graph_3010.printGraph_2511533010();

        graph_3010.dfs_2511533010("A");
        graph_3010.bfs_2511533010("A");
    }
}