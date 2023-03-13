package LeetCode.MergekSortedLists_23;

import LeetCode.ListNode;
import LeetCode.Timer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static LeetCode.HandsomeMethods.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private final static int[] arr1 = getSortedRandomArray(3300);
    private final static int[] arr2 = getSortedRandomArray(3300);
    private final static int[] arr3 = getSortedRandomArray(3300);
    private final static int[] merged = mergeTwoSortedArrays(arr1, mergeTwoSortedArrays(arr2, arr3));


    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new ListNode[]{
                                createListNode(arr1),
                                createListNode(arr2),
                                createListNode(arr3)
                        },
                        createListNode(merged)),
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
    void test1(ListNode[] lists, ListNode expected) {
        assertTrue(listNodeEquals(expected, solution.mergeKLists2(lists)));

    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test2(ListNode[] lists, ListNode expected) {
        assertTrue(listNodeEquals(expected, solution.mergeKLists(lists)));
    }

    @Test
    void timeTest() {
        Timer timer = new Timer();
        Runnable method1 = () -> solution.mergeKLists(updateListNodes());
        Runnable method2 = () -> solution.mergeKLists2(updateListNodes());
        timer.compareFunctions(method1, method2);
    }

    private static ListNode[] updateListNodes() {
        return new ListNode[]{
                createListNode(arr1),
                createListNode(arr2),
                createListNode(arr3)
        };
    }
}