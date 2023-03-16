package LeetCode.ConstructBinaryTreefromInorderandPostorderTraversal_106;

import LeetCode.HandsomeMethods;
import LeetCode.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static LeetCode.HandsomeMethods.createTreeNode;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3}, createTreeNode(new Integer[]{3, 9, 20, null, null, 15, 7})),
                Arguments.of(new int[]{-1}, new int[]{-1}, createTreeNode(new Integer[]{-1}))
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] inorder, int[] postorder, TreeNode treeNode) {
        assertTrue(HandsomeMethods.equals(treeNode, solution.buildTree(inorder, postorder)));
    }
}