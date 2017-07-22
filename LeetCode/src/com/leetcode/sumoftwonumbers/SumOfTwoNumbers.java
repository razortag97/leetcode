package com.leetcode.sumoftwonumbers;

import java.util.ArrayList;
import java.util.HashMap;

public class SumOfTwoNumbers {
	
    public int[] twoSum(int[] numbers, int target) {
        
        HashMap<Integer, ArrayList<Integer>> uniqueNumberTable = new HashMap<Integer, ArrayList<Integer>>();
        int[] indexes = new int[2];
        
        indexes[0]=-1;
        indexes[1]=-1;
        
        for(int i=0; i<=numbers.length-1; i++){
            
            int currentValue = numbers[i];
            System.out.println("Current Value: " + currentValue);
            int currentIndex = i;
            
            if(uniqueNumberTable.containsKey(currentValue)){
                ArrayList<Integer> uniqueNumberIndexList =  uniqueNumberTable.get(currentValue);
                uniqueNumberIndexList.add(currentIndex);
                uniqueNumberTable.put(currentValue, uniqueNumberIndexList);
            }else{
                ArrayList<Integer> uniqueNumberIndexList = new ArrayList<Integer>();
                uniqueNumberIndexList.add(currentIndex);
                uniqueNumberTable.put(currentValue, uniqueNumberIndexList);
            }
            
            System.out.println("Added: " + currentValue + " at Index: " + currentIndex);
            
            if(i== 0){
                continue;
            }
            
            int residue = target - currentValue;
            System.out.println("Checking if residue : " + residue + " exists in the table");
            if(uniqueNumberTable.containsKey(residue)){
            	System.out.println("Residue : " + residue  + " does exist in the table");
                ArrayList<Integer> uniqueNumberIndexList = uniqueNumberTable.get(residue);
                int tempIndex =uniqueNumberIndexList.get(0);
                if(tempIndex != currentIndex){
                    indexes[0]=tempIndex;
                    indexes[1]=currentIndex;
                    break;
                }
            }
        }
        
        return indexes;
    }
    
	public static void main(String[] args) {
		
	}

}
