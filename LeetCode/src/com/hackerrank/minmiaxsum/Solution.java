package com.hackerrank.minmiaxsum;

import java.util.Arrays;

public class Solution {

	  // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        Long ssum = new Long("0");
        Long bsum = new Long("0");
        
        for(int i=0; i<arr.length-1;i++)
            ssum = ssum +  new Long(arr[i]);
        
        
        int diff = arr[arr.length-1] - arr[0];
        bsum = ssum +  diff;
        
        System.out.println(ssum + " " + bsum);
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
