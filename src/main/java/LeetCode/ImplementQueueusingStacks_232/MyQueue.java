package LeetCode.ImplementQueueusingStacks_232;

import java.util.Stack;

    class MyQueue {
        private final Stack<Integer> front;
        private final Stack<Integer> back;

        public MyQueue() {
            front = new Stack<>();
            back = new Stack<>();
        }

        public void push(int x) {
            if (!back.empty()) {
                pour(back, front);
            }
            front.push(x);
        }

        public int pop() {
            if (back.empty()) {
                pour(front, back);
            }
            return back.pop();
        }

        public int peek() {
            if (back.empty()) {
                pour(front, back);
            }
            return back.peek();
        }

        public boolean empty() {
            return front.empty() && back.empty();
        }

        private <T> void pour(Stack<T> s1, Stack<T> s2) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
    }
