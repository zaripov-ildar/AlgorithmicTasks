package LeetCode.MergekSortedLists_23;

import LeetCode.ListNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public ListNode mergeKLists2(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        Queue<ListNode> queue = new LinkedList<>(Arrays.asList(lists));
        while (queue.size() > 1) {
            queue.add(mergeTwoLists(queue.poll(), queue.poll()));
        }
        return queue.poll();
    }


    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return recursiveMerge(lists, 0, lists.length - 1);
    }

    private ListNode recursiveMerge(ListNode[] lists, int from, int to) {
        if (from == to) {
            return lists[from];
        }
        if (from + 1 == to) {
            return mergeTwoLists(lists[from], lists[to]);
        }
        int mid = from + to >> 1;
        ListNode firstHalf = recursiveMerge(lists, from, mid);
        ListNode secondHalf = recursiveMerge(lists, mid + 1, to);
        return mergeTwoLists(firstHalf, secondHalf);
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode curr = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if (list1 != null) {
            curr.next = list1;
        }
        if (list2 != null) {
            curr.next = list2;
        }
        return head.next;
    }
}