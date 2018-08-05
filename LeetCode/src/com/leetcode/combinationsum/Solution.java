package com.leetcode.combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	  public List<List<Integer>> combinationSum(int[] candidates, int target) {
		  int t = target;
		  int[] c = candidates;
		  LinkedList<List<Integer>> ll = new LinkedList<List<Integer>>();

	    Arrays.sort(c);
	    HashSet<Integer> dr = new HashSet<Integer>();
	    for (int c1 : c) {
	    	if(t % c1 == 0) {
	    		int d = t / c1;
	    		ArrayList<Integer> l1 = new ArrayList<Integer>();
	    		for(int i=0; i< d;i++) {
	    			l1.add(c1);
	    		}
	    		ll.add(l1);
	    	}else {
	    		int r = t % c1;
	    		boolean bl = searchNum(r, c);
	    		if(bl && !dr.contains(r)) {
	    			int d = t / c1;
		    		ArrayList<Integer> l1 = new ArrayList<Integer>();
		    		for(int i=0; i< d;i++) {
		    			l1.add(c1);
		    		}
		    		l1.add(r);
		    		ll.add(l1);
	    		}
	    	}
	    	dr.add(c1);
	    }
	    return ll;
	  }

	public boolean searchNum(int d, int[] c) {
		int l=0;
		int r=c.length-1;

		while(l<=r) {
			int mid = (l+r)/2;
			if(c[mid] == d)
				return true;
			else if(c[mid] < d)
				mid=mid+1;
			else
				mid=mid-1;
			l++;
			r--;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
