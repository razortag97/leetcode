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
		if(mid > 0){
			quickSort(numArray, left, mid-1);
			quickSort(numArray, mid+1, right);
		}
	}
	
	public int partition(Integer[] numArray, Integer left, Integer right){
		if(left < 0 || left == right){
			return -1;
		}
		
		Integer pivot = numArray[right];
		Integer i = left - 1;
		int j=-1;
		
		for(j=left;j<right-1;j++){
			if(numArray[j].intValue() < pivot.intValue() || numArray[j].intValue() == pivot.intValue()){
				i++;
				//Swamp numArray[i] & numArray[j]
				int temp = numArray[i];
				numArray[i] = numArray[j];
				numArray[j] = temp;
			}
		}
		
		//Exchange numArray[i+1] with numArray[j]
		int temp = numArray[i+1];
		numArray[i+1] = numArray[right];
		numArray[right] = temp;
		
		return i+1;
	}

	public static void main(String[] args){
		
	}
}
