package com.leetcode.factorialtrailingzero._172;

import java.math.BigInteger;

public class Solution {

	public int trailingZeroes(int n) {
		int countOfZeros = 0;
		
		BigInteger i = new BigInteger(Integer.toString(n));
		BigInteger fact = new BigInteger("1");
		BigInteger one = new BigInteger("1");
		//factorial of the number
		while(i.longValue() > 1) {
			fact = fact.multiply(i);
			System.out.println("Temp Fact: " + fact + ", i: " + i);
			i.subtract(one);
		}
		System.out.println(Long.MAX_VALUE);
		//Count the number of zeros
		BigInteger remainder = fact;
		/**while(remainder.compareTo(new BigInteger("0")) && remainder % 10 == 0) {
			countOfZeros++;
			long dividend = remainder / 10;
			remainder = dividend;
		}*/
		
		System.out.println("Number: " + n +  
				", 	Factorial: " + fact + ", Number of Zeros: " + countOfZeros);
		
		return countOfZeros;
	}
	
	public static void main(String[] args) {
		long currentTime = System.currentTimeMillis();
		Solution s = new Solution();
		/**for(int i=1;i<=100;i++) {
			int n = i;
			s.trailingZeroes(n);
		}*/
		s.trailingZeroes(21);
		System.out.println("Current Time: " + currentTime);
		System.out.println("End Time: " + System.currentTimeMillis());
	}

}
