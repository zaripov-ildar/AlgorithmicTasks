package LeetCode.MaximumWidthofBinaryTree_662;

import LeetCode.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static LeetCode.HandsomeMethods.createTreeNode;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(createTreeNode(new Integer[]{1, 3, 2, 5, 3, null, 9}), 4),
                Arguments.of(createTreeNode(new Integer[]{1, 3, 2, 5, null, null, 9, 6, null, 7}), 7),
                Arguments.of(createTreeNode(new Integer[]{1, 3, 2, 5}), 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(TreeNode root, int expected) {
        assertEquals(expected, solution.widthOfBinaryTree(root));
    }
}