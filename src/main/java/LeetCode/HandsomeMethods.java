package LeetCode;

import java.util.*;

public class HandsomeMethods {

	public static String getRandomString(int len) {
		StringBuilder sb = new StringBuilder();
		Random rnd = new Random();
		for (int i = 0; i < len; i++) {
			char ch = (char) rnd.nextInt('a', 'a' + 26);
			sb.append(ch);
		}
		return sb.toString();
	}

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

	public static <T extends Comparable<T>> boolean equals(List<T> list1, List<T> list2) {
		List<T> clone1 = new ArrayList<>(list1);
		List<T> clone2 = new ArrayList<>(list2);
		Collections.sort(clone1);
		Collections.sort(clone2);
		return new HashSet<>(clone1).containsAll(clone2) && new HashSet<>(clone2).containsAll(clone1)
				&& clone1.size() == clone2.size();
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
				node.left = createTreeNode(iterator);
				tree.add(node.left);
				node.right = createTreeNode(iterator);
				tree.add(node.right);
			}
		}
		return head;
	}

	private static TreeNode createTreeNode(Iterator<Integer> iterator) {
		if (iterator.hasNext()) {
			Integer temp = iterator.next();
			if (temp != null) {
				return new TreeNode(temp);
			}
		}
		return null;
	}

	private static void insert(List<TreeNode> tree, Integer v) {
		if (v == null)
			return;
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

		return equals(t1.left, t2.left) && equals(t1.right, t2.right);

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

	public static Node createNode(int[][] adjList) {
		Map<Integer, Node> map = new HashMap<>();
		for (int i = 0; i < adjList.length; i++) {
			map.put(i + 1, new Node(i + 1));
		}
		for (int key : map.keySet()) {
			for (int i : adjList[key - 1]) {
				Node neighbor = map.get(i);
				map.get(key).neighbors.add(neighbor);
			}
		}
		return map.get(1);
	}

	public static boolean equals(Node n1, Node n2) {
		Map<Integer, List<Integer>> map1 = new HashMap<>();
		Map<Integer, List<Integer>> map2 = new HashMap<>();
		fillMapByNode(map1, n1);
		fillMapByNode(map2, n2);
		System.out.println(map1);
		System.out.println(map2);
		return map1.keySet().equals(map2.keySet())
				&& valuesEqual(map1, map2);
	}

	private static void fillMapByNode(Map<Integer, List<Integer>> map, Node n1) {
		if (map.containsKey(n1.val)) {
			return;
		}
		map.put(n1.val, new ArrayList<>());
		for (Node node : n1.neighbors) {
			map.get(n1.val).add(node.val);
			fillMapByNode(map, node);
		}

	}

	private static boolean valuesEqual(Map<Integer, List<Integer>> map1, Map<Integer, List<Integer>> map2) {
		for (int key : map1.keySet()) {
			List<Integer> l1 = map1.get(key);
			List<Integer> l2 = map2.get(key);
			if (!listNodeEquals(l1, l2)) {
				return false;
			}
		}
		return true;
	}

	private static boolean listNodeEquals(List<Integer> l1, List<Integer> l2) {
		if (l1.size() != l2.size()) {
			return false;
		}
		Collections.sort(l1);
		Collections.sort(l2);
		return l1.equals(l2);
	}
}
