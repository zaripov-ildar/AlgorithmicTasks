package LeetCode.SumRoottoLeafNumbers_129;

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
                Arguments.of(createTreeNode(new Integer[]{1,2,3}), 25),
                Arguments.of(createTreeNode(new Integer[]{4,9,0,5,1}), 1026)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(TreeNode tree, int expected){
        assertEquals(expected, solution.sumNumbers(tree));
    }
}