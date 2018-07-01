package com.leetcode.power;


public class Solution {

	public double pow(double a, int n) {
		
		if(n==0)
			return 1;
		if(n==1)
			return a;
		
		if(n<0) {
			return 1/pow(a,-n);
		}
		
		if(n%2==1) {
			return a * pow(a, n/2) * pow(a, n/2);
		}
		
		double temp = pow(a, n/2);
		temp = temp * temp;
		return temp;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		double num=2;
		int n=-2;
		//int num=2;
		//int n=-2;
		double result = s.pow(num, n);
		System.out.println(result);
	}

}
