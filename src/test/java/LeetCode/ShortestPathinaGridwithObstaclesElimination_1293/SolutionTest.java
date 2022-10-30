package LeetCode.ShortestPathinaGridwithObstaclesElimination_1293;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[][]{
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,1,1,1,1,1,1,1,1,0},
                        {0,1,0,0,0,0,0,0,0,0},
                        {0,1,0,1,1,1,1,1,1,1},
                        {0,1,0,0,0,0,0,0,0,0},
                        {0,1,1,1,1,1,1,1,1,0},
                        {0,1,0,0,0,0,0,0,0,0},
                        {0,1,0,1,1,1,1,1,1,1},
                        {0,1,0,1,1,1,1,0,0,0},
                        {0,1,0,0,0,0,0,0,1,0},
                        {0,1,1,1,1,1,1,0,1,0},
                        {0,0,0,0,0,0,0,0,1,0}},
                        1,20),
                Arguments.of(new int[][]{
                                {0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1},
                                {1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0},
                                {1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0},
                                {0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0},
                                {1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0},
                                {0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1},
                                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0},
                                {1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1},
                                {1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0}},
                        283, 41),
                Arguments.of(new int[][]{
                                {0, 0, 0},
                                {1, 1, 0},
                                {0, 0, 0},
                                {0, 1, 1},
                                {0, 0, 0}},
                        1, 6),
                Arguments.of(new int[][]{{0, 1, 1},
                                {1, 1, 1},
                                {1, 0, 0}},
                        1, -1),
                Arguments.of(new int[][]{
                                {0, 1, 0, 1},
                                {0, 1, 0, 0},
                                {0, 0, 1, 0},
                                {1, 0, 0, 1},
                                {0, 1, 0, 0}},
                        18, 7),
                Arguments.of((new int[][]{
                                {0, 0},
                                {1, 0},
                                {1, 0},
                                {1, 0},
                                {1, 0},
                                {1, 0},
                                {0, 0},
                                {0, 1},
                                {0, 1},
                                {0, 1},
                                {0, 0},
                                {1, 0},
                                {1, 0},
                                {0, 0}}),
                        4, 14)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[][] grid, int k, int expected) {
        assertEquals(expected, solution.shortestPath(grid, k));
    }

}