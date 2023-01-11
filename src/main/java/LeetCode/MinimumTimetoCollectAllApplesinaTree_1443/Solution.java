package LeetCode.MinimumTimetoCollectAllApplesinaTree_1443;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tree.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            tree.get(edge[0]).add(edge[1]);
            tree.get(edge[1]).add(edge[0]);

        }
        return 2 * helper(0, tree, hasApple, 0);
    }

    int helper(int node, List<List<Integer>> tree, List<Boolean> hasApple, int cameFrom) {
        int currPathLength = 0;
        for (int currNode : tree.get(node)) {
            if (currNode == cameFrom) {
                continue;
            }
            currPathLength += helper(currNode, tree, hasApple, node);
        }
        if (node != 0 && (hasApple.get(node) || currPathLength > 0))
            currPathLength++;
        return currPathLength;
    }
}
