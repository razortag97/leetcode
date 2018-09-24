package com.leetcode.validParantheses._20;

import java.util.Stack;

public class _20 {

	// ()[]{}
	// ([{}])
	// ({[}])
	// )}
	
	public boolean isValid(String s) {
		if(s == null)
			return false;
		
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
			if(c == '{') {
				stack.push(c);
			}else if(c == '(') {
				stack.push(c);
			}else if(c == '[') {
				stack.push(c);
			}else {
				if(stack.isEmpty() || stack.pop() != c)
					return false;
			}
		}
        //Check below
        return stack.isEmpty();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
