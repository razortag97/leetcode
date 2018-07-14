package com.leetcode.spiralmatrixii;

public class Solution {
	
	  public int[][] generateMatrix(int n) {
	        
	        int[][] m = new int[n][n];
	        int imin=0; int jmin=0;
	        int imax=n-1; int jmax=n-1;
	        int i=imin, j=jmin;
	        int num=1;
	        
	        
	        while(imin <= imax && jmin <= jmax){
	            //go right
	        	while(j<=jmax) {
	        		m[i][j]=num;
	        		num++;
	        		j++;
	        	}
	        	
	        	imin++;
	        	j=jmax;
	        	i=imin;
	        	//go down
	        	while(i<=imax) {
	        		m[i][j]=num;
	        		i++;
	        		num++;
	        	}
	        	
	        	jmax--;
	        	i=imax;
	        	j=jmax;
	        	//go left
	        	while(j>=jmin) {
	        		m[i][j]=num;
	        		j--;
	        		num++;
	        	}
	        	
	        	j++;
	        	imax--;
	        	i=imax;
	        	//go up
	        	while(i>=imin) {
	        		m[i][j]=num;
	        		i--;
	        		num++;
	        	}
	        	jmin++;
	        	i=imin;
	        	j=jmin;
	        }
	     
	        return m;
	    }

	public static void main(String[] args) {
		int n = 0;
		Solution s = new Solution();
		s.generateMatrix(n);

	}

}
