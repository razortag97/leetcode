package com.leetcode.spiraltraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public List<Integer> spiralTraversal(int[][] matrix) {
		
		List<Integer> integers = new ArrayList<Integer>();
		
		int imax = matrix.length-1;
		if(matrix.length < 1)
			return new ArrayList<Integer>();
		
		int jmax = matrix[0].length-1;
		if(matrix[0].length < 1)
			return new ArrayList<Integer>();
		
		int[][] visited = new int[imax+1][jmax+1];
		int imin = 0;
		int jmin = 0;
		int i=imin;
		int j=jmin;
	
		while(imin<=imax && jmin<=jmax) {
				i=imin;
				j=jmin;
				if(i==imin && j==jmin) {
					goright(matrix, i, j, jmax, integers, visited);
					j=jmax;
				}
				if(j==jmax && i==imin) {
					i++;
					godown(matrix,i,imax,jmax, integers, visited);
					i=imax;
				}
				if(j==jmax && i==imax) {
					j--;
					goleft(matrix, i, j, jmin, integers, visited);
					j=jmin;
				}
				if(j==jmin && i==imax) {
					i--;
					imin++;
					goup(matrix,i,imin,j, integers, visited);
					i=imin;
					jmin++;
				}
				imax--;
				jmax--;
		}
		System.out.println(integers);
		return integers;
	}
	
	public void goright(int[][] matrix, int i, int j, int jmax, List<Integer> integers, int[][] visited) {
		System.out.println("i:" + i + ", j:" +j);
		while(j<=jmax && visited[i][j] != 1) {
			integers.add(matrix[i][j]);
			visited[i][j]=1;
			j++;
		}
	}
	
	public void godown(int[][] matrix, int i, int imax, int j, List<Integer> integers, int[][] visited) {
		while(i<=imax && visited[i][j] != 1) {
			integers.add(matrix[i][j]);
			visited[i][j]=1;
			i++;
		}
	}
	
	public void goleft(int[][] matrix, int i, int j,int jmin, List<Integer> integers, int[][] visited) {
		while(j>=jmin && visited[i][j] != 1) {
			integers.add(matrix[i][j]);
			visited[i][j]=1;
			j--;
		}
	}
	
	public void goup(int[][] matrix, int i, int imin,int jmax, List<Integer> integers, int[][] visited) {
		while(i>=imin && visited[i][jmax] != 1) {
			integers.add(matrix[i][jmax]);
			visited[i][jmax]=1;
			i--;
		}
	}
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		int[][] matrix = new int[][] {{1}};
		//int[][] matrix = new int[][] {{1,2,3,4,5}, {16,17,18,19,6}, {15, 24, 25, 20, 7}};
		//int[][] matrix = new int[][] {{1,2,3,4,5}, {16,17,18,19,6}, {15, 24, 25, 20, 7},
		//							{14, 23, 22, 21, 8}, {13, 12, 11, 10, 9}};
		s.spiralTraversal(matrix);

	}

}
