package LeetCode.Permutations_46;

import java.util.*;

//class Solution {
//    private final LinkedList<List<Integer>> result = new LinkedList<>();
//
//    public List<List<Integer>> permute(int[] nums) {
//        int amount = 1;
//        for (int i = 2; i <= nums.length; i++) {
//            amount *= i;
//        }
//        for (int i = 0; i < amount; i++) {
//            result.add(arrayToList(nums));
//            int j = findPrev(nums);
//            int l = findPost(nums, j);
//            swap(nums, l, j);
//            reverse(j + 1, nums);
//        }
//        return result;
//    }
//
//    private void reverse(int left, int[] nums) {
//        int right = nums.length - 1;
//        while (left < right) {
//            swap(nums, left++, right--);
//        }
//    }
//
//    private void swap(int[] nums, int l, int j) {
//        int temp = nums[l];
//        nums[l] = nums[j];
//        nums[j] = temp;
//    }
//
//    private int findPost(int[] nums, int j) {
//        int maxInd = 0;
//        for (int i = j + 1; i < nums.length; i++) {
//            if (maxInd < i && nums[i] > nums[j]) {
//                maxInd = i;
//            }
//        }
//        return maxInd;
//    }
//
//    private int findPrev(int[] nums) {
//        int maxInd = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i + 1] > nums[i]) {
//                maxInd = i;
//            }
//        }
//        return maxInd;
//    }
//
//    private List<Integer> arrayToList(int[] nums) {
//        List<Integer> list = new LinkedList<>();
//        for (int num : nums) {
//            list.add(num);
//        }
//        return list;
//    }
//}


//backtracking

class Solution {
    private final LinkedList<List<Integer>> result = new LinkedList<>();
    private final LinkedList<Integer> temp = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        helper(nums);
        return result;
    }

    private void helper(int[] nums) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int num : nums) {
            if (temp.contains(num)) {
                continue;
            }
            temp.add(num);
            helper(nums);
            temp.removeLast();
        }
    }
}
