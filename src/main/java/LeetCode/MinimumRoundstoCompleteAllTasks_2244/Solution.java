package LeetCode.MinimumRoundstoCompleteAllTasks_2244;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public int minimumRounds(int[] tasks) {
        int answer = 0;
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int task : tasks) {
            frequencies.merge(task, 1, (oldValue, newValue) -> oldValue + 1);
        }
        for (Integer frequency : frequencies.values()) {
            if (frequency == 1) return -1;
            int rem = frequency % 3;
            int rounds = frequency / 3;
            answer += rounds + (rem == 0 ? 0 : 1);
        }
        return answer;
    }

    public int minimumRounds2(int[] tasks) {
        Arrays.sort(tasks);
        int answer = 0;
        int count = 0;
        for (int i = 0; i < tasks.length; i++) {
            count++;
            if (i == tasks.length - 1 || tasks[i] != tasks[i + 1]) {
                if (count == 1) {
                    return -1;
                }
                answer += count / 3;
                if(count % 3 != 0) answer++;
                count = 0;
            }
        }
        return answer;
    }
}