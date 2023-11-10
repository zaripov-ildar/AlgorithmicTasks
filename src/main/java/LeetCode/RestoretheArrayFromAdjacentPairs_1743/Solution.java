package LeetCode.RestoretheArrayFromAdjacentPairs_1743;

import java.util.*;

class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] pair : adjacentPairs) {
            graph.putIfAbsent(pair[0], new ArrayList<>());
            graph.putIfAbsent(pair[1], new ArrayList<>());
            graph.get(pair[0]).add(pair[1]);
            graph.get(pair[1]).add(pair[0]);
        }

        int[] result = new int[adjacentPairs.length + 1];
        for (Map.Entry<Integer, List<Integer>> e : graph.entrySet()) {
            if (e.getValue().size() == 1) {
                result[0] = e.getKey();
                result[1] = e.getValue().get(0);
                break;
            }
        }

        for (int i = 2; i < result.length; i++) {
            List<Integer> temp = graph.get(result[i - 1]);
            result[i] = temp.get(temp.get(0) == result[i - 2] ? 1 : 0);
        }

        return result;
    }
}