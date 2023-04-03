package LeetCode.BoatstoSavePeople_881;

import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
	Arrays.sort(people);
	int left = 0, right = people.length - 1, boats = 0;
	while (left <= right) {
	    if (people[left] + people[right] <= limit) {
		left++;
	    }
	    right--;
	    boats++;
	}
	return boats;
    }
}