package com.leetcode.searchin2dmatrix74;

public class Solution {
	
	   public boolean searchMatrix(int[][] m, int target) {
	        
	        int mRow = m.length-1;
	        
	        if(!(mRow >= 0))
	            return false;
	        
	        int mCol = m[0].length-1;
	        
	        for(int i=0;i<=mRow; i++){
	            if(target >= m[i][0] && target <= m[i][mCol]){
	                return bSearch(m, i, 0, mCol, target);
	            }
	        }
	        return false;
	    }
	    
	    private boolean bSearch(int[][] m, int r, int c, int mc, int target){
	        while(c<=mc){
	            int mid = (mc+c)/2;
	            if(m[r][mid] == target)
	                return true;
	            else if(m[r][mid] < target)
	                c=mid+1;
	            else
	                mc=mid-1;
	        }
	        return false;
	    }

	public static void main(String[] args) {
		Solution s = new Solution();
		int[][] m = new int[][] {{1},{3}};
		System.out.println(s.searchMatrix(m, 3));
	}

}
