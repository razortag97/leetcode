package _78;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	 public List<List<Integer>> subsets(int[] nums) {
	     ArrayList<List<Integer>> sol = new ArrayList<List<Integer>>();
	     
	     for(int i=0; i<nums.length;i++) {
	    	 s(nums, i, sol, new ArrayList<Integer>());
	     }
		 sol.add(new ArrayList<Integer>());
	     return sol;
	 }
	 
	 public List<List<Integer>> s(int[] nums, int i, ArrayList<List<Integer>> sol, ArrayList<Integer> s1){
		 if(i<nums.length) {
			 s1.add(nums[i]);
		 }else {
			 return null;
		 }
		 sol.add(new ArrayList<Integer>(s1));
		 int st = i+1;
		 while(st<nums.length) {
			 s(nums, st, sol, s1);
			 s1.remove(s1.size()-1);
			 st++;
		 }
		 return sol;
	 }
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = new int[] {1,2,3,4};
		List<List<Integer>> sol = s.subsets(nums);
		for (List<Integer> list : sol) {
			for (Integer integer : list) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}
	}

}
