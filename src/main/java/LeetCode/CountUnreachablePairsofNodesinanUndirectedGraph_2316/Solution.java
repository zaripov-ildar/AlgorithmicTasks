package LeetCode.CountUnreachablePairsofNodesinanUndirectedGraph_2316;

import java.util.*;

class Solution {
    public long countPairs(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();

        }
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        boolean[] isVisited = new boolean[n];
        long result = 0;
        int visitedAmount = 0;

        for (int i = 0; i < n; i++) {
            if (!isVisited[i]) {
                int connected = countConnected(graph, isVisited, i);
                result += (long) connected * visitedAmount;
                visitedAmount += connected;
            }
        }
        return result;
    }

    private int countConnected(List<Integer>[] graph, boolean[] isVisited, int node) {
        isVisited[node] = true;
        int result = 1;
        for (Integer destination : graph[node]) {
            if (!isVisited[destination]) {
                result += countConnected(graph, isVisited, destination);
            }
        }
        return result;
    }
}



