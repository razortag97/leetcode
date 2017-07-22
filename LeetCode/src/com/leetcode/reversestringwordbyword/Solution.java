package com.leetcode.reversestringwordbyword;

/**
 * Accepted
 * @author akshayshenoy
 *
 */
public class Solution {
	//input : blue is black --> length (13)
	
	// resultant : black is blue
	public String reverseWords(String s) {
		if(s == null){
			return null;
		}
		if(s.length() == 1 && s.equals(" ")){
			return s.trim();
		}
		
		StringBuffer reversedString = new StringBuffer();
		StringBuilder b = new StringBuilder();
		char prevChar='\0';
		Integer length = s.length();
		Integer index = length - 1;
		
		while(index>=0){
			char c = s.charAt(index);
			if(prevChar == ' ' && c ==' '){
				while(index>0){
					c = s.charAt(--index);
					if(c !=' '){
						break;
					}
				}
			}
			if(c == ' '){
				b = b.reverse();
				b.append(c);
				reversedString.append(b);
				b = new StringBuilder();
			}else{
				b = b.append(c);
			}
			prevChar = c;
			index--;
		}
		
		reversedString.append(b.reverse());
		
		return reversedString.toString().trim();
	}
	
	public static void main(String[] args){
		String testString = "blue is black  and blue is green";
		//String testString = "a  b";
		Solution s = new Solution();
		String reversedString = s.reverseWords(testString);
		System.out.println(reversedString);
	}
}
