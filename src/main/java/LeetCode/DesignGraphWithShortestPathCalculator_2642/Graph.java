package LeetCode.DesignGraphWithShortestPathCalculator_2642;

import java.util.*;

class Graph {

    private final List<List<Edge>> graph;

    public Graph(int n, int[][] edges) {
        graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            addEdge(edge);
        }
    }

    public void addEdge(int[] edge) {
        graph.get(edge[0]).add(new Edge(edge[2], edge[1]));
    }

    public int shortestPath(int departure, int destination) {
        return algorithm(departure, destination);
    }

    //    Dijkstra’s algorithm
    private int algorithm(int departure, int destination) {
        int[] distances = new int[graph.size()];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[departure] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.dist));
        pq.add(new Edge(0, departure));

        while (!pq.isEmpty()) {
            Edge curr = pq.poll();
            int node = curr.node;
            int distance = curr.dist;

            if (distance > distances[node])
                continue;

            if (node == destination)
                return distance;

            for (Edge edge : graph.get(node)) {
                int next = edge.node;
                int nextDist = edge.dist;
                int newDist = nextDist + distances[node];
                if (distances[next] > newDist) {
                    distances[next] = newDist;
                    pq.add(new Edge(newDist, next));
                }
            }
        }
        return distances[destination] != Integer.MAX_VALUE ? distances[destination] : -1;
    }
}

class Edge {
    int dist, node;

    public Edge(int dist, int node) {
        this.dist = dist;
        this.node = node;
    }
}