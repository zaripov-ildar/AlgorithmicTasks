package LeetCode.FindOriginalArrayFromDoubledArray_2007;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    private final List<Integer> list = new LinkedList<>();
    private int resultIndex = 0;

    public int[] findOriginalArray(int[] changed) {
        int len = changed.length;
        if (len % 2 != 0 || len == 0) {
            return new int[0];
        }
        Arrays.sort(changed);
        int[] result = new int[len / 2];
        for (int i : changed) {
            if (!list.isEmpty() && list.get(0) == i){
                result[resultIndex++] = i/2;
                list.remove(0);
            } else {
                list.add(2*i);
            }
        }
        if (list.size()>0){
            return new int[0];
        }
        return result;
    }
}
