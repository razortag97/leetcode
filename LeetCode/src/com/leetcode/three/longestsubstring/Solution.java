package com.leetcode.three.longestsubstring;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int lengthOfLongestSubstring(String s) {
		if(s == null || s.isEmpty()){
			return 0;
		}

		int maxLength = 0;
		int i = 0; //Current pointer
		int counter=0; //Count the current Length
		//String t1 = new String(new char[]{s.charAt(i)});
		Set<String> chars = new HashSet<String>();
		String t1 = new String(new char[]{s.charAt(i)});
		chars.add(t1);
		i++;
		counter++;
		
		while(i < s.length()){
			t1 = new String(new char[]{s.charAt(i)});
			if(!chars.contains((String) t1)){
				chars.add(t1);
				counter++;
			}else{
				
		        String currChar = new String(new char[]{s.charAt(i)});
		        int tempPointer = i+1;
				while(tempPointer < s.length()){
					String t2 = new String(new char[]{s.charAt(tempPointer)});
					// If character is repeating keep moving to the next char
					if(t2.equals(currChar)){
						tempPointer++;
					}else{
						break;
					}
				}// while to check for repeating chars ends here
				//dvddefgaack
				if(tempPointer-1 > i && tempPointer < s.length()){ // the char is repeating more than once
					i = tempPointer-1;
					chars.clear();
					if(counter > maxLength){ // Register the max length
						maxLength = counter;
						counter=0;
					}
					continue;
				}else{
					chars.clear();
					if(counter > maxLength){ // Register the max length
						maxLength = counter;
						counter=0;
					}
					continue;
				}
				
			}
			
			i++;
		}// Main String traversor while ends here

		if(maxLength < counter){ // To cover the case where length of the String is 1. 
			maxLength=counter;
		}

		return maxLength;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		//aab
		//int length = s.lengthOfLongestSubstring("aab");
		//int length = s.lengthOfLongestSubstring("abcabcbb");
		//int length = s.lengthOfLongestSubstring("dvddefgaack");
		//int length = s.lengthOfLongestSubstring("abcabcbb");
		int length = s.lengthOfLongestSubstring("abcabcbb");
		System.out.println(length);
	}

}
