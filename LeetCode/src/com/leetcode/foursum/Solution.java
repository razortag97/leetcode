package com.leetcode.foursum;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public int search(int[] a, int target) {
    		int i=0;
    		int j=i+1;
    		
    		while(j<=a.length-1) {
    			if(a[i] < a[j]) {
    				i++;
    				j++;
    			}else {
    				break;
    			}
    		}
    		
    		int rf = j;
    		
    		int min=0, max = a.length-1, amax = a.length-1;
    		int mid = 0;
    		
    		while(min<=max) { // <--
    			mid = (max+min)/2;
    			
    			int realMid = (mid+rf) % a.length;
    			
    			if(a[realMid] == target) {
    				return realMid;
    			}else if(a[realMid] < target) {
    				min = mid+1;
    			}else {
    				max = mid-1;
    			}
    		}
    		
    		return -1;
    }
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		int target = 0;
		int[] a = new int[] {4,5,6,7,0,1,2};
		System.out.println(s.search(a, target));

	}

}
