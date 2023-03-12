package LeetCode.MergekSortedLists_23;

import LeetCode.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static LeetCode.HandsomeMethods.createListNode;
import static LeetCode.HandsomeMethods.listNodeEquals;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {

        return Stream.of(
                Arguments.of(
                        new ListNode[]{
                                createListNode(new int[]{1, 4, 5}),
                                createListNode(new int[]{1, 3, 4}),
                                createListNode(new int[]{2, 6})
                        },
                        createListNode(new int[]{1, 1, 2, 3, 4, 4, 5, 6})
                ),
                Arguments.of(new ListNode[0], null),
                Arguments.of(new ListNode[]{new ListNode()}, new ListNode())
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(ListNode[] lists, ListNode expected) {
        assertTrue(listNodeEquals(expected, solution.mergeKLists(lists)));
    }
}