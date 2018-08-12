package com.leetcode.permuation._43;

import java.util.ArrayList;
import java.util.List;

public class _43 {
	
	public List<List<Integer>> permutation(int[] nums){
		List<List<Integer>> sol = new ArrayList<List<Integer>>();
		
		helper(nums, sol, new ArrayList<Integer>());
		
		return sol;
	}
	
	public void helper(int[] nums, List<List<Integer>> sol, List<Integer> tempL) {
		
		if(tempL.size() == nums.length) {
			List<Integer> t = new ArrayList<Integer>();
			t.addAll(tempL);
			sol.add(t);
			return;
		}
		
		for(int i=0; i < nums.length; i++) {
			if(tempL.contains(nums[i])) continue;
			tempL.add(nums[i]);
			helper(nums, sol, tempL);
			tempL.remove(tempL.size()-1);
		}
	}

	public static void main(String[] args) {
		_43 test = new _43();
		int[] nums = {1,2,3,4};
		test.permutation(nums);
	}
}
