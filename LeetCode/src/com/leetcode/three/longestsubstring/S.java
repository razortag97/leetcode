package com.leetcode.three.longestsubstring;

public class S {
	
    public int maxChunksToSorted(int[] arr) {
        int ans=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
            if(max == i) ans++;
        }
        return ans;
    }
	 
	 public static void main (String[] args) {
	    		
	    	S s = new S();
	    //	int arr[] = new int[] {4,3,2,1,0};
	    //	int arr[] = new int[] {1,0,2,3,4};
	    	int arr[] = new int[] {4,5,6,7,8};
	    	int max = s.maxChunksToSorted(arr);
	    	System.out.println(max);
	    	
	   
	 }

}
