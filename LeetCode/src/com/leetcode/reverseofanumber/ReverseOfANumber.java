package com.leetcode.reverseofanumber;

public class ReverseOfANumber {
	 public int reverse(int x) {
		 if(x>2147483647 || x<-2147483648){
			 return 0;
		 }
		 int dividend=0;
		 int remainder=0;
		 int quotient=0;
	        if(x == 0){
	            return x;
	        }
	        
	        dividend = x;
	        boolean negativeNumber=false;
	        
	        if(x<0){
	            negativeNumber=true;
	            dividend = dividend * (-1);
	        }
	        
	        StringBuffer reverseNumber = new StringBuffer();
	        while(dividend>0){
	        	remainder = dividend%10;
	        	quotient = dividend/10;
	        	reverseNumber.append(remainder);
	            dividend = quotient;
	        }
	        try{
		        Integer reverseInteger = new Integer(reverseNumber.toString());
		        if(negativeNumber){
		            reverseInteger = reverseInteger*(-1);
		        }
		        return reverseInteger.intValue();
	        }catch(Exception ex){
	        	ex.printStackTrace();
	        	return 0;
	        }
	    }
}
