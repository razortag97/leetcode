package com.test;

import java.util.HashMap;

public class Solution {
	   public boolean wordPattern(String pattern, String str) {
	        if(pattern == null || str == null || pattern.length() <1 || str.length() <1){
	            return false;
	        }
	        String[] arrOfStr = str.split(" ");
	        
	        if(!(pattern.length() == arrOfStr.length)){
	            return false;
	        }
	        
	        HashMap<String, String> stringMap = new HashMap<String, String>();
	        
	        for(int i=0;i<pattern.length();i++){
	            char ch = pattern.charAt(i);
	            
	            StringBuffer sb = new StringBuffer();
	            sb.append(ch);
	            System.out.println(sb.toString() + " blah blah blah :-" + ch);
	            String testString = stringMap.get(sb.toString());
	            if(testString == null && !stringMap.containsValue(arrOfStr[i])){
	                stringMap.put(sb.toString(), arrOfStr[i]);
	            }else{
	               if(testString != null && testString.equals(arrOfStr[i])){
	                   continue;
	               }else{
	                   return false;
	               }  
	            }
	        }
	        return true;
	    }
	   
	   public static void main(String[] args){
		   /**Solution s = new Solution();
		   String pattern = "abba";
		   String str = "dog dog dog dog";
		   System.out.println(s.wordPattern(pattern, str));*/
		   for(int i=1;i<=5;++i)
			   System.out.println(i);
		   System.out.println("over");
	   }

}
