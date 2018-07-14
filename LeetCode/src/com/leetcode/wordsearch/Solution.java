package com.leetcode.wordsearch;

public class Solution {

	 public boolean exist(char[][] board, String word) {
		 if(board.length<1 || board[0].length<1 || word.length() < 1 || word.isEmpty())
			 return false;
		 
	        char[] charArr = word.toCharArray();
	        int k=0;
	        int[][] visited = new int[board.length][board[0].length];
	        
	        for(int i=0;i<board.length;i++)
	            for(int j=0; j<board[0].length;j++){
	                if(board[i][j]==charArr[k])
	                    if(determineExist(board, i, j, k, charArr, visited)){
	                        return true;
	                    }
	            }
	        return false;
	    }
	    
	    private boolean determineExist(char[][] board, int i, int j, int k, char[] charArr, int[][] visited){
	        if(k>charArr.length-1){
	            return true;
	        }
	        
	        if( (!(i<0)) && (!((i+1)>(board.length-1))) && (!(j<0)) && (!(j+1>board.length-1)) && visited[i][j] != 1 && board[i][j] == charArr[k]){
                System.out.println(charArr[k]);
	            int advancek = k+1;
	            visited[i][j]=1;
	            
	            if(determineExist(board, i+1, j, advancek, charArr, visited)) return true;
	            if(determineExist(board, i-1, j, advancek, charArr, visited)) return true;
	            if(determineExist(board, i, j+1, advancek, charArr, visited)) return true;
	            if(determineExist(board, i, j-1, advancek, charArr, visited)) return true;
	                      
	            visited[i][j]=0;
	            return false;
	        }
	        return false;
	    }
	
	public static void main(String[] args) {
		String word="ABCCED";
		char[][] board = new char[3][4];
		board[0]= new char[]{'A','B','C','E'};
		board[1]= new char[]{'S','F','C','S'};
		board[2]= new char[]{'A','D','E','E'};
		
		Solution s = new Solution();
		boolean bool = s.exist(board, word);
		System.out.println(bool);
				
	}

}
