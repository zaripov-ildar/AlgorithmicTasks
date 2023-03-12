package LeetCode;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HandsomeMethods {
    public static boolean assertListEquals(List<String> l1, List<String> l2) {
        Collections.sort(l1);
        Collections.sort(l2);
        System.out.println(l1);
        System.out.println(l2);
        return new HashSet<>(l1).containsAll(l2) && new HashSet<>(l2).containsAll(l1) && l1.size() == l2.size();
    }

    public static ListNode createListNode(int[] values) {
        ListNode head = new ListNode(values[0]);
        ListNode currNode = head;
        for (int j = 1; j < values.length; j++) {
            currNode.next = new ListNode(values[j]);
            currNode = currNode.next;
        }
        return head;
    }

    public static boolean listNodeEquals(ListNode head1, ListNode head2) {
        ListNode l1 = head1;
        ListNode l2 = head2;
        while (l1 != null && l2 != null) {
            System.out.println(l1.val + "<<>>" + l2.val);
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        return l1 == null && l2 == null;
    }
}
