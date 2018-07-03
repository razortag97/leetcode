package com.leetcode.searchrange;

public class Solution {

	public int[] searchRange(int[] nums, int target) {
		int[] pos = new int[] {-1,-1};
		if(nums.length < 1)
			return pos;
		
		int min=0;
		int max=nums.length-1;
		
		if(target < nums[min] || target > nums[max])
			return pos;
		
		while(min<=max) {
			int mid=(min+max)/2;
			if(nums[mid] == target) {
				pos = getMinMax(pos,nums,min,mid,max,target);
				break;
			}else if(nums[mid]<target)
				min=mid+1;
			else
				max=mid-1;
		}
		return pos;
	}
	
	private int[] getMinMax(int[] p, int[] nums, int min, int mid, int max, int target){
		int l=mid;
		while(l>=min) {
			if(nums[l]==target) {
				l--;
			}else
				break;
		}
		p[0]=l+1;
		
		int r=mid;
		while(r<=max) {
			if(nums[r]==target) {
				r++;
			}else {
				break;
			}
		}
		p[1]=r-1;
		
		return p;
	}
	
	public static void main(String[] args) {

	}

}
