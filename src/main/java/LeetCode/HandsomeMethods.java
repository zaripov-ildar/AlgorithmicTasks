package LeetCode;

import java.util.*;

public class HandsomeMethods {

    public static int[] getRandomIntArray(int length) {
        int[] result = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            result[i] = rnd.nextInt();
        }
        return result;
    }

    public static int[] getSortedRandomArray(int length) {
        int[] result = getRandomIntArray(length);
        Arrays.sort(result);
        return result;
    }

    public static int[] mergeTwoSortedArrays(int[] foo, int[] bar) {

        int fooLength = foo.length;
        int barLength = bar.length;

        int[] merged = new int[fooLength + barLength];

        int fooPosition, barPosition, mergedPosition;
        fooPosition = barPosition = mergedPosition = 0;

        while (fooPosition < fooLength && barPosition < barLength) {
            if (foo[fooPosition] < bar[barPosition]) {
                merged[mergedPosition++] = foo[fooPosition++];
            } else {
                merged[mergedPosition++] = bar[barPosition++];
            }
        }

        while (fooPosition < fooLength) {
            merged[mergedPosition++] = foo[fooPosition++];
        }

        while (barPosition < barLength) {
            merged[mergedPosition++] = bar[barPosition++];
        }

        return merged;
    }

    public static boolean equals(List<String> l1, List<String> l2) {
        Collections.sort(l1);
        Collections.sort(l2);
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

    public static TreeNode createTreeNode(Integer[] values) {
        Queue<TreeNode> tree = new LinkedList<>();
        Iterator<Integer> iterator = Arrays.stream(values).iterator();
        TreeNode head = new TreeNode(iterator.next());
        tree.add(head);
        while (iterator.hasNext()) {
            TreeNode node = tree.poll();
            if (node != null) {
                node.left = createNode(iterator);
                tree.add(node.left);
                node.right = createNode(iterator);
                tree.add(node.right);
            }
        }
        return head;
    }

    private static TreeNode createNode(Iterator<Integer> iterator) {
        if (iterator.hasNext()) {
            Integer temp = iterator.next();
            if (temp != null) {
                return new TreeNode(temp);
            }
        }
        return null;
    }


    private static void insert(List<TreeNode> tree, Integer v) {
        if (v == null) return;
        int N = tree.size();
        TreeNode node = new TreeNode(v);
        tree.add(node);
        if (N % 2 == 1)
            tree.get((N - 1) / 2).left = node;
        else
            tree.get((N - 1) / 2).right = node;
    }

    public static boolean equals(TreeNode t1, TreeNode t2) {
        if (t1 == null ^ t2 == null) {
            return false;
        }
        if (t1 == null) {
            return true;
        }

        if (t1.val != t2.val) {
            return false;
        }

        return equals(t1.left, t2.left) &&
                equals(t1.right, t2.right);


    }

    public static boolean equals(ListNode head1, ListNode head2) {
        ListNode l1 = head1;
        ListNode l2 = head2;
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }
}
