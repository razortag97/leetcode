package com.leetcode.lcs_w_rc._3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	
	 public int lengthOfLongestSubstring(String s) {
		 if(s==null || s.isEmpty())
			 return 0;
		 
		 String maxStr = new String();
		 String currStr = new String();
		 
		 Set<Character> charSet = new HashSet<Character>();
		 
		 for(int i=0; i< s.length(); i++) {
			 Character ch = s.charAt(i);
			 
			 if(charSet.contains(ch)) {
				 currStr = currStr.substring(currStr.indexOf((int) ch) + 1);
			 }
			
			 currStr = currStr + ch;
			 charSet.add(ch);
			 
			 if(currStr.length() > maxStr.length())
				 maxStr = currStr.toString();
		 }
		 
		 return maxStr.length();
	 }

	public static void main(String[] args) {
		Solution s = new Solution();
		//System.out.println(s.lengthOfLongestSubstring("abcbca"));
		System.out.println(s.lengthOfLongestSubstring("pwwkew"));
		
		// pwwkew
		// pwewkew
	}

}
