package com.leetcode.restoreipaddress;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {

	private boolean checkVO(String tO) {
		
		if(tO.length() > 3)
			return false;
		
		Long ti = Long.parseLong(tO);
        
        if(!(ti>=0 && ti <=255) || tO.length() > ti.toString().length()){
            return false;
        }
        return true;
	}
	
	public List<String> restoreIpAddresses(String input) {
		ArrayList<String> r = new ArrayList<String>();
		HashSet<String> s = new HashSet<String>();
		int i=0;                     // i=0
	    int len=input.length();       // len - 4
	     
	    for(int k=i+1;k<=len-3;k++){
	    	String fO=input.substring(0,k);
	    	if(!checkVO(fO))
	            continue;
	    		
	    	for(int l=k+1;l<=len-2;l++){
		        String sO=input.substring(k,l);
		        if(!checkVO(sO))
		            continue;
	        
		         for(int m=l+1;m<=len-1;m++){
		            String tO=input.substring(l,m);
		            if(!checkVO(tO))
			            continue;
		            
		            String fIO=input.substring(m,len);
		            if(!checkVO(fIO))
			            continue;
		            
		            System.out.println(Integer.parseInt(fO) +"." + Integer.parseInt(sO)
		            + "." + Integer.parseInt(tO) + "." + Integer.parseInt(fIO));
		            s.add(Integer.parseInt(fO) +"." + Integer.parseInt(sO)
		            + "." + Integer.parseInt(tO) + "." + Integer.parseInt(fIO));
	            
		         }//for3 ends
	    	}//for2 ends
	    }// for1 ends
	    
	    for (String s1 : s) {
			r.add(s1);
		}
	    
	    return r;
    }
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		//String inputIP = "2525525525";
		String inputIP = "010010";
		List<String> r = s.restoreIpAddresses(inputIP);
		System.out.println("---------------------");
		System.out.println(inputIP);
		System.out.println("---------------------");
		System.out.println("Size: " + r.size());
		System.out.println("---------------------");
		for (String string : r) {
			System.out.println(string);
		}
	}

}
