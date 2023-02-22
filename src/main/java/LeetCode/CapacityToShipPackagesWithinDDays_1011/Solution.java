package LeetCode.CapacityToShipPackagesWithinDDays_1011;

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxCapacity = getSum(weights),
                minCapacity = getMax(weights),
                avarageCapacity;

        while (minCapacity < maxCapacity) {
            avarageCapacity = minCapacity + maxCapacity >> 1;
            if (helper(weights, avarageCapacity) <= days) {
                maxCapacity = avarageCapacity;
            } else {
                minCapacity = avarageCapacity + 1;
            }
        }
        return minCapacity;
    }

    private int helper(int[] weights, int capacity) {
        int currCapacity = 0,
                days = 1;
        for (int weight : weights) {
            if (currCapacity + weight <= capacity) {
                currCapacity += weight;
            } else {
                days++;
                currCapacity = weight;
            }
        }
        return days;
    }

    private int getMax(int[] weights) {
        int max = -1;
        for (int weight : weights) {
            if (weight > max) max = weight;
        }
        return max;
    }

    private int getSum(int[] weights) {
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }
        return sum;
    }
}
