package LeetCode.AllPathsFromSourcetoTarget_797;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> currPath = new LinkedList<>();
        currPath.add(0);
        helper(0, graph, currPath, result);
        return result;
    }

    private void helper(int currBranch, int[][] graph, List<Integer> currPath, List<List<Integer>> result) {
        if (currBranch == graph.length - 1) {
            result.add(new LinkedList<>(currPath));
            return;
        }
        for (int currNode = 0; currNode < graph[currBranch].length; currNode++) {
            currPath.add(graph[currBranch][currNode]);
            helper(graph[currBranch][currNode], graph, currPath, result);
            currPath.remove(currPath.size()-1);
        }
    }
}