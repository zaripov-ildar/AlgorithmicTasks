package LeetCode.AddTwoNumbers_02;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        return sum(result, l1, l2, 0);
    }

    private ListNode sum(ListNode result, ListNode l1, ListNode l2, int remainder) {
        if (l1 != null) {
            remainder += l1.val;
            l1 = l1.next == null ? null : l1.next;
        }
        if (l2 != null) {
            remainder += l2.val;
            l2 = l2.next == null ? null : l2.next;
        }
        result.val = remainder % 10;
        remainder = remainder / 10;
        if (l1 != null || l2 != null) {
            result.next = new ListNode();
            sum(result.next, l1, l2, remainder);
        } else if (remainder != 0) {
            result.next = new ListNode(remainder);
        }
        return result;
    }
}