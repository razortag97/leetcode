package com.leetcode.sortcolors;

public class Solution {

	 public void sortColors(int[] a) {
	        int[] count = new int[3];
	        
	        for(int i=0;i<a.length;i++){
	            count[a[i]]++;
	        }
	        
	        int i=0,j=0,k=0;
	        
	        while(i<count.length){
	            while(count[k]>0){
	                a[j]=k;
	                count[k]--;
	                j++;
	            }
	            k++;
	            i++;
	        }
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{2,0,2,1,1,0};
		Solution s = new Solution();
		s.sortColors(a);

	}

}
