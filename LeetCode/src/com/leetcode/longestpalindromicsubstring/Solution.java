package com.leetcode.longestpalindromicsubstring;

import java.util.Calendar;
import java.util.Date;

public class Solution {

	public String longestPalindrome(String s) {
		
		if(s == null || s.isEmpty() || s.length() ==1)
			return s;
		
        String currPS = "";
        boolean p = false;
        
        for(int i=0;i<=s.length()-2;i++)
        	for(int j=s.length()-1;j>i;j--) {
        		if(s.charAt(i) == s.charAt(j)) {
        			p = checkIfStringIsPalindrome(s, i, j);
        			if(p && s.substring(i, j+1).length() > currPS.length()) {
        				currPS = s.substring(i, j+1);
        			}
        		}else {
        			p = false;
        		}
        	}
        
        if(currPS.isEmpty() || currPS.length() < 1)
        	currPS = s.substring(0, 1);
        
        return currPS;
    }
	
	protected boolean checkIfStringIsPalindrome(String s, int i, int j) {
		while(i<j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		//String targetString = "baeaa";
		//String targetString = "ae";
		System.out.println(new Date());
		String targetString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaa";
		Solution s = new Solution();
		System.out.println(s.longestPalindrome(targetString));
		System.out.println(new Date());
	}

}
