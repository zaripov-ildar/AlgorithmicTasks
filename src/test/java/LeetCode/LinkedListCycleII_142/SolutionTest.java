package LeetCode.LinkedListCycleII_142;

import LeetCode.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private record Arg(ListNode head, ListNode cycle) {
    }

    private static Stream<Arguments> testArguments() {
        Arg arg1 = createNode(new int[]{3, 2, 0, -4}, 1);
        Arg arg2 = createNode(new int[]{1, 2}, 0);
        Arg arg3 = new Arg(new ListNode(1), null);
        ListNode l = new ListNode(1);
        l.next = l;
        return Stream.of(
                Arguments.of(arg1.head, arg1.cycle),
                Arguments.of(arg2.head, arg2.cycle),
                Arguments.of(arg3.head, arg3.cycle),
                Arguments.of(null, null),
                Arguments.of(l, l)


        );
    }

    private static Arg createNode(int[] ints, int i) {
        ListNode head = new ListNode(ints[0]);
        ListNode cycleNode = null;
        ListNode currNode = head;
        for (int j = 1; j < ints.length; j++) {
            currNode.next = new ListNode(ints[j]);
            currNode = currNode.next;
            if (j == i) {
                cycleNode = currNode;
            }
        }
        currNode.next = cycleNode;
        return new Arg(head, cycleNode);
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(ListNode head, ListNode expected) {
        assertEquals(expected, solution.detectCycle(head));
    }
}