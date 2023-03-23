package LeetCode.NumberofOperationstoMakeNetworkConnected_1319;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }
        List<HashSet<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
        }
        for (int[] connection : connections) {
            graph.get(connection[0]).add(connection[1]);
            graph.get(connection[1]).add(connection[0]);
        }
        BitSet visited = new BitSet(n);
        int disconnected = 0;
        for (int i = 0; i < n; i++) {
            if (!visited.get(i)) {
                disconnected++;
                helper(graph, visited, i);
            }
        }
        return disconnected - 1;
    }

    private void helper(List<HashSet<Integer>> graph, BitSet visited, int pcNumber) {
        if (visited.get(pcNumber)){
            return;
        }
        visited.set(pcNumber);
        for (Integer i : graph.get(pcNumber)) {
            helper(graph,visited,i);
        }
    }
}