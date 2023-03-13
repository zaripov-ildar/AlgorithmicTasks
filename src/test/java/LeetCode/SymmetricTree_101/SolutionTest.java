package LeetCode.SymmetricTree_101;

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
                Arguments.of(createTreeNode(new Integer[]{1,2,2,3,4,4,3}), true),
                Arguments.of(createTreeNode(new Integer[]{1,2,2,null,3,null,3}), false)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(TreeNode tree, boolean expected){
        assertEquals(expected, solution.isSymmetric(tree));
    }
}