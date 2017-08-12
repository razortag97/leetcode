package com.leetcode.corealgos.algorithms;

public class InsertionSort{
	
	/**
	 * Insertion Sort - Sorting Algorithm
	 * @param o
	 * @return
	 */
	public int[] sort(int[] arrayOfInts){
		
		for(int i=1; i< arrayOfInts.length; i++){
			int key = arrayOfInts[i];
			int index = i-1;
			int tempIndex = index;
			while(index>=0 && key < arrayOfInts[index]){
				arrayOfInts[index+1] = arrayOfInts[index];
				index--;
			}
			//arrayOfInts[tempIndex+1]=key;
			arrayOfInts[index+1]=key;
		}
		// original Prob: 5 3 6 8 1 $$$$$$ 1 5 2 4 7
		// 1 3 5 6 8
		
		// key=1, index=-1, i=4 
		
		return arrayOfInts;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	


}
