package LeetCode.SimplifyPath_71;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String simplifyPath(String path) {
        Deque<String> queue = new ArrayDeque<>();
        for (String dir : path.split("/")) {
            if (!queue.isEmpty() && dir.equals("..")) {
                queue.removeLast();
            } else if (!dir.equals(".") && !dir.equals("..") && !dir.isEmpty()) {
                queue.addLast(dir);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String dir : queue) {
            sb.append("/").append(dir);
        }
        return queue.isEmpty() ? "/" : sb.toString();
    }
}