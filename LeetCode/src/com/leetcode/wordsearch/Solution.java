package com.leetcode.wordsearch;

public class Solution {

	 public boolean exist(char[][] board, String word) {
		 
		 char[] charr = word.toCharArray();
		 char[][] b = board;
		 int[][] visited = new int[b.length][b[0].length];
		 int k=0;
		 
		 for(int i=0;i<b.length;i++)
			 for(int j=0;j<b[0].length;j++)
				 if(b[i][j]==charr[k])
					 if(detExist(i,j,k, b,charr, visited))
						 return true;
					 
		 return false;
	}
	 
	private boolean detExist(int i, int j, int k, char[][] b, char[] charr, int[][] visited) {
		int mmin=0; int mmax=b.length-1;
		int nmin=0; int nmax=b[0].length-1;
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
		Solution s = new Solution();
		dataTestCase1();
		boolean bool = s.exist(b, w);
		System.out.println(bool);
		
		dataTestCase2();
		bool = s.exist(b, w);
		System.out.println(bool);
		
		dataTestCase3();
		bool = s.exist(b, w);
		System.out.println(bool);
	}
	
	private static String w=null;
	private static char[][] b=null;
	
	private static void dataTestCase1() {
		String word="SEE";
		char[][] board = new char[3][4];
		board[0]= new char[]{'A','B','C','E'};
		board[1]= new char[]{'S','F','C','S'};
		board[2]= new char[]{'A','D','E','E'};
		w=word;
		b=board;
	}

	private static void dataTestCase2() {
		String word="a";
		char[][] board = new char[][] {{'a'}};
		w=word;
		b=board;
	}
	
	private static void dataTestCase3() {
		String word="aaa";
		char[][] board = new char[][] {{'a', 'a'}};
		w=word;
		b=board;
	}
	
}
