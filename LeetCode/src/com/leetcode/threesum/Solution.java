package com.leetcode.threesum;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> lst = new LinkedList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0; i< nums.length-2; i++) {
			if(i == 0 || (i > 0 && nums[i] != nums[i-1])) {
					int l=i+1;
				int r=nums.length-1;
				while(l < r) {
					int sum = nums[i] + nums[l] + nums[r];
					if(sum == 0) {
						ArrayList<Integer> l1 = new ArrayList<Integer>();
						l1.add(nums[i]);
						l1.add(nums[l]);
						l1.add(nums[r]);
						lst.add(l1);
						while(l < r && nums[l] == nums[l+1]) l++;
						while(l < r && nums[r] == nums[r-1]) r--;
						l++;
						r--;
					}else if(sum < 0) {
						l++;
					}else {
						r--;
					}
				}
			}
		}
		
		return lst;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
