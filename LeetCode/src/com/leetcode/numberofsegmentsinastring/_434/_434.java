package com.leetcode.numberofsegmentsinastring._434;

public class _434 {

	 public int countSegments(String s) {
	        if(s== null || s.isEmpty())
	            return 0;
	        int segCounter=0;
	        for(int i=0;i<s.length();i++) {
	        	if(s.charAt(i) != ' ' && (i==0 || s.charAt(i-1) == ' '))
	        		segCounter++;
	        }
	        return segCounter;
	}
	
	public static void main(String[] args) {
		_434 s = new _434();
		//String str = "Hello, my name is Josh";
		String str = " ";
		int num_seg = s.countSegments(str);
		System.out.println(num_seg);

	}

}
