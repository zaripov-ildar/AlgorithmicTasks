package LeetCode.ShortestPathinaGridwithObstaclesElimination_1293;

import java.util.Arrays;
import java.util.LinkedList;

class Solution {

    static class Traveler {
        int x;
        int y;
        int crossing;

        public Traveler(int x, int y, int k) {
            this.x = x;
            this.y = y;
            this.crossing = k;
        }
    }

    public int shortestPath(int[][] grid, int k) {
        int[][] DIR = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
        int res = 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] bestRes = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(bestRes[i], Integer.MAX_VALUE);
        }
        bestRes[0][0] = 0;

        LinkedList<Traveler> callStack = new LinkedList<>();
        callStack.offerLast(new Traveler(0, 0, 0));

        while (!callStack.isEmpty()) {
            int size = callStack.size();

            while (size-- > 0) {
                Traveler temp = callStack.poll();

                if (temp.x == m - 1 && temp.y == n - 1) {
                    return res;
                }
                for (int[] dir : DIR) {
                    int x = temp.x + dir[0];
                    int y = temp.y + dir[1];
                    if (x < 0 || y < 0 || x >= m || y >= n) {
                        continue;
                    }
                    int cross = temp.crossing + grid[x][y];
                    if (cross > k || bestRes[x][y] <= cross) {
                        continue;
                    }
                    bestRes[x][y] = cross;
                    callStack.offerLast(new Traveler(x, y, cross));
                }
            }
            res++;
        }
        return -1;
    }
}
//import java.util.Arrays;
//
//class Solution {
//    private int[][] grid;
//    private int[][] bestPaths;
//    private int m;
//    private int n;
//
//    public int shortestPath(int[][] grid, int k) {
//        this.grid = grid;
//        m = grid.length;
//        n = grid[0].length;
//        bestPaths = new int[m][n];
//        for (int[] ints : bestPaths) {
//            Arrays.fill(ints, Integer.MAX_VALUE);
//        }
//        findPath(k, 0, 0, 0);
//        return bestPaths[m - 1][n - 1] == Integer.MAX_VALUE ? -1 : bestPaths[m - 1][n - 1];
//    }
//
//    private void findPath(int k, int x, int y, int pathLen) {
//        int OBSTACLE = 1;
//        if (x < 0 || x >= m ||
//                y < 0 || y >= n) {
//            return;
//        }
//        if (grid[x][y] == OBSTACLE) {
//            k--;
//        }
//        if (k < 0) {
//            return;
//        }
//        if (bestPaths[x][y] < pathLen) {
//            return;
//        }
//        bestPaths[x][y] = pathLen;
//        pathLen++;
//        findPath(k, x - 1, y, pathLen);
//        findPath(k, x + 1, y, pathLen);
//        findPath(k, x, y - 1, pathLen);
//        findPath(k, x, y + 1, pathLen);
//    }
//}
