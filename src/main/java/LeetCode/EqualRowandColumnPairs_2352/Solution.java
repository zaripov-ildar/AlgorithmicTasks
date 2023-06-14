package LeetCode.EqualRowandColumnPairs_2352;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    //my brute force method
    public int equalPairs(int[][] grid) {
        int res = 0;
        for (int[] col : grid) {
            for (int row = 0; row < grid.length; row++) {
                int k = 0;
                while (k < grid.length && col[k] == grid[k][row]) k++;
                if (k == grid.length) res++;
            }
        }
        return res;
    }

    //the common method on LeetCode
    public int equalPairs2(int[][] grid) {
        Map<String, Integer> rowCounts = new HashMap<>();
        int count = 0;

        for (int[] row : grid) {
            String key = Arrays.toString(row);
            rowCounts.put(key, rowCounts.getOrDefault(key, 0) + 1);
        }

        for (int col = 0; col < grid[0].length; col++) {
            int[] column = new int[grid.length];
            for (int row = 0; row < grid.length; row++) {
                column[row] = grid[row][col];
            }
            String key = Arrays.toString(column);
            count += rowCounts.getOrDefault(key, 0);
        }

        return count;
    }
}