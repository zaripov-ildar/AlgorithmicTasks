package LeetCode.MinimumScoreofaPathBetweenTwoCities_2492;

import java.util.*;

class Solution {
    public int minScore(int n, int[][] roads) {
        Map<Integer, HashSet<Integer>> roadTree = new HashMap<>(n);
        for (int[] road : roads) {
            addRoadToMap(roadTree, road);
        }
        Set<Integer> connected = new HashSet<>();
        findConnected(connected, roadTree, 1);
        int minPath = Integer.MAX_VALUE;
        for (int[] road : roads) {
            if (connected.contains(road[0])) {
                minPath = Math.min(minPath, road[2]);
            }
        }
        return minPath;
    }

    private void findConnected(Set<Integer> connected, Map<Integer, HashSet<Integer>> roadTree, int currCity) {
        if (connected.contains(currCity)) {
            return;
        }
        connected.add(currCity);
        if (roadTree.containsKey(currCity)) {
            for (Integer integer : roadTree.get(currCity)) {
                findConnected(connected, roadTree, integer);
            }
        }
    }

    private static void addRoadToMap(Map<Integer, HashSet<Integer>> roadTree, int[] road) {
        addPointsToMap(roadTree, road[0], road[1]);
        addPointsToMap(roadTree, road[1], road[0]);
    }

    private static void addPointsToMap(Map<Integer, HashSet<Integer>> roadTree, int departure, int destination) {
        if (!roadTree.containsKey(departure)) {
            roadTree.put(departure, new HashSet<>());
        }
        roadTree.get(departure).add(destination);
    }
}