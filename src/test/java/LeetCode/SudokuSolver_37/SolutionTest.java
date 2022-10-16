package LeetCode.SudokuSolver_37;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void test(){
        char [][] board = new char[9][9];
        board[0] = "53..7....".toCharArray();
        board[1] = "6..195...".toCharArray();
        board[2] = ".98....6.".toCharArray();
        board[3] = "8...6...3".toCharArray();
        board[4] = "4..8.3..1".toCharArray();
        board[5] = "7...2...6".toCharArray();
        board[6] = ".6....28.".toCharArray();
        board[7] = "...419..5".toCharArray();
        board[8] = "....8..79".toCharArray();
        for (char[] chars : board) {
            System.out.println(Arrays.toString(chars));
        }
        solution.solveSudoku(board);
        for (char[] chars : board) {
            System.out.println(Arrays.toString(chars));
        }
    }

}