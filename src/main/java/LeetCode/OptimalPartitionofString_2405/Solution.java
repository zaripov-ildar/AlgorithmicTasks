package LeetCode.OptimalPartitionofString_2405;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int partitionString(String s) {
	int count = 1;
	Set<Character> subString = new HashSet<>();	
	for (int i = 0; i < s.length(); i++) {
	    char ch = s.charAt(i);
	    if (subString.contains(ch)) {
		count++;
		subString.clear();
	    }
	    subString.add(ch);
	}	
	return count;
    }
    
    public int partitionString2(String s) {
//	store char as bits in flag
        int i = 0, result = 1, set = 0;
        while(i < s.length()) {
            int pos = s.charAt(i) - 'a';
            if ((set & (1 << pos)) != 0) {
                set = 0;
                result++;
            }
            set = set | (1 << pos);
            i++;
        }
        return result;
    }
}