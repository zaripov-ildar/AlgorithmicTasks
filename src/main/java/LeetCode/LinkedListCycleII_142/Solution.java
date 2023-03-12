package LeetCode.LinkedListCycleII_142;


import LeetCode.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode left = head;
        ListNode right = head;
        while (right != null && right.next != null) {
            left = left.next;
            right = right.next.next;
            if (left == right) {
                break;
            }
        }
        if (right == null || right.next == null) {
            return null;
        }
        left = head;
        while (left != right) {
            left = left.next;
            right = right.next;
        }
        return left;
    }
}