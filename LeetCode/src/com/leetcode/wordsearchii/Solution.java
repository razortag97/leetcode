package com.leetcode.wordsearchii;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
	
	 public List<String> findWords(char[][] board, String[] words) {
		 
		List<String> w1 = new ArrayList<String>();
		HashSet<String> s = new HashSet<String>();
		char[][] b = board;
		int[][] visited = new int[b.length][b[0].length];
		
		for (String w : words) {
			 char[] charr = w.toCharArray();
			 int k=0;
			 
			 for(int i=0;i<b.length;i++)
				 for(int j=0;j<b[0].length;j++)
					 if(b[i][j]==charr[k])
						 if(detExist(i,j,k, b,charr, visited)) {
							 s.add(w);
							 visited = new int[b.length][b[0].length];
						 }
		}
		for (String s1 : s) {
			w1.add(s1);
		}
		return w1;
	}
	 
	private boolean detExist(int i, int j, int k, char[][] b, char[] charr, int[][] visited) {
		int mmax=b.length-1;
		int nmax=b[0].length-1;
		int kmax=charr.length-1;
		if(k>kmax)
			return true;
		
		if(i < 0 || i > mmax || j < 0 || j > nmax || !(b[i][j]==charr[k]) || visited[i][j] == 1 )
			return false;
		else
			visited[i][j]=1;
		
		int imin=i-1; int jmin=j-1;
		int imax=i+1; int jmax=j+1;
		k++;
		
		if(detExist(imin,j,k,b,charr, visited))
			return true;
		
		if(detExist(imax,j,k,b,charr, visited))
			return true;
		
		if(detExist(i,jmin,k,b,charr, visited))
			return true;
		
		if(detExist(i,jmax,k,b,charr, visited))
			return true;
		
		visited[i][j]=0;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static void construct1() {
		String[] words = new String[] {"oath","pea","eat","rain"};
		char[][] board = new char[][] {{'o','o','a','n'},{'e','t','a','e'},
			{'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
	}

}
