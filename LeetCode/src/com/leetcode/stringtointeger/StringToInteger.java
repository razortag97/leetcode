package com.leetcode.stringtointeger;

public class StringToInteger {
	 public int atoi(String str) {//2145
        int j=0;
        Integer temp = null;
        Integer result=0;
        for(int i=str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            if(i==0 && (c == '+' || c=='-')){
            	if(c=='-'){
            		result = -1*result;
            	}
            	return result;
            }
            if(c!='\0' || c!=' '){
                try{
                	char[] c1 = {c};
                	String s = new String(c1);
                    temp = new Integer(s);
                    temp=temp *(new Double(Math.pow(10,j)).intValue());
                    result = result+temp;
                    if(result > Integer.MAX_VALUE)
                    	return Integer.MAX_VALUE;
                    if(result < Integer.MIN_VALUE)
                    	return Integer.MIN_VALUE;
                    j++;
                }catch(Exception ex){
                    ex.printStackTrace();   
                }
            }
         }
        return result;
	 }
}
