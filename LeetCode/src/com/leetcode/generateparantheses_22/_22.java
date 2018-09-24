package com.leetcode.generateparantheses_22;

import java.util.ArrayList;
import java.util.List;

public class _22 {

	 public List<String> generateParenthesis(int n) {
		 
		 List<String> sol = new ArrayList<String>();
		 
		 helper(sol, new String() , 0, 0, n);
	     
		 return sol;
	 }
	 
	 public void helper(List<String> s, String sol, int open, int close, int max) {
		 
		 if(close == max) {
			 s.add(sol);
			 System.out.println(sol);
			 return;
		 }
			 
		 if(open < max) 
			 helper(s, sol+"(", open+1, close, max);
		 if(close < open)
			 helper(s, sol+")", open, close+1, max);
		 
	 }
	
	public static void main(String[] args) {
		_22 s = new _22();
		s.generateParenthesis(3);

	}

}
