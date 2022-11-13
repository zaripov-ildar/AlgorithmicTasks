package LeetCode.FindMedianfromDataStream_295;

//class MedianFinder {
//    int[] arr;
//    int size;
//
//    public MedianFinder() {
//        arr = new int[101];
//        size = 0;
//    }
//
//    public void addNum(int num) {
//        if (num <= 100 && num >= 0) {
//            arr[num]++;
//            size++;
//        }
//    }
//
//    public double findMedian() {
//        if (size % 2 == 0) {
//            int left = size / 2;
//            return (findNum(left) + findNum(left + 1)) / 2;
//        }
//        return findNum(size / 2 + 1);
//    }
//
//    private double findNum(int index) {
//        for (int j = 0; j < arr.length; j++) {
//            index -= arr[j];
//            if (index <= 0) {
//                return j;
//            }
//        }
//        return arr.length - 1;
//    }
//}

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
    PriorityQueue<Integer> min = new PriorityQueue<>();
    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    public void addNum(int num) {
        max.offer(num);
        min.offer(max.poll());
        if (max.size() < min.size()){
            max.offer(min.poll());
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        if (max.size() == min.size()) return (max.peek() + min.peek()) /  2.0;
        else return max.peek();
    }
};

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */