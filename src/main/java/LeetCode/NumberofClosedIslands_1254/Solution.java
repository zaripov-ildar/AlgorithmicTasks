package LeetCode.NumberofClosedIslands_1254;

class Solution {

    private final int VISITED = 2;

    public int closedIsland(int[][] grid) {
	int islands = 0;
	for (int i = 1; i < grid.length - 1; i++) {
	    for (int j = 1; j < grid[0].length - 1; j++) {
		if (grid[i][j] == 0) {
		    if (helper(i, j, grid)) {
			islands++;
		    }
		}
	    }
	}
	return islands;
    }

    public boolean helper(int i, int j, int[][] grid) {
	if (grid[i][j] == 1 || grid[i][j] == VISITED) {
	    return true;
	}
	if (i == 0 || i == grid.length - 1 || j == 0 || j == grid[0].length - 1) {
	    return false;
	}
	grid[i][j] = VISITED;
	// Go to the left
	boolean left = helper(i, j - 1, grid);
	// Go to the right
	boolean right = helper(i, j + 1, grid);
	// Go to the up
	boolean up = helper(i - 1, j, grid);
	// Go to the down
	boolean down = helper(i + 1, j, grid);
	return left && right && up && down;
    }
}