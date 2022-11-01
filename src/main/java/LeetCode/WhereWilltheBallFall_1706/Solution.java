package LeetCode.WhereWilltheBallFall_1706;

class Solution {
    public int[] findBall(int[][] grid) {
        int[] res = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            res[i] = getColumn(i, grid);
        }
        return res;
    }

    private int getColumn(int column, int[][] grid) {
        int row = 0;
        while (row < grid.length) {
            int val = grid[row][column];
            int nextColumn = column + val;
            if (nextColumn < grid[0].length
                    && nextColumn >= 0
                    && grid[row][nextColumn] == val) {
                row++;
                column = nextColumn;
            } else {
                return -1;
            }
        }
        return column;
    }
}
