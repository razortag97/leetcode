package com.leetcode.houserobber;

public class Solution {

	public int rob(int[] nums) {
        int a=0, b=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
                a=Math.max(a+nums[i], b);
            else
                b=Math.max(b+nums[i], a);
        }
        int max=(a>b?a:b);
        System.out.println(max);
        return max;
    }
	
	public static void main(String[] args) {
		Solution s = new Solution();
		//int[] nums = new int[]{2,1,1,4,2};
		int[] nums = new int[]{9,0,0,9};
		s.rob(nums);
	}

}
