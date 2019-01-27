package com.leetcode.twosum._1;

import java.util.Arrays;

public class Solution {
	
	 public int[] twoSum(int[] nums, int target) {
		
		 int[] sol = new int[2];
		 for(int i = 0; i<=nums.length-2; i++) {
			 for(int j=i+1; j<=nums.length-1; j++) {
				 int tempSum = nums[i] + nums[j];
				 //System.out.println(tempSum);
				 if(tempSum == target) {
					 sol[0] = i;
					 sol[1] = j;
					 System.out.println("Target: " + target + " , i :" + i + ", j:" + j);
					 return sol;
				 }
			 }
		 }
		 return sol;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {3,2,4};
		Solution s = new Solution();
		s.twoSum(nums, 6);
		/** s.twoSum(nums, 13);
		s.twoSum(nums, 18);
		s.twoSum(nums, 22);
		s.twoSum(nums, 26);*/
	}

}
