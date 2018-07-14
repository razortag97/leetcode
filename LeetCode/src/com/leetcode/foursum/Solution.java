package com.leetcode.foursum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	    public List<List<Integer>> fourSum(int[] a, int target) {
	        
	        List solution = new LinkedList<ArrayList<Integer>>();
	        
	        if(a.length < 4)
	             return solution;
	 	
	 	Arrays.sort(a);
	 	
	 	int i=0, iMax = a.length-4;
	 	int j=i+1, jMax = iMax + 1;
	 	int k=j+1, kMax = jMax + 1;
	 	int l=k+1, lMax = kMax + 1;
	        
	     int maxSum = a[iMax]+a[jMax]+a[kMax]+a[lMax];
	     int minSum = a[i]+a[j]+a[k]+a[l];
	        
	    if(target > maxSum || target < minSum)
	        return solution;
	 	
	 	while(i<=iMax) {
	 		j=i+1;
	 		while(j<=jMax) {
	 			k=j+1;
	 			while(k<=kMax) {
	 				int sum = a[i] + a[j] + a[k];
	 				l=k+1;
	 				while(l<=lMax) {
	 					int ksum = sum + a[l];
	 					if(ksum==target){ 
	 						solution.add(addNumberToList(a, i, j, k, l));
	                         break;
	                     }
	 					if(sum > target)
	 						break;
	 					l++;
	 				}
	                 if(k<kMax && a[k]==a[k+1])
	                     k=resetPos(a, a[k],k, kMax);                        
	 				k++;
	 			}
	             if(j<jMax && a[j]==a[j+1])
	                 j=resetPos(a, a[j],j, jMax);  
	 			j++;
	 		}
	         if(i<iMax && a[i]==a[i+1])
	             i=resetPos(a, a[i],i, iMax);  
	 		i++;
	 	}
	 	
	 	return solution;
	 }
	
	 private ArrayList<Integer> addNumberToList(int[] a, int i, int j, int k, int l){
	 	ArrayList<Integer> list = new ArrayList<Integer>();
	 	list.add(a[i]);
	 	list.add(a[j]);
	 	list.add(a[k]);
	 	list.add(a[l]);
	 	return list;
	 }
	 
	 private int resetPos(int[] a, int target, int k, int kMax){
	     int t=k+1;
	     while(t<=kMax && a[t]==a[k])
	         t++;
	     k=t-1;
	     return k;
	 }
    
	public static void main(String[] args) {
		
		Solution s = new Solution();
		int target = 0;
		//int[] a = new int[] {1, 0, -1, 0, -2, 2};
		int[] a = new int[] {-1,0,-5,-2,-2,-4,0,1,-2};
		target = -9;
		System.out.println(s.fourSum(a, target));

	}

}
