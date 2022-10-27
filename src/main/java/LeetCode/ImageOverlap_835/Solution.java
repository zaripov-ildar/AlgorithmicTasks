package LeetCode.ImageOverlap_835;

class Solution {
    private int res = Integer.MIN_VALUE;
    private int size;

    public int largestOverlap(int[][] img1, int[][] img2) {
        size = img1.length - 1;
        for (int i = -size; i <= size; i++) {
            for (int j = -size; j <= size; j++) {
                int sum = getSum(img1, img2, i, j);
                res = Math.max(res, sum);
            }
        }
        return res;
    }

    private int getSum(int[][] img1, int[][] img2, int i, int j) {
        int left2 = Math.max(j, 0);
        int right2 = Math.min(j + size, size);
        int top2 = Math.max(i, 0);
        int bottom2 = Math.min(i + size, size);
        int sum = 0;
        for (int i2 = top2, i1 = size - bottom2; i2 <= bottom2 && i1 <= size - top2; i1++, i2++) {
            for (int j2 = left2, j1 = size - right2; j2 <= right2 && j1 <= size - left2; j1++, j2++) {
                sum += img1[i1][j1] & img2[i2][j2];
            }
        }
        return sum;
    }
}
