package LeetCode.RemoveAllAdjacentDuplicatesInString_1047;

import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (!characters.empty() &&characters.peek() == ch){
                characters.pop();
            } else {
                characters.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : characters) {
            sb.append(character);
        }
        return sb.toString();
    }
}