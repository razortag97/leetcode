package com.actualinterviews;

import java.util.Stack;

/**
 *  *  "{ one { two}}"
 *  "{ one { two[four]} five}"
 *  "{ hi [0][45]}"
 *  "[ hi {there}]] one}"
 *  "{[{]}"
 *
 * Problem 20 on leetcode 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class AppDynamics {

	public static void main(String[] args) {
		System.out.println(AppDynamics.matcher("()"));
	}
	
	 public static Boolean matcher(String str){
		 if(str == null) 
			 return false;
		 
		 if(str.isEmpty())
			 return true;
		 
		 String closedCurly = "}";	String openCurly = "{";
		 String openSquare = "[";	String closedSquare = "]";
		 String openPara = "(";		String closedPara = ")";
		 //"{}{}()[]"
		 Stack<String> stack = new Stack <String>();
		 int i=0;
		 boolean isValid = true;
		 
		 while(i<str.length()) {
			 String ch = new String(new char[] {str.charAt(i)});
			 if(ch.equals(openCurly))
				 stack.push(closedCurly);
			 if(ch.equals(openPara))
				 stack.push(closedPara);
			 if(ch.equals(openSquare))
				 stack.push(closedSquare);
			 if(((ch.equals(closedCurly) || ch.equals(closedSquare) | ch.equals(closedPara))
					 && ( stack.isEmpty() || (!stack.isEmpty() && !stack.peek().equals(ch)))))
				 	return false;
			 if(((ch.equals(closedCurly)  || ch.equals(closedSquare) || ch.equals(closedPara)) && (!stack.isEmpty() && stack.peek().equals(ch))))
					 stack.pop();
			 i++;
		 }
		 
			 if(!stack.isEmpty())
				 isValid = false;
		 
		 return isValid;
	 }
}
