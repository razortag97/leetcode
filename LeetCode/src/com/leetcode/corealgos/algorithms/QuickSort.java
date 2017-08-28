package com.leetcode.corealgos.algorithms;

/**
 * This is implementation of Quicksort Algorithm 
 * 
 * @author akshayshenoy
 *
 */
public class QuickSort {
	
	public void sort(Integer[] numArray){
		int left = -1;
		int right = numArray.length-1;
		if(numArray.length > 0){
			left = 0;
		}
		quickSort(numArray, left, right);
	}
	
	public void quickSort(Integer[] numArray, Integer left, Integer right){
		int mid = partition(numArray, left, right);
		quickSort(numArray, left, mid-1);
		quickSort(numArray, mid+1, right);
	}
	
	public int partition(Integer[] numArray, Integer left, Integer right){
		if(left < 0 || left == right){
			return -1;
		}
		
		return -1;
	}

	public static void main(String[] args){
		
	}
}
