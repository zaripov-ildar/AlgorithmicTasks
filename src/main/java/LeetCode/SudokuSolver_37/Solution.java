package LeetCode.SudokuSolver_37;

class Solution {
    private final int SIZE = 9;

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '.') {
                    for (int k = 0; k < 9; k++) {
                        char curSymbol = (char) ('1' + k);
                        if (isNumberValid(board, i, j, curSymbol)) {
                            board[i][j] = curSymbol;
                            if (solve(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isNumberValid(char[][] arr, int row, int column, char symbol) {
        return !isNumberIn3X3(arr, row, column, symbol) &&
                !isNumberInRow(arr, row, symbol) &&
                !isNumberInColumn(arr, column, symbol);
    }

    private boolean isNumberInRow(char[][] arr, int row, char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (arr[row][i] == symbol) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumberInColumn(char[][] arr, int column, char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (arr[i][column] == symbol) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumberIn3X3(char[][] arr, int row, int column, char symbol) {
        row -= row % 3;
        column -= column % 3;
        for (int i = row; i < row + 3; i++) {
            for (int j = column; j < column + 3; j++) {
                if (arr[i][j] == symbol) {
                    return true;
                }
            }
        }
        return false;
    }
}
