package LeetCode.Single_ThreadedCPU_1834;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    record Task(int id, int enqTime, int procTime) {
    }

    public int[] getOrder(int[][] tasks) {
        int len = tasks.length;
        Task[] taskArr = new Task[len];
        for (int i = 0; i < len; i++) {
            taskArr[i] = new Task(i, tasks[i][0], tasks[i][1]);
        }
        //This way to write comparators much faster than next one. Just run test for this task
        Arrays.sort(taskArr, (a, b) -> a.enqTime - b.enqTime);
        PriorityQueue<Task> available = new PriorityQueue<>(
                (a, b) -> {
                    if (a.procTime == b.procTime) {
                        return a.id - b.id;
                    }
                    return a.procTime - b.procTime;
                }
        );
        int[] result = new int[len];
        int resultInd = 0;
        int taskInd = 0;
        int currTime = 0;
        while (resultInd < len) {
            while (taskInd < len && taskArr[taskInd].enqTime <= currTime) {
                available.offer(taskArr[taskInd++]);
            }
            if (available.isEmpty()) {
                currTime = taskArr[taskInd].enqTime;
            } else {
                currTime += available.peek().procTime;
                result[resultInd++] = available.poll().id;
            }
        }
        return result;
    }

//    public int[] getOrder2(int[][] tasks) {
//        int len = tasks.length;
//        Task[] taskArr = new Task[len];
//        for (int i = 0; i < len; i++) {
//            taskArr[i] = new Task(i, tasks[i][0], tasks[i][1]);
//        }
//        Arrays.sort(taskArr, Comparator.comparingInt(a -> a.enqTime));
//        PriorityQueue<Task> available = new PriorityQueue<>(Comparator
//                .comparingInt(Task::procTime)
//                .thenComparing(Task::id));
//        int[] result = new int[len];
//        int resultInd = 0;
//        int taskInd = 0;
//        int currTime = 0;
//        while (resultInd < len) {
//            while (taskInd < len && taskArr[taskInd].enqTime <= currTime) {
//                available.offer(taskArr[taskInd++]);
//            }
//            if (available.isEmpty()) {
//                currTime = taskArr[taskInd].enqTime;
//            } else {
//                currTime += available.peek().procTime;
//                result[resultInd++] = available.poll().id;
//            }
//        }
//        return result;
//    }
}