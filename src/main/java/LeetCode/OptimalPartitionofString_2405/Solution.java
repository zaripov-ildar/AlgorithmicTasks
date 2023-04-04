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
        int i = 0, ans = 1, flag = 0;
        while(i < s.length()) {
            int val = s.charAt(i) - 'a';
            if ((flag & (1 << val)) != 0) {
                flag = 0;
                ans++;
            }
            flag = flag | (1 << val);
            i++;
        }
        return ans;
    }
}