package LeetCode.Combinations_77;

import java.util.LinkedList;
import java.util.List;

class Solution {
    private final LinkedList<List<Integer>> result = new LinkedList<>();
    private final LinkedList<Integer> temp = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        recursion(n, k);
        return result;
    }

    private void recursion(int n, int k) {
        if (temp.size() == k) {
            result.add(new LinkedList<>(temp));
            return;
        }
        for (int i = n; i > 0; i--) {
            temp.add(i);
            recursion(i - 1, k);
            temp.removeLast();
        }
    }
}
