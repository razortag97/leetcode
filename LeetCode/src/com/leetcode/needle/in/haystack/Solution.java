package com.leetcode.needle.in.haystack;

public class Solution {
	
	public int strStr(String haystack, String needle) {
		
		if(needle.isEmpty())
			return 0;
		
		if(haystack == null || needle == null)
			return -1;
		
		int anchor = -1;
		char ch = needle.charAt(0);
		int i=0;
		for(i=0; i<=haystack.length()-1;i++) {
			if(haystack.charAt(i) == ch) {
				anchor = i;
				break;
			}
		}
		
		int j=0;
		while(i<=haystack.length()-1 && j<=needle.length()-1) {
			if(haystack.charAt(i) == needle.charAt(j)) {
				if(j==needle.length()-1)
					return anchor;
				i++; j++;
			} // if ends
		} // while ends
		
		return -1;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		String haystack = "hello";
		String needle = "ll";
		s.strStr(haystack, needle);
	}

}
