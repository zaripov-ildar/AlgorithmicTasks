package LeetCode.FindtheDifferenceofTwoArrays_2215;

import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new LinkedList<>();

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        arrToSet(nums1, s1);
        arrToSet(nums2, s2);

        setToList(l1, s1, s2);
        setToList(l2, s2, s1);


        return List.of(l1, l2);
    }

    private static void setToList(List<Integer> l1, Set<Integer> s1, Set<Integer> s2) {
        for (Integer i : s1) {
            if (!s2.contains(i)){
                l1.add(i);
            }
        }
    }

    private static void arrToSet(int[] nums, Set<Integer> set) {
        for (int i : nums) {
            set.add(i);
        }
    }
}