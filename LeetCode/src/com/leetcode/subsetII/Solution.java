package com.leetcode.subsetII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {
	 
	 public List<List<Integer>> subsetsWithDup(int[] nums) {
		 
		 LinkedList<List<Integer>> ll = new LinkedList<List<Integer>>();
		 ll.add(new ArrayList<Integer>());
		 
		 Set<String> s = new HashSet<String>();
		 for(int i=0;i<nums.length;i++) {
				 
			 StringBuffer tSB = new StringBuffer();
			 tSB.append(nums[i]);
			 
			 if(s.add(tSB.toString())) {
				 ArrayList<Integer> l1 = new ArrayList<Integer>();
				 l1.add(nums[i]);
				 ll.add(l1);
			 }
			 
			 int j=i+1;
			 while(j<nums.length) {
				 StringBuffer mSB = new StringBuffer();
				 mSB.append(tSB.toString());
				 mSB.append(nums[j]);
				 
				 ArrayList<Integer> l2 = null;
				 if(s.add(mSB.toString())) {
					  l2 = new ArrayList<Integer>();
					  l2.add(nums[i]);
					  l2.add(nums[j]);
					  ll.add(l2);
				 }
				 
				 for(int k=j+1;k<nums.length;k++) {
					 StringBuffer lSB = new StringBuffer();
					 lSB.append(mSB.toString());
					 lSB.append(nums[k]);
					 
					 if(s.add(lSB.toString())) {
						 ArrayList<Integer> l3 = new ArrayList<Integer>();
						 l3.addAll(l2);
						 l3.add(nums[k]);
						 ll.add(l3);
					 }
					 
					 int m = k+1;
					 while(m < nums.length) {
						
						 m++;
					 }
				 }
				 j++;
			 }
		 }
		 
		 return ll;
	 }

	public static void main(String[] args) {
		Solution s = new Solution();
		int nums[] = new int[] {1,2,3,4};
		s.subsetsWithDup(nums);
	}

}
