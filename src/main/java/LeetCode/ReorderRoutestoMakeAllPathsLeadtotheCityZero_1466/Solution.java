package LeetCode.ReorderRoutestoMakeAllPathsLeadtotheCityZero_1466;

import java.util.BitSet;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int minReorder(int n, int[][] connections) {
        List<Road>[] citiesGraph = new List[n];
        for (int i = 0; i < n; i++) {
            citiesGraph[i] = new LinkedList<>();
        }

        for (int[] connection : connections) {
            citiesGraph[connection[0]].add(new Road(connection[1], 1));
            citiesGraph[connection[1]].add(new Road(connection[0], 0));
        }
        return helper(citiesGraph, 0, new BitSet(n));
    }

    private int helper(List<Road>[] citiesGraph, int departure, BitSet visited) {
        int result = 0;
        visited.set(departure);
        for (Road road : citiesGraph[departure]) {
            if (!visited.get(road.destination)) {
                result += road.isOriginalDirection + helper(citiesGraph, road.destination, visited);
            }
        }
        return result;
    }

    private record Road(int destination, int isOriginalDirection) {
    }
}

