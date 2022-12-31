package LeetCode.UniquePathsIII_980;

class Solution {
    private int result;

    public int uniquePathsIII(int[][] grid) {
        result = 0;
        int startX = 0;
        int startY = 0;
        int pathLength = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) pathLength++;
                if (grid[i][j] == 1) {
                    startY = j;
                    startX = i;
                }
            }
        }
        walker(startX, startY, grid, pathLength);
        return result;
    }

    private void walker(int x, int y, int[][] grid, int pathLength) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == -1) {
            return;
        }
        if (grid[x][y] == 2 && pathLength == 0) {
            result++;
            return;
        }
        pathLength--;
        int temp = grid[x][y];
        grid[x][y] = -1;
//       go right
        walker(x, y + 1, grid, pathLength);
//        go left
        walker(x, y - 1, grid, pathLength);
//        go up
        walker(x - 1, y, grid, pathLength);
//        go down
        walker(x + 1, y, grid, pathLength);
        grid[x][y] = temp;
    }
}