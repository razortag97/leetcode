package com.leetcode.multiplystring;

public class Solution {
	
	public String multiply(String num1, String num2) {
		int mN1 = num1.length()-1;
		int mN2 = num2.length()-1;
		int lenR = mN1+mN2+2;
		
		int[] pos = new int[lenR];
		
		for(int i=num1.length()-1;i>=0;i--)
			for(int j=num2.length()-1;j>=0;j--) {
				int p1=i+j;
				int p2=i+j+1;
				int mul = (num1.charAt(i) - '0' ) * (num2.charAt(j) - '0');
				
				mul=mul+pos[p2];
				int carry = mul/10;
				int digit = mul%10;
				
				pos[p2]=pos[p2] + digit;
				pos[p1]=carry;
			}
		
		for (int i=pos.length-1;i>=0;i--) {
			System.out.println(pos[i]);
		}
		
		return null;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		s.multiply("456", "123");
	}
}
