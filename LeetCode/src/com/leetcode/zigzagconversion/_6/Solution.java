package com.leetcode.zigzagconversion._6;

import java.util.ArrayList;

public class Solution {
	
	public String convert(String s, int numRows) {
		StringBuffer[] sb = new StringBuffer[numRows];
		for (int i=0;i<sb.length;i++) {
			sb[i] = new StringBuffer();
		}
		ArrayList<String[]> matA = new ArrayList<String[]>();
		int jMax = numRows;
		for(int i=0; i<s.length();) {
			int j = 0;
			String[] arr = new String[numRows];
			while(i < s.length() && j < jMax) {
				arr[j] = String.valueOf(s.charAt(i));
				sb[j].append(arr[j]);
				i++;
				j++;
				
			}
			matA.add(arr);
			j=j-2;
			while(i < s.length() && j > 0) {
				arr = new String[numRows];
				arr[j] = String.valueOf(s.charAt(i));
				sb[j].append(arr[j]);
				i++;
				j--;
				matA.add(arr);
			}
		}
		
		StringBuffer sbf = new StringBuffer();
		
		for (StringBuffer sbt : sb) {
			sbf.append(sbt.toString());
		}
		
		return sbf.toString();
	}
	
	// PAYPALISHIRING
	 
	// P   A   H   G			P       I       N 
	// A P L S I I				A    L  S    I  G
	// Y   I   R				Y  A    H  R
	//							P		I
	
	public static void main(String[] args) {
		String str = "PAYPALISHIRING";
		Solution s = new Solution();
		s.convert(str, 3);
	}

}
