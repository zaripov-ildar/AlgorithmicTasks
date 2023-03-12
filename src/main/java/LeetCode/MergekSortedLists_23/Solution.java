package LeetCode.MergekSortedLists_23;

import LeetCode.ListNode;

class Solution {
//    public ListNode mergeKLists(ListNode[] lists) {
//        ListNode result = new ListNode();
//        if (lists.length == 0) {
//            return null;
//        }
//        ListNode curr = result;
//        int index;
//        while ((index = getIndexOfMin(lists)) != -1) {
//            curr.next = new ListNode(lists[index].val);
//            curr = curr.next;
//            lists[index] = lists[index].next;
//
//        }
//        return result.next;
//    }
//
//    private int getIndexOfMin(ListNode[] lists) {
//        int result = -1;
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < lists.length; i++) {
//            if (lists[i] != null && lists[i].val < min) {
//                min = lists[i].val;
//                result = i;
//            }
//        }
//        return result;
//    }

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