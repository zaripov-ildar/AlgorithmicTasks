package LeetCode.AverageSalaryExcludingtheMinimumandMaximumSalary_1491;

class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int j : salary) {
            sum += j;
            if (j > max) max = j;
            if (j < min) min = j;
        }
        return ((double) sum - max - min) / (salary.length - 2);
    }
}