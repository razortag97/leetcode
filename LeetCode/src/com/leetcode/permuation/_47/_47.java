package com.leetcode.permuation._47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _47 {
	
	public List<List<Integer>> permuteUnique(int[] nums) {
		if(nums.length < 1)
			return new ArrayList<List<Integer>>();
		
		Arrays.sort(nums);
		
		List<List<Integer>> sol = new ArrayList<List<Integer>>();
		
		helper(nums, new boolean[nums.length], sol, new ArrayList<Integer>());
		
		return sol;
	}
	
	public void helper(int[] nums, boolean[] used, List<List<Integer>> sol, List<Integer> tempL) {
		
		if(tempL.size() == nums.length) {
			List<Integer> temp = new ArrayList<Integer>();
			temp.addAll(tempL);
			sol.add(temp);
			return;
		}
		
		for(int i=0; i<nums.length;i++) {
			if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i-1]) {
				//used[i]=true;
				continue;
			}
			
			tempL.add(nums[i]);
			used[i]=true;
			helper(nums, used, sol, tempL);
			used[i]=false;
			tempL.remove(tempL.size()-1);
		}
	}
	

	public static void main(String[] args) {
		_47 s = new _47();
		int[] nums = new int[] {1,1,2};
		s.permuteUnique(nums);
	}

}
