package LeetCode.MaximumLevelSumofaBinaryTree_1161;

import LeetCode.HandsomeMethods;
import LeetCode.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(HandsomeMethods.createTreeNode(new Integer[]{1, 7, 0, 7, -8, null, null}), 2),
                Arguments.of(HandsomeMethods.createTreeNode(new Integer[]{989, null, 10250, 98693, -89388, null, null, null, -32127}), 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(TreeNode root, int expected) {
        assertEquals(expected, solution.maxLevelSum(root));
    }
}