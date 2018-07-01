package com.leetcode.three.longestsubstring;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int lengthOfLongestSubstring(String s) {
		/**if(s == null || s.isEmpty()){
			return 0;
		}
		
		HashSet<String> charHashset = new HashSet<String>();
		int maxLength=0;
		int i=0, j=0;
		while(i<s.length()) {
			String tempString = new String(new char[] {s.charAt(i)});
			if(!charHashset.contains((String) tempString)) {
				charHashset.add(tempString);
				i++;
				
				int tempMax = i-j;	// Compute the max
				if(tempMax > maxLength) {
					maxLength = tempMax;	
					System.out.println("length:" + maxLength + ",i=" + i + ",j:" +j);
				}
				
			}else {
				charHashset.remove(tempString);
				j++;
			}
		}*/
	    int n = s.length();
	    System.out.println(s);
        Set<Character> set = new HashSet<Character>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
		/** System.out.println("i:" + i + ",j:" +j );
		return maxLength; */
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int length = s.lengthOfLongestSubstring("pwwkew");
		//aab
		//pwwkew
		//int length = s.lengthOfLongestSubstring("aab");
		//int length = s.lengthOfLongestSubstring("abcabcde");
		// abcdefgh
		//int length = s.lengthOfLongestSubstring("dvddefgaack");
		//int length = s.lengthOfLongestSubstring("abcabcbb");
		//int length = s.lengthOfLongestSubstring("abcabcbb");

		
		System.out.println(length);
	}

}
