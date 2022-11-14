package LeetCode.MostStonesRemovedwithSameRoworColumn_947;

import java.util.*;

class Solution {
    private int res = 0;
    private Map<Integer, Integer> map;


    public int removeStones(int[][] stones) {
        if (stones.length == 1) {
            return 0;
        }
        map = new HashMap<>();
        for (int[] stone : stones) {
            putPoint(map, stone[0] + 10_001, stone[1]);
        }
        return stones.length - res;
    }

    private void putPoint(Map<Integer, Integer> map, int x, int y) {
        int firstX = get(x);
        int firstY = get(y);
        if (firstX == firstY) {
            return;
        }

        map.put(firstX, firstY);
        res--;
    }

    private int get(int n) {
        if (!map.containsKey(n)) {
            map.put(n, n);
            res++;
        }
        if (n != map.get(n)) {
            map.put(n, get(map.get(n)));
        }
        return map.get(n);
    }
}
