package LeetCode.NumberofNodesintheSubTreeWiththeSameLabel_1519;

import java.util.*;

class Solution {
    private int[] result;
    private List<List<Integer>> tree;
    private String labels;

    public int[] countSubTrees(int n, int[][] edges, String labels) {
        tree = new ArrayList<>(n);
        this.labels = labels;
        result = new int[n];
        for (int i = 0; i < n; i++) {
            tree.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            tree.get(edge[0]).add(edge[1]);
            tree.get(edge[1]).add(edge[0]);
        }
        helper(0, 0);
        return result;
    }
    private int[] helper(int currNode, int lastVisited) {
        char c = labels.charAt(currNode);
        int[] charToFrequencyMap = new int[26];
        for (int node : tree.get(currNode)) {
            if (node != lastVisited) {
                merge(charToFrequencyMap, helper(node, currNode));
            }
        }
        charToFrequencyMap[c - 'a']++;
        result[currNode] = charToFrequencyMap[c - 'a'];
        return charToFrequencyMap;
    }

    private static void merge(int[] charToFrequencyMap, int[] temp) {
        for (int i = 0; i < 26; i++) {
            charToFrequencyMap[i] += temp[i];
        }
    }
}