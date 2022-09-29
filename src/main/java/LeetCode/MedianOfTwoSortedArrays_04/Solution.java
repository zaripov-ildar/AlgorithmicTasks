package LeetCode.MedianOfTwoSortedArrays_04;

public class Solution {
    private int j, k;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i;
        j = 0;
        k = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        int medianeIndex = (len1 + len2 - 1) / 2;
        int firstMediane = 100000, secondMediane = 500000;
        for (i = 0; i <= medianeIndex + 1; i++) {
            secondMediane = getMinimal(nums1, nums2);
            if (i == medianeIndex) {
                firstMediane = secondMediane;
            }
        }

        if ((len1 + len2) % 2 == 0) {
            return (double) (firstMediane + secondMediane) / 2;
        }

        return firstMediane;
    }

    private int getMinimal(int[] nums1, int[] nums2) {
        int first = getNext(nums1, j);
        int second = getNext(nums2, k);
        if (first<=second){
            j++;
            return first;
        }
        k++;
        return second;
    }

    private int getNext(int[] nums, int index) {
        if (index< nums.length){
            return nums[index];
        }
        return Integer.MAX_VALUE;
    }
}
