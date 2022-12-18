package LeetCode.EvaluateReversePolishNotation_150;

import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int j = 0; j < tokens.length; j++) {
            stack.push(
                    isNum(tokens[j]) ? Integer.parseInt(tokens[j]) : calculate(stack.pop(), stack.pop(), tokens[j])
            );
        }
        return stack.peek();
    }

    private int calculate(Integer b, Integer a, String operation) {
        return switch (operation) {
            case "*" -> a * b;
            case "/" -> a / b;
            case "-" -> a - b;
            default -> a + b;
        };
    }

    private boolean isNum(String token) {
        return !"*/-+".contains(token);
    }
}
