package com.leetcode.corealgos.algorithms;

public class BinarySearch {

	public int search(int[] sortedNumArray, int searchedNumber){
		
		int maxIndex = sortedNumArray.length-1;
		int minIndex = 0;
		int key = searchedNumber;
		int notFound = -1;
		
		if(key > sortedNumArray[maxIndex] || key < sortedNumArray[minIndex]){
			return notFound;
		}
		
		if(key == sortedNumArray[minIndex]){
			return minIndex;
		}
		
		if(key == sortedNumArray[maxIndex]){
			return maxIndex;
		}
		
		int high = maxIndex;
		int low = minIndex;
		
		do {
			int mid = (high + low)/2;
			if(key < sortedNumArray[mid]){
				high = mid;
			}else if (key > sortedNumArray[mid]){
				low = mid;
			}else if (key == sortedNumArray[mid]){
				return mid;
			}
			
		}while(low < high);
		
		return notFound;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
