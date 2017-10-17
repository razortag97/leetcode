package com.leetcode.three.longestsubstring;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int lengthOfLongestSubstring(String s) {
		if(s == null || s.isEmpty()){
			return 0;
		}
		
		int maxLength = -1;
		Set<String> testSet = new HashSet<String>();
		int maxCounter =-2125;
		int counter = 0;
		int i =0; // String traverser
		
		for (i=0;i<s.length();i++){
			char currentChar = s.charAt(i);
			String c = new String(new char[]{currentChar});
			if(testSet.contains((String)c)){
				if(counter > maxCounter){
					maxCounter = counter;
				}
				testSet.clear();
				counter=0;
				
				//Adding the new char
				testSet.add(c);
				counter++;
			}else{
				testSet.add(c);
				counter++;
			}
		}
		
		if(counter > maxCounter){
			maxCounter = counter;
		}
		
		return maxCounter;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		//int length = s.lengthOfLongestSubstring("abcabcbb");
		int length = s.lengthOfLongestSubstring("c");
		System.out.println(length);
	}

}
