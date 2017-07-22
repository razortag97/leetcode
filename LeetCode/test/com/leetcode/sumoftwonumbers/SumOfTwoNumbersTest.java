package com.leetcode.sumoftwonumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfTwoNumbersTest {

	@Test
	public void test() {
		int[] numbers = {3,2,4};
		int target = 6;
		SumOfTwoNumbers sumOfTwoNumbers = new SumOfTwoNumbers();
		int[] indexes = sumOfTwoNumbers.twoSum(numbers, target);
		for(int i=0;i<numbers.length;i++){
			System.out.println(i);
		}
	
	}

}
