package LeetCode.LongestZigZagPathinaBinaryTree_1372;

import LeetCode.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static LeetCode.HandsomeMethods.createTreeNode;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(createTreeNode(new Integer[]{1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1}), 3),
                Arguments.of(createTreeNode(new Integer[]{1,1,1,null,1,null,null,1,1,null,1}), 4),
                Arguments.of(createTreeNode(new Integer[]{1}), 0)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(TreeNode root, int expected){
        assertEquals(expected, solution.longestZigZag(root));
    }
}