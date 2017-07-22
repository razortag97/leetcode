package com.leetcode.rotatearray;

//k=3
//[1,2,3,4,5,6,7]

//[7,1,2,3,4,5,6] -- Pass 1
//[]

//[5,6,7,1,2,3,4]

public class Solution {
	public void rotate(int[] nums, int k) {
		int buffValue;
		while(k>0){
			buffValue=nums[nums.length-1];
			for(int i=nums.length-1;i>0;i--){
				nums[i]=nums[i-1];
			}
			nums[0]=buffValue;
			k--;
		}
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args){
		int[] nums = new int[]{1,2,3,4,5,6,7};
		int k = 3;
		Solution s = new Solution();
		s.rotate(nums, k);
	}
}
