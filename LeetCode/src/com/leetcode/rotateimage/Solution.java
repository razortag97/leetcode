package com.leetcode.rotateimage;

public class Solution {

	public void rotateArray(int[][] matrix) {
		
		int maxRows = matrix.length-1;
		int maxCols = matrix[0].length-1;
		
		//Get the transpose first
		for(int i=0;i<=maxRows;i++)
			for(int j=i;j<=maxCols;j++) {
				int temp = matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
				
		//Exchange the first column with the last column
		int r=0;
		while(r<=maxRows) {
			int temp = matrix[r][maxCols];
			matrix[r][maxCols]= matrix[r][0];
			matrix[r][0]=temp;
		}
		
	}
	
	
	public static void main(String[] args) {
		
	}
}
