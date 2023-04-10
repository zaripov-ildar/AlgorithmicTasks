package LeetCode.ValidParentheses_20;

class Solution {
    public boolean isValid(String s) {
	if (s.length() % 2 != 0)
	    return false;
	char[] stack = new char[s.length() / 2 + 1];
	int pointer = -1;
	for (char ch : s.toCharArray()) {
	    if (ch == '(' || ch == '[' || ch == '{') {
		pointer++;
		stack[pointer] = ch;
	    } else if (pointer != -1 && isReflection(stack[pointer]) == ch) {
		pointer--;
	    } else {
		return false;
	    }
	}
	return pointer == -1;
    }

    private char isReflection(char c) {
	switch (c) {
	case '(':
	    return ')';
	case '{':
	    return '}';
	default:
	    return ']';
	}
    }
}