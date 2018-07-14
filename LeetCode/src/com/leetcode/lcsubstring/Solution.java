package com.leetcode.lcsubstring;

public class Solution {

	  public String longestPalindrome(String s) {
	        
	        if(s == null || s.length() < 2)
	            return s;
	        
	        char[] strArr = s.toCharArray();
	        String lpsString = null;
	        
	        for(int i=1; i<=strArr.length-1;i++){
	            if(i==1){
	                lpsString = String.valueOf(s.charAt(i));
	            }
	            
	            for(int j=0;j<i;j++){
	                boolean bool = determineP(strArr, j, i);
	                
	                if(bool && (i-j+1) > lpsString.length()){
	                    lpsString = s.substring(j, i);
	                    break;
	                }
	            }//for-j
	        }//for-i
	        
	        return lpsString;
	    }
	    
	    private boolean determineP(char[] strArr, int j, int i){
	        while(j<i){
	            if(strArr[j] == strArr[i]){
	                j++;
	                i--;
	            }else
	                return false;
	        }
	        return true;
	    }
	
	public static void main(String[] args) {
		Solution s = new Solution();
		s.longestPalindrome("babad");
	}

}
