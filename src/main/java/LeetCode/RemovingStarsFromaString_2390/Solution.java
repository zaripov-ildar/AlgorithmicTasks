package LeetCode.RemovingStarsFromaString_2390;

import java.util.Stack;

class Solution {
    // my solution
    public String removeStars(String s) {
	StringBuilder sb = new StringBuilder(s.length());
	for (int i = 0; i < s.length(); i++) {
	    if (s.charAt(i) == '*') {
		sb.deleteCharAt(sb.length() - 1);
	    } else {
		sb.append(s.charAt(i));
	    }
	}
	return sb.toString();
    }

    // Shiv Rastogi solution
    public String removeStars2(String s) {
	String ans = "";
	int cntStar = 0;
	for (int i = s.length() - 1; i >= 0; i--) {
	    if (s.charAt(i) == '*')
		cntStar++;
	    else if (cntStar == 0)
		ans = s.charAt(i) + ans;
	    else
		cntStar--;
	}
	return ans;
    }

    // Vikas Pathak solution
    public String removeStars3(String l) {
	// Create a new stack to keep track of characters encountered so far
	Stack<Character> s = new Stack<>();

	// Iterate over each character in the input string
	for (char c : l.toCharArray()) {
	    // If the current character is a star, remove the topmost character from the
	    // stack
	    if (c == '*') {
		s.pop();
	    }
	    // If the current character is not a star, add it to the stack
	    else {
		s.push(c);
	    }
	}

	// Create a new StringBuilder to store the characters in the stack
	StringBuilder sb = new StringBuilder();

	// Iterate over each character in the stack and append it to the StringBuilder
	for (char c : s) {
	    sb.append(c);
	}

	// Convert the StringBuilder to a string and return it as the output
	return sb.toString();
    }
}