package com.leetcode.searchinrotatedarrayII;

public class Solution {

    public boolean search(int[] nums, int target) {
        int i=0;
        while((i+1)<=nums.length-1 && (nums[i+1]>nums[i])){
            i++;
        }
        
        int tleft = (i+1)%nums.length;
        int left=0;
        int right=nums.length-1;
        int mid = 0;
        int tmid=0;
        while(left <= right){
            mid = left + ((right-left)/2);
            
            tmid=(mid+tleft)%(nums.length);
            
            if(target == nums[tmid])
                return true;
            else if(target > nums[tmid])
                left = mid+1;
            else
                right = mid-1;
        }
        
        return false;
    }
	
	public static void main(String[] args) {
		int[] nums = new int[] {3,1};
		int target=1;
		
		Solution s = new Solution();
		System.out.println(s.search(nums, target));
	}
	
}
