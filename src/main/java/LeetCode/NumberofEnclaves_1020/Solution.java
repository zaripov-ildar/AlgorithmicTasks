package LeetCode.NumberofEnclaves_1020;

class Solution {
    private final int SEA = 0;

    public int numEnclaves(int[][] grid) {
	int n = grid[0].length - 1;
	int m = grid.length - 1;
	for (int i = 0; i <= m; i++) {
	    helper(grid, i, 0);
	    helper(grid, m - i, n);
	}

	for (int i = 0; i <= n; i++) {
	    helper(grid, 0, i);
	    helper(grid, m, n - i);
	}
	int count = 0;
	for (int i = 1; i < m; i++) {
	    for (int j = 1; j < n; j++) {
		count += grid[i][j];
	    }
	}
	return count;
    }

    private void helper(int[][] grid, int i, int j) {
	if (i >= grid.length ||
		i < 0 ||
		j >= grid[0].length ||
		j < 0 ||
		grid[i][j] == SEA) {
	    return;
	}
	grid[i][j] = SEA;
	// to left
	helper(grid, i, j - 1);
	// to right
	helper(grid, i, j + 1);
	// to top
	helper(grid, i - 1, j);
	// to bottom
	helper(grid, i + 1, j);
    }
}