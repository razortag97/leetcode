package com.leetcode.corealgos.algorithms;

public class MergeSort {

	public int[] sort(int[] numArray){
		return null;
	}
	
	public void mergeSort(int[] numArray, int leftIndex, int rightIndex){
		if(leftIndex<rightIndex){
			int mid = (leftIndex + rightIndex)/2;
			mergeSort(numArray, leftIndex, mid);
			mergeSort(numArray, mid+1, rightIndex);
			merge(numArray, leftIndex, mid, mid+1, rightIndex);
		}
		
	}
	
	public void merge(int[] numArray, int leftPointer, int leftMaxIndex, int rightPointer, int rightMaxIndex){
		int[] L = new int[leftMaxIndex-leftPointer+1];
		int[] R = new int[rightMaxIndex-rightPointer+1];
		 
		for(int i=leftPointer; i<=leftMaxIndex; i++){
			L[i]=numArray[i];
		}
		
		for(int i=rightPointer;i<=rightMaxIndex;i++){
			R[i]=numArray[i];
		}
			
		int numArrayIndexP = leftPointer;
		
		while(leftPointer <= leftMaxIndex && rightPointer<=rightMaxIndex){
			if(L[leftPointer] > R[rightPointer]){
				numArray[numArrayIndexP]=R[rightPointer];
				rightPointer++;
				numArrayIndexP++;
			}else{// 3 4  1 7
				numArray[numArrayIndexP]=L[leftPointer];
				leftPointer++;
				numArrayIndexP++;
			}
		}
		
		while(leftPointer <= leftMaxIndex){
			numArray[numArrayIndexP] = L[leftPointer];
			leftPointer++;
			numArrayIndexP++;
		}
		
		while(rightPointer<= rightMaxIndex){
			numArray[rightPointer] = R[rightPointer];
			rightPointer++;
			numArrayIndexP++;
		}
	}
	
	public static void main(String[] args){
		
	}
	
	
}
