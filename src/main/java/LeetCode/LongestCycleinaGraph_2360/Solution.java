package LeetCode.LongestCycleinaGraph_2360;

import java.util.HashMap;

class Solution {
    private final int VISITED = -2;

    public int longestCycle(int[] edges) {
        int result = -1;
        for (int i = 0; i < edges.length; i++) {
            if (edges[i] != VISITED) {
                int node = edges[i];
                edges[i] = VISITED;
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, 0);
                int pathLen = 1;
                while (node != -1 && edges[node] != VISITED) {
                    map.put(node, pathLen++);
                    node = getNodeAndMarkAsVisited(edges, node);
                }
                if (node != -1 && map.containsKey(node)) {
                    result = Math.max(pathLen - map.get(node), result);
                }
            }
        }
        return result;
    }

    private int getNodeAndMarkAsVisited(int[] edges, int node) {
        int temp = edges[node];
        edges[node] = VISITED;
        node = temp;
        return node;
    }
}