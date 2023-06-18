package LeetCode.MinimumAbsoluteDifferenceinBST_530;

import LeetCode.HandsomeMethods;
import LeetCode.Timer;
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
                Arguments.of(HandsomeMethods.createTreeNode(new Integer[]{4, 2, 6, 1, 3}), 1),
                Arguments.of(HandsomeMethods.createTreeNode(new Integer[]{1, 0, 48, null, null, 12, 49}), 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(TreeNode root, int expected) {
        assertEquals(expected, solution.getMinimumDifference(root));
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void timeTest(TreeNode root, int expected) {
        Timer timer = new Timer();
        timer.compareFunctions(
                () -> solution.getMinimumDifference(root)
        );
    }
}